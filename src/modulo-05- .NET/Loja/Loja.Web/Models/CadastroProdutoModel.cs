using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace Loja.Web.Models
{
    public class CadastroProdutoModel
    {
        [Required]
        public string Nome { get; set; }

        [Required]
        public decimal Valor { get; set; }
    }
}