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
    public class DaneController : Controller
    {
        private readonly IDaneFacade daneFacade;
        public DaneController()
        {
            this.daneFacade = new DaneFacade();
        }
        public ActionResult Index()
        {
            return View(daneFacade.Get_all());
        }
        public ActionResult Details()
        {
            return View(daneFacade.Get_one(null));
        }
        public ActionResult Edit(string id)
        {
            return View(daneFacade.Get_one(id));
        }
        [HttpPost]
        public ActionResult Edit(string id, Dane_kontaktowe dane)
        {
            daneFacade.Edit(id,dane);
            return RedirectToAction("Details");
        }
    }
}