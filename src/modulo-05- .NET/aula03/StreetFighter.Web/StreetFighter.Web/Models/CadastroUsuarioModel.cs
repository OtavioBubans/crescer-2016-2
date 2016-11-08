using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace StreetFighter.Web.Models
{
    public class CadastroUsuarioModel
    {
        public string Login { get; set; }
        public string Senha { get; set; }
        public string Email { get; set; }
    }
}