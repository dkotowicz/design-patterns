using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Web;

namespace Wzorce.Models
{
    public class Dane_kontaktowe
    {
        [BsonId]
        public ObjectId _id { get; set; }
        [DisplayName("Ulica")]
        public String Ulica { get; set; }
        [DisplayName("Miasto")]
        public String Miasto { get; set; }
        [DisplayName("Nr bloku")]
        public String Nr_bloku { get; set; }
        [DisplayName("Nr telefonu")]
        public String Nr_telefonu { get; set; }
        [DisplayName("Kod pocztowy")]
        public String Kod_pocztowy { get; set; }

        private static readonly Lazy<Dane_kontaktowe> lazy =
        new Lazy<Dane_kontaktowe>(() => new Dane_kontaktowe());

        public static Dane_kontaktowe Instance { get { return lazy.Value; } }
    }
}