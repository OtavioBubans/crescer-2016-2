using System;
using System.Collections.Generic;
using System.Configuration;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.RepositorioEntityFrameWork
{
    public abstract class BaseRepositoryEntitityFrameWork
    {

        protected string ConnectionString
        {
            get
            {
                return ConfigurationManager.ConnectionStrings["Crescer16"].ConnectionString;



            }
        }


    }
}
