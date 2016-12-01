/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5;

import br.com.cwi.crescer.aula5.entidades.Idioma;
import br.com.cwi.crescer.aula5.entidades.IdiomaBean;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Otávio
 */

@ManagedBean
@ViewScoped
public class CadastroIdioma {
    
    @EJB
    private IdiomaBean idiomaBean;
    
    private Idioma idioma;
    private List<Idioma> idiomas;

    @PostConstruct
    public void init() {
        this.idioma = new Idioma();
        this.idiomas = idiomaBean.findAll();
        this.idiomas.sort((a,b)-> a.getIdidioma().compareTo(b.getIdidioma()));
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public List<Idioma> getIdiomas() {
        return idiomas;
    }

    public void setIdioma(List<Idioma> idiomas) {
        this.idiomas = idiomas;
    }

    public void adicionar() {
        idiomaBean.insert(idioma);
        this.init();
      //  Idioma idioma = new Idioma();
    }

}
    
