﻿using StreetFighter.Repositorio;
using StreetFigther.Dominio;
using System.Collections.Generic;

namespace StreetFighter.Aplicativo
{
    public class PersonagemAplicativo
    {
        private readonly IPersonagemRepositorio repositorio;

        public PersonagemAplicativo()
        {
            this.repositorio = new PersonagemRepositorio();
        }

        internal PersonagemAplicativo(IPersonagemRepositorio repositorio)
        {
            this.repositorio = repositorio;
        }

        public List<Personagem> ListarPersonagens(string filtroNome)
        {
            return repositorio.ListarPersonagens(filtroNome);
        }

        public void Salvar(Personagem personagem)
        {
            if (personagem.Id == 0)
                repositorio.IncluirPersonagem(personagem);
            else
                repositorio.EditarPersonagem(personagem);
        }
    }
}
