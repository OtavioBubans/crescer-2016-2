using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace StreetFighter.Web.Models
{
    public class CadastroPersonagemModel
    {
        [Required]
        public string Nome { get; set; }

        [Required]
        [DisplayName("Data de Nascimento")]
        public DateTime DataNascimento { get; set; }

        [Required]
        public int Altura { get; set; }

        [Required]
        public int Peso { get; set; }

        [DisplayName("País de Origem")]
        public int IdPaisOrigem { get; set; }

        [Required]
        public string GolpesEspeciais { get; set; }

        public bool PersonagemOculto { get; set; }

        [DisplayName("Link da Imagem")]
        public string Imagem { get; set; }






    }
}