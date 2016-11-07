using StreetFigther.Dominio;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data.SqlClient;
using System.Linq;
using System.Transactions;
using System.Web;

namespace StreetFighter.Web
{
    public class PersonagemRepositorio
    {

        public void FilterByPersonagem()
        {
            string connectionString =
                ConfigurationManager.ConnectionStrings["Personagem"]
                .ConnectionString;


            using ( var transaction = new TransactionScope(TransactionScopeOption.Required))
            using (var connection = new SqlConnection(connectionString))
            {

                connection.Open();

            }

        }



        private Personagem ConvertToPersonagem(SqlDataReader reader)
        {
            int idRow = Convert.ToInt32(reader["ID"]);
            string PersonagemRow = reader["Personagem"].ToString();

            return null;
           
        }



    }
}