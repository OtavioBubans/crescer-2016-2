/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5;

import br.com.cwi.crescer.aula5.entidades.Ator;
import br.com.cwi.crescer.aula5.entidades.AtorBean;
import br.com.cwi.crescer.aula5.entidades.Classificacao;
import br.com.cwi.crescer.aula5.entidades.ClassificacaoBean;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author otavio.bubans
 */

@ManagedBean
@ViewScoped
public class CadastroClassificacao {
    
    @EJB
    private ClassificacaoBean classificacaoBean;
    
    private Classificacao classificacao;
    private List<Classificacao> classificacoes;

    @PostConstruct
    public void init() {
        this.classificacao = new Classificacao();
        this.classificacoes = classificacaoBean.findAll();
        
        //this.idioma.sort((a,b)-> a.getIdPessoa().compareTo(b.getIdPessoa()));
    }

    public Classificacao getClassificacao() {
        return classificacao;
        
    }

    public List<Classificacao> getClassificacoes() {
        return classificacoes;
    }
   
    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

   
    public void setAtores(List<Classificacao> classificacoes) {
        this.classificacoes = classificacoes;
    }

    public void adicionar() {
        classificacaoBean.insert(classificacao);
        this.init();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.
                SEVERITY_INFO, "Teste", "teste"));
    }

    
}
