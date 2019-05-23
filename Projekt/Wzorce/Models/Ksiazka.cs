using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.IO;
using System.Linq;
using System.Runtime.Serialization.Formatters.Binary;
using System.Web;
using Wzorce.Prototype;

namespace Wzorce.Models
{
    [Serializable]
    public class Ksiazka : KsiazkaPrototype<Ksiazka> {
        [BsonId]
        public ObjectId _id { get; set; }
        [DisplayName("Nazwa")]
        public string Nazwa { get; set; }
        [DisplayName("Rok premiery")]
        public int Rok_produkcji { get; set; }
        [DisplayName("Liczba stron")]
        public int Liczba_stron { get; set; }
        [DisplayName("Cena")]
        public double Cena { get; set; }
        [DisplayName("Okładka")]
        public Okladka Okladka { get; set; }
        [DisplayName("Kategoria")]
        public Kategoria Kategoria { get; set; }
        [DisplayName("Nowość")]
        public bool Nowosc { get; set; }
        public String Link { get; set; }
        public List<Ksiazka> ksiazki_list = new List<Ksiazka>();

    }
}