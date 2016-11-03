using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFigther.Dominio
{
    public interface IPersonagemRepositorio
    {
        List<Personagem> ListaPersonagens();
        void IncluirPersonagem(Personagem personagem);
        void EditarPersonagem(Personagem personagem);
        void ExcluirPersonagem(Personagem personagem);
    }
}
