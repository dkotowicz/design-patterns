using MongoDB.Driver;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using Wzorce.Models;

namespace Wzorce.Facade
{
    public interface IKsiazkaFacade
    {
        MongoClient GetMongoClient();
        IMongoCollection<Ksiazka> GetMongoCollection();
        List<Ksiazka> Get_all();
        Ksiazka Get_one(String id);
        void Edit(String id, Ksiazka ksiazka);
        void PlotPDF();
        void PlotPNG();
        void Delete(String id);
        String Clone(String id);
        void Add(Ksiazka ksiazka);
    }
}