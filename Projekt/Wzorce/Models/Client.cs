using MongoDB.Bson;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Net;
using System.Net.Mail;
using System.Web;
using Wzorce.Obserwator;

namespace Wzorce.Models
{
    public class Client : IObserver
    {
        public ObjectId _id { get; set; }
        [DisplayName("Nazwisko")]
        public String Nazwisko { get; set; }
        [DisplayName("Imie")]
        public String Imie { get; set; }
        [DisplayName("Email")]
        public String Email { get; set; }
        [DisplayName("Nr telefonu")]
        public String Nr_telefonu { get; set; }
        [DisplayName("Data urodzenia")]
        public String Data_urodzenia { get; set; }

        public Client(String Nazwisko, String Imie)
        {
            this.Nazwisko = Nazwisko;
            this.Imie = Imie;
        }
        public Client()
        {

        }
        public void Update()
        {
            String body = "Hej, " + Imie + " \n Dodana nowa książka w naszym sklepie";
            string to = Email;

            MailMessage message = new MailMessage("dkotnet@gmail.com", Email, "Księgarnia - powiadomienie", body)
            {
                IsBodyHtml = true
            };
            SmtpClient client = new SmtpClient("smtp.gmail.com", 587)
            {
                EnableSsl = true,
                Credentials = new NetworkCredential("dkotnet@gmail.com", "3135358Dasha!")
            };
            client.Send(message);
        }
    }
}