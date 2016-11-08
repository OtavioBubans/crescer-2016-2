using StreetFigther.Dominio;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace StreetFighter.Repositorio
{
    public class PersonagemRepositorio : IPersonagemRepositorio
    {
        public List<Personagem> ListarPersonagens(string filtroNome)
        {
            throw new NotImplementedException();
        }

        public void IncluirPersonagem(Personagem personagem)
        {
            throw new NotImplementedException();
        }

        public void EditarPersonagem(Personagem personagem)
        {
            throw new NotImplementedException();
        }

        public void ExcluirPersonagem(Personagem personagem)
        {
            throw new NotImplementedException();
        }

        public List<Personagem> ListaPersonagens()
        {
            throw new NotImplementedException();
        }


        public string FilterByNome(string nome)
        {
            //throw new NotImplementedException();
            string connectionString =
                ConfigurationManager.ConnectionStrings["StreetFighterConnection"]
                                    .ConnectionString;

            Personagem result = null;

            using (var connection = new SqlConnection(connectionString))
            {
                connection.Open();

                string sql = "SELECT * FROM Personagem WHERE Nome = " + nome;

                var command = new SqlCommand(sql, connection);

                SqlDataReader reader = command.ExecuteReader();

                if (reader.Read())
                {
                    result = ConvertReaderToPersonagen(reader);
                }

                connection.Close();
            }

            return result;

        }
    }
}
