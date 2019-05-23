using RDotNet;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Wzorce.Adapters
{
    public class PNGAdapter
    {
        public void SavePNG(List<string> kategorii)
        {
            string fileName;
            REngine.SetEnvironmentVariables();
            REngine engine = REngine.GetInstance();

            fileName = @"C:\Users\Daria\Desktop\kategorii.png";
            CharacterVector fileNameVector = engine.CreateCharacterVector(new[] { fileName });
            engine.SetSymbol("fileName", fileNameVector);

            CharacterVector kategorii_read = engine.CreateCharacterVector(kategorii);
            engine.SetSymbol("data", kategorii_read);
            engine.Evaluate("png(filename=fileName, width=800, height=600)");
            engine.Evaluate("barplot(sort(table(data), decreasing = T), main = 'Kategorie książek', ylab = 'Liczba', col = 'steelblue', border = NA, las=2)");
            engine.Evaluate("dev.off()");
        }
    }
}