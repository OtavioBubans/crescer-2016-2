using Loja.Dominio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Repositorio
{
    public class UsuarioRepositorio : IUsuarioRepositorio
    {
        private IList<Usuario> usuario;

        public Usuario BuscarPorEmail(string email)
        {
            using (var context = new ContextoDeDados())
            {
                return context.Usuario.FirstOrDefault(u => u.Email.Equals(email));
            }
        }

        public void AdicionarUsuario(string email, string senha)
        {
            Usuario user = new Usuario(email, senha);
            usuario.Add(user);

        }

       
    }
}
