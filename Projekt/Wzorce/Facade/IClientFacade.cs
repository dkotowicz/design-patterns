using MongoDB.Driver;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using Wzorce.Models;

namespace Wzorce.Facade
{
    public interface IClientFacade
    {
        MongoClient GetMongoClient();
        IMongoCollection<Client> GetMongoCollection();
        Client Get_one(String id);
        List<Client> Get_all();
        void Edit(String id, Client klient);
        void Add(Client klient);
        void Delete(String id);
    }
}