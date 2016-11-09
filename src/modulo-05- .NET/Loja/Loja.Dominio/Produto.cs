using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Dominio
{
    public class Produto
    {
     //   private List<Produto> ListaProduto = new List();

        public int Id { get; set; }

        public string Nome { get; set; }

        public decimal Valor { get; set; }

    }
}
