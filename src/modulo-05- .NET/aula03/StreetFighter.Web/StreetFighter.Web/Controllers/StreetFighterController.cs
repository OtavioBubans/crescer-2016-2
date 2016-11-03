using StreetFighter.Web.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace StreetFighter.Web.Controllers
{
    public class StreetFighterController : Controller
    {
        // GET: StreetFighter
        public ActionResult Index()
        {
            return View();
        }

    public ActionResult FichaTecnica()
        {
            var fichaTecnica = new FichaTecnicaModel()
            {
                PrimeiraAparicao = "Street Fighter II The World Warrior (1991)",
                Nascimento = Convert.ToDateTime("12/02/1996"),
                Altura = 192,
                Peso = 96,
                TipoSanguineo = "B",
                HabilidadesEspeciais = "Caçar, Eletricidade.",
                Gosta = "Frutas tropicais, Pirarucu, Sua mãe.",
                Desgosta = "Army ants (espécie de formiga).",
                EstiloLuta = "Luta Selvagem autodidata (Army Ants) / Capoeira.",
                Origem = "Brasil (lugar de nascença é provável como sendo Tailândia).",
                FalaVitoria = " Ver você em ação é uma piada!",
                SSF2 = "A selvagem criança da natureza",
                SFA3 = "A animal pessoa amazônica",
                SF4 = "Guerreiro da selva",
                SFA3Stage = "Ramificação do Rio Madeira - pantano, Brasil (ramificação do rio Madeira: talvez possa ser Mato Grosso, ou Tocantins?).",
                SF2Stage = "Bacia do rio Amazonas (Brasil).",
                GolpesEspeciais = " Electric Thunder, Rolling Attack."
            };

            return View(fichaTecnica);
        }


        public ActionResult CadastroPersonagem()
        {
            ListaOrigemPersonagens();
            return View();

        }

        public ActionResult Salvar(CadastroPersonagemModel model)
        {
            ListaOrigemPersonagens();

            if (ModelState.IsValid)
            {
                ViewBag.Mensagem = "Personagem Cadastrado";
                return View("Detalhe", model);
            }
            else
            {
                ModelState.AddModelError("", "Algum campo foi preenchido errado!");
                return View("CadastroPersonagem");
            }
        }

        private void ListaOrigemPersonagens()
        {
            //ViewBag.ListaPersonagens
            ViewData["ListaOrigemPersonagens"] = new List<SelectListItem>()
            {
                new SelectListItem() { Value = "BRA", Text = "Brasil" },
                new SelectListItem() { Value = "ARG", Text = "Argentina" },
                new SelectListItem() { Value = "MEX", Text = "México" },
                new SelectListItem() { Value = "EUA", Text = "Estados Unidos" },
                new SelectListItem() { Value = "CAN", Text = "Canada" },
                new SelectListItem() { Value = "MRD", Text = "Morro da Pedra" },
            };
        }

    }
}