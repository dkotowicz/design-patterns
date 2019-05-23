using RDotNet;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Wzorce.Adapters
{
    public class PDFAdapter
    {
        public void SavePDF(List<string> kategorii)
        {
            string fileName;
            REngine.SetEnvironmentVariables();
            REngine engine = REngine.GetInstance();

            fileName = @"C:\Users\Daria\Desktop\kategorii.pdf";
            CharacterVector fileNameVector = engine.CreateCharacterVector(new[] { fileName });
            engine.SetSymbol("fileName", fileNameVector);

            CharacterVector kategorii_read = engine.CreateCharacterVector(kategorii);
            engine.SetSymbol("data", kategorii_read);
            engine.Evaluate("pdf(file=fileName,paper='special') ");
            engine.Evaluate("barplot(sort(table(data), decreasing = T), main = 'Kategorie książek', ylab = 'Liczba', col = 'steelblue', border = NA, las=2)");
            engine.Evaluate("dev.off()");
        }
    }
}