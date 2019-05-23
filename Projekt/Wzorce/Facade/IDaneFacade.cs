using MongoDB.Driver;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using Wzorce.Models;

namespace Wzorce.Facade
{
    public interface IDaneFacade
    {
        MongoClient GetMongoClient();
        IMongoCollection<Dane_kontaktowe> GetMongoCollection();
        List<Dane_kontaktowe> Get_all();
        Dane_kontaktowe Get_one(String id);
        void Edit(String id, Dane_kontaktowe dane);
    }
}