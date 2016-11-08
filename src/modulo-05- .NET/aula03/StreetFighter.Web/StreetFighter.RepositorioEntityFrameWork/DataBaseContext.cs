using StreetFighter.RepositorioEntityFrameWork;
using StreetFigther.Dominio;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Data.Entity.ModelConfiguration.Conventions;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.RepositorioEntityFrameWork
{
    public class DataBaseContext :DbContext
    {

        public DataBaseContext() :base("Crescer16")
        {
        }

        public DbSet<User> User { get; set; }
        public DbSet<UserRole> UserRole { get; set; }

        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            modelBuilder.Conventions.Remove<PluralizingTableNameConvention>();
            base.OnModelCreating(modelBuilder);
        }
    }
}
