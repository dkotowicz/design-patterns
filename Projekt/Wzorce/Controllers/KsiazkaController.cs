using MongoDB.Bson;
using MongoDB.Driver;
using RDotNet;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Mail;
using System.Web;
using System.Web.Mvc;
using Wzorce.Adapters;
using Wzorce.Facade;
using Wzorce.Models;
using Wzorce.Prototype;

namespace Wzorce.Controllers
{
    public class KsiazkaController : Controller
    {
        private readonly IKsiazkaFacade ksiazkaFacade;

        public KsiazkaController()
        {
            this.ksiazkaFacade = new KsiazkaFacade();
        }
        public ActionResult Index()
        {
            return View(ksiazkaFacade.Get_all());
        }

        public ActionResult PlotPNG()
        {
            ksiazkaFacade.PlotPNG();
            return RedirectToAction("Index");
        }
        public ActionResult PlotPDF()
        {
            ksiazkaFacade.PlotPDF();
            return RedirectToAction("Index");
        }

        public ActionResult Details(string id)
        {
            return View(ksiazkaFacade.Get_one(id));
        }
        public ActionResult Add()
        {
            return View();
        }
        [HttpPost]
        public ActionResult Add(Ksiazka ksiazka)
        {
            ksiazkaFacade.Add(ksiazka);
            return RedirectToAction("Index");
        }
        public ActionResult Delete(string id)
        {
            ksiazkaFacade.Delete(id);
            return RedirectToAction("Index");
        }
        public ActionResult Clone(string id)
        {
            var idCloned = ksiazkaFacade.Clone(id);
            return RedirectToAction("Edit", new { id = idCloned });
        }
        public ActionResult Edit(string id)
        {
            return View(ksiazkaFacade.Get_one(id));
        }
        [HttpPost]
        public ActionResult Edit(string id, Ksiazka ksiazka)
        {
            ksiazkaFacade.Edit(id, ksiazka);
            return RedirectToAction("Index");
        }
    }
}