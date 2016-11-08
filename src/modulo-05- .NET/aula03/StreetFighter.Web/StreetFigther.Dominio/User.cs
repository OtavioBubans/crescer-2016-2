using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFigther.Dominio
{
    public class User
    {
        public int Id { get; set; }

        public string Name { get; set; }

        public string Password { get; set; }

        public string Email { get; set; }

        public DateTime DataCriacao { get; set; }

        public bool IsActive { get; set; }

        public UserRole Role { get; set; }
    }
}
