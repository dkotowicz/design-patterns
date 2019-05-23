using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using Wzorce.Adapters;
using Wzorce.Models;

namespace Wzorce
{
    public class Adapter
    {
        public Adapter(PDFAdapter pdf, List<string> kategorii)
        {
            pdf.SavePDF(kategorii);
        }
        public Adapter(PNGAdapter png, List<string> kategorii)
        {
            png.SavePNG(kategorii);
        }
    }
}