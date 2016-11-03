using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace StreetFighter.Web.Models
{
    public class FichaTecnicaModel
    {
        public string PrimeiraAparicao { get; set; }
        public DateTime Nascimento { get; set; }
        public int Altura { get; set; }
        public int Peso { get; set; }
        public string Medidas { get; set; }
        public string TipoSanguineo { get; set; }
        public string HabilidadesEspeciais { get; set; }
        public string Gosta { get; set; }
        public string Desgosta { get; set; }
        public string EstiloLuta { get; set; }
        public string Origem { get; set; }
        public string FalaVitoria { get; set; }
        public string SSF2 { get; set; }
        public string SFA3 { get; set; }
        public string SF4 { get; set; }
        public string SFA3Stage { get; set; }
        public string SF2Stage { get; set; }
        public string GolpesEspeciais { get; set; }

    }
}