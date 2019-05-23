using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Wzorce.Obserwator
{
    public interface ISubject
    {
        void NotifyObservers();
    }
}