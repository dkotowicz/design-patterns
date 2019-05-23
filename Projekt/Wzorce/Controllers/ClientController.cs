using MongoDB.Bson;
using MongoDB.Driver;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Wzorce.Facade;
using Wzorce.Models;

namespace Wzorce.Controllers
{
    public class ClientController : Controller
    {
        private readonly IClientFacade clientFacade;

        public ClientController()
        {
            this.clientFacade = new ClientFacade();
        }
        public ActionResult Index()
        {
            return View(clientFacade.Get_all());
        }
        public ActionResult Details(string id)
        {
            return View(clientFacade.Get_one(id));
        }

        public ActionResult Add()
        {
            return View();
        }
        [HttpPost]
        public ActionResult Add(Client klient)
        {
            clientFacade.Add(klient);
            return RedirectToAction("Index");
        }
        public ActionResult Edit(string id)
        {
            return View(clientFacade.Get_one(id));
        }
        [HttpPost]
        public ActionResult Edit(string id, Client klient)
        {
            clientFacade.Edit(id, klient);
            return RedirectToAction("Index");
        }
        public ActionResult Delete(string id)
        {
            clientFacade.Delete(id);
            return RedirectToAction("Index");
        }
    }
}