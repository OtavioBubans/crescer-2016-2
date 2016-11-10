using Loja.Dominio;
using Loja.Infraestrutura;
using Loja.Repositorio;
using Loja.Web.Servicos;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web; 
using System.Web.Mvc;

namespace Loja.Web.Controllers
{
    public class LoginController : Controller
    {
        // GET: Login
        public ActionResult Index()
        {
            return View();
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Entrar(string email, string senha)
        {
            UsuarioServico usuarioServico = ServicoDeDependencias.MontarUsuarioServico();

            Usuario usuario = usuarioServico.BuscarPorAutenticacao(email, senha);
            
            return null;
        }

        public ActionResult Cadastrar(string login, string senha)
        {
            ServicoDeCriptografia criptografaSenha = new ServicoDeCriptografia();
            string senhaCriptografada = criptografaSenha.Criptografar(senha);

            Usuario usuario = new Usuario(login, senhaCriptografada);

            return null;
        }
    }
}