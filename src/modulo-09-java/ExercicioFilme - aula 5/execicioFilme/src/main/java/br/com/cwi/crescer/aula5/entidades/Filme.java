/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Otávio
 */
@Entity
@Table(name = "FILME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Filme.findAll", query = "SELECT f FROM Filme f")
    , @NamedQuery(name = "Filme.findByIdfilme", query = "SELECT f FROM Filme f WHERE f.idfilme = :idfilme")
    , @NamedQuery(name = "Filme.findByTitulo", query = "SELECT f FROM Filme f WHERE f.titulo = :titulo")
    , @NamedQuery(name = "Filme.findByDiretor", query = "SELECT f FROM Filme f WHERE f.diretor = :diretor")
    , @NamedQuery(name = "Filme.findByDatalancamento", query = "SELECT f FROM Filme f WHERE f.datalancamento = :datalancamento")})
public class Filme implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDFILME")
    private BigDecimal idfilme;
   
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "TITULO")
    private String titulo;
   
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DIRETOR")
    private String diretor;
    @Column(name = "DATALANCAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datalancamento;
  
    @JoinColumn(name = "CLASSIFICACAO_IDCLASSIFICACAO", referencedColumnName = "IDCLASSIFICACAO")
    @ManyToOne(optional = false)
    private Classificacao classificacaoIdclassificacao;
    @JoinColumn(name = "ELENCO_IDELENCO", referencedColumnName = "IDELENCO")
    @ManyToOne(optional = false)
    private Elenco elencoIdelenco;
    
    @JoinColumn(name = "GENERO_IDGENERO", referencedColumnName = "IDGENERO")
    @ManyToOne(optional = false)
    private Genero generoIdgenero;
    @JoinColumn(name = "IDIOMA_IDIDIOMA", referencedColumnName = "IDIDIOMA")
    @ManyToOne(optional = false)
    private Idioma idiomaIdidioma;

    public Filme() {
    }

    public Filme(BigDecimal idfilme) {
        this.idfilme = idfilme;
    }

    public Filme(BigDecimal idfilme, String titulo, String diretor) {
        this.idfilme = idfilme;
        this.titulo = titulo;
        this.diretor = diretor;
    }

    public BigDecimal getIdfilme() {
        return idfilme;
    }

    public void setIdfilme(BigDecimal idfilme) {
        this.idfilme = idfilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Date getDatalancamento() {
        return datalancamento;
    }

    public void setDatalancamento(Date datalancamento) {
        this.datalancamento = datalancamento;
    }

    public Classificacao getClassificacaoIdclassificacao() {
        return classificacaoIdclassificacao;
    }

    public void setClassificacaoIdclassificacao(Classificacao classificacaoIdclassificacao) {
        this.classificacaoIdclassificacao = classificacaoIdclassificacao;
    }

    public Elenco getElencoIdelenco() {
        return elencoIdelenco;
    }

    public void setElencoIdelenco(Elenco elencoIdelenco) {
        this.elencoIdelenco = elencoIdelenco;
    }

    public Genero getGeneroIdgenero() {
        return generoIdgenero;
    }

    public void setGeneroIdgenero(Genero generoIdgenero) {
        this.generoIdgenero = generoIdgenero;
    }

    public Idioma getIdiomaIdidioma() {
        return idiomaIdidioma;
    }

    public void setIdiomaIdidioma(Idioma idiomaIdidioma) {
        this.idiomaIdidioma = idiomaIdidioma;
    }

}
