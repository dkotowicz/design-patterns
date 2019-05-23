using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using MongoDB.Bson;
using MongoDB.Driver;
using Wzorce.Models;

namespace Wzorce.Facade
{
    public class DaneFacade : IDaneFacade
    {
        public MongoClient GetMongoClient()
        {
            MongoClient client = new MongoClient();
            return client;
        }
        public IMongoCollection<Dane_kontaktowe> GetMongoCollection()
        {
            IMongoCollection<Dane_kontaktowe> coll = GetMongoClient().GetDatabase("Ksiazki_db").GetCollection<Dane_kontaktowe>("dane");
            return coll;
        }
        public void Edit(string id, Dane_kontaktowe dane)
        {
            Dane_kontaktowe daneUpdate = Get_one(null);
            var filter = Builders<Dane_kontaktowe>.Filter.Eq("_id", daneUpdate._id);
            var update = Builders<Dane_kontaktowe>.Update
                .Set("Ulica", dane.Ulica)
                .Set("Miasto", dane.Miasto)
                .Set("Nr_bloku", dane.Nr_bloku)
                .Set("Kod_pocztowy", dane.Kod_pocztowy)
                .Set("Nr_telefonu", dane.Nr_telefonu);
            GetMongoCollection().UpdateOne(filter, update);
        }
        public List<Dane_kontaktowe> Get_all()
        {
            List<Dane_kontaktowe> klienci_all = GetMongoCollection().AsQueryable<Dane_kontaktowe>().ToList();
            return klienci_all;
        }

        public Dane_kontaktowe Get_one(string id)
        {
            Dane_kontaktowe dane = Dane_kontaktowe.Instance;
            if (id!=null)
            {
                var daneId = new ObjectId(id);
                dane = GetMongoCollection().AsQueryable<Dane_kontaktowe>().SingleOrDefault(x => x._id == daneId);
            }
            else
            {
                dane = GetMongoCollection().AsQueryable<Dane_kontaktowe>().FirstOrDefault();
            }
            return dane;
        }
    }
}