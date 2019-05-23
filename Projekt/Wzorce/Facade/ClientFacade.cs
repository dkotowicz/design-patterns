using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using MongoDB.Bson;
using MongoDB.Driver;
using Wzorce.Models;

namespace Wzorce.Facade
{
    public class ClientFacade : IClientFacade
    {
        public void Add(Client klient)
        {
            GetMongoCollection().InsertOne(klient);
        }

        public void Delete(string id)
        {
            GetMongoCollection().DeleteOne(Builders<Client>.Filter.Eq("_id", ObjectId.Parse(id)));
        }

        public void Edit(string id, Client klient)
        {
            var filter = Builders<Client>.Filter.Eq("_id", ObjectId.Parse(id));
            var update = Builders<Client>.Update
                .Set("Nazwisko", klient.Nazwisko)
                .Set("Imie", klient.Imie)
                .Set("Email", klient.Email)
                .Set("Nr_telefonu", klient.Nr_telefonu)
                .Set("Data_urodzenia", klient.Data_urodzenia);
            var result = GetMongoCollection().UpdateOne(filter, update);
        }

        public MongoClient GetMongoClient()
        {
            MongoClient client = new MongoClient();
            return client;
        }

        public IMongoCollection<Client> GetMongoCollection()
        {
            IMongoCollection<Client> coll = GetMongoClient().GetDatabase("Ksiazki_db").GetCollection<Client>("klienci");
            return coll;
        }

        public Client Get_one(string id)
        {
            var klientId = new ObjectId(id);
            Client klient = GetMongoCollection().AsQueryable<Client>().SingleOrDefault(f => f._id == ObjectId.Parse(id));
            return klient;
        }
        public List<Client> Get_all()
        {
            List<Client> klienci_all = GetMongoCollection().AsQueryable<Client>().ToList();
            return klienci_all;
        }
    }
}