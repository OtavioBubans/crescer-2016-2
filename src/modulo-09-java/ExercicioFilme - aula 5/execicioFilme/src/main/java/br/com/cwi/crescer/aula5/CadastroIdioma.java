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
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Otávio
 */
public class CadastroIdioma {
    
     @EJB
    private IdiomaBean idiomaBean;
    
    private Idioma idioma;
    private List<Idioma> idiomas;

    @PostConstruct
    public void init() {
        this.idioma = new Idioma();
        this.idiomas = idiomaBean.findAll();
        
        //this.idioma.sort((a,b)-> a.getIdPessoa().compareTo(b.getIdPessoa()));
    }

    public Idioma getPessoa() {
        return idioma;
    }

    public void setPessoa(Idioma idioma) {
        this.idioma = idioma;
    }

    public List<Idioma> getPessoas() {
        return idiomas;
    }

    public void setPessoas(List<Idioma> idiomas) {
        this.idiomas = idiomas;
    }

    public void adicionar() {
        idiomaBean.insert(idioma);
        this.init();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.
                SEVERITY_INFO, "Teste", "teste"));
    }

}
    
