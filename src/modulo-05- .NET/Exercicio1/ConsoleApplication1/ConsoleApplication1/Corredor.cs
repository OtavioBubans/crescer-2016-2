using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MarioKart
{
    public interface Corredor
    {
        string Nome { get; }
        Enum Nivel { get; }
    }
}
