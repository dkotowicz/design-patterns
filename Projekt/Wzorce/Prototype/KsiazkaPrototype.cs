using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.Serialization.Formatters.Binary;
using System.Web;
using Wzorce.Models;

namespace Wzorce.Prototype
{
    [Serializable]
    public class KsiazkaPrototype<T>
    {
        public T DeepCopy()
        {
            MemoryStream stream = new MemoryStream();
            BinaryFormatter formatter = new BinaryFormatter();
            formatter.Serialize(stream, this);
            stream.Seek(0, SeekOrigin.Begin);
            T copy = (T)formatter.Deserialize(stream);
            stream.Close();
            return copy;
        }

        public T Clone()
        {
            return (T)this.MemberwiseClone();
        }
    }
}
