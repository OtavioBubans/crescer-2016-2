using StreetFigther.Dominio;
using StreetFighter.RepositorioEntityFrameWork;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;

namespace StreetFighter.RepositorioEntityFrameWork
{
    public class UserRepository : BaseRepositoryEntitityFrameWork, IUserRepository
    {

        public User GetById(int id)
        {
            using (var connection = new SqlConnection(ConnectionString))
            {
                //... 

                return null;
            }
        }


    }
}
