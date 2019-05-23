using MongoDB.Bson;
using MongoDB.Driver;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using Wzorce.Adapters;
using Wzorce.Models;
using Wzorce.Obserwator;

namespace Wzorce.Facade
{
    public class KsiazkaFacade : IKsiazkaFacade, ISubject
    {
        public void Add(Ksiazka ksiazka)
        {
            Random rnd = new Random();
            int link = rnd.Next(1, 50);
            ksiazka.Link = " /Content/okladki/"+link+".jpg";
            GetMongoCollection().InsertOne(ksiazka);
            NotifyObservers();
        }

        public String Clone(string id)
        {
            var ksiazkaId = new ObjectId(id);
            Ksiazka ksiazka = GetMongoCollection().AsQueryable<Ksiazka>().SingleOrDefault(f => f._id == ObjectId.Parse(id));
            Ksiazka ksiazkaClone = ksiazka.DeepCopy();
            //Ksiazka ksiazkaClone = ksiazka.Clone();
            ksiazkaClone._id = ObjectId.GenerateNewId();
            Add(ksiazkaClone);
            NotifyObservers();
            return ksiazkaClone._id.ToString();
        }

        public void Delete(string id)
        {
            GetMongoCollection().DeleteOne(Builders<Ksiazka>.Filter.Eq("_id", ObjectId.Parse(id)));
        }

        public void Edit(string id, Ksiazka ksiazka)
        {
            var filter = Builders<Ksiazka>.Filter.Eq("_id", ObjectId.Parse(id));
            var update = Builders<Ksiazka>.Update
                .Set("Nazwa", ksiazka.Nazwa)
                .Set("Rok_produkcji", ksiazka.Rok_produkcji)
                .Set("Liczba_stron", ksiazka.Liczba_stron)
                .Set("Cena", ksiazka.Cena)
                .Set("Okladka", ksiazka.Okladka)
                .Set("Kategoria", ksiazka.Kategoria)
                .Set("Nowosc", ksiazka.Nowosc);
  
            var result = GetMongoCollection().UpdateOne(filter, update);
        }

        public MongoClient GetMongoClient()
        {
            MongoClient client = new MongoClient();
            return client;
        }
        public IMongoCollection<Ksiazka> GetMongoCollection()
        {
            IMongoCollection<Ksiazka> coll = GetMongoClient().GetDatabase("Ksiazki_db").GetCollection<Ksiazka>("ksiazki");
            return coll;
        }

        public List<Ksiazka> Get_all()
        {
            List<Ksiazka> ksiazki_all = GetMongoCollection().AsQueryable<Ksiazka>().ToList();
            return ksiazki_all;
        }

        public Ksiazka Get_one(string id)
        {
            var ksiazkaId = new ObjectId(id);
            Ksiazka ksiazka = GetMongoCollection().AsQueryable<Ksiazka>().SingleOrDefault(f => f._id == ObjectId.Parse(id));
            return ksiazka;
        }

        public void PlotPDF()
        {
            List<Ksiazka> ksiazki = GetMongoCollection().AsQueryable<Ksiazka>().ToList();
            List<string> kategorii = new List<string>();
            foreach (Ksiazka k in ksiazki)
                kategorii.Add(k.Kategoria.ToString());
            Adapter adapter = new Adapter(new PDFAdapter(), kategorii);
        }

        public void PlotPNG()
        {
            List<Ksiazka> ksiazki = GetMongoCollection().AsQueryable<Ksiazka>().ToList();
            List<string> kategorii = new List<string>();
            foreach (Ksiazka k in ksiazki)
                kategorii.Add(k.Kategoria.ToString());
            Adapter adapter = new Adapter(new PNGAdapter(), kategorii);
        }
        public void NotifyObservers()
        {
            ClientFacade clientFacade = new ClientFacade();
            List<Client> klienci = clientFacade.Get_all();
            foreach (var k in klienci)
            {
                k.Update();
            } 
        }
    }
}