/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Otávio
 */
@Entity
@Table(name = "CLASSIFICACAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Classificacao.findAll", query = "SELECT c FROM Classificacao c")
    , @NamedQuery(name = "Classificacao.findByIdclassificacao", query = "SELECT c FROM Classificacao c WHERE c.idclassificacao = :idclassificacao")
    , @NamedQuery(name = "Classificacao.findByDescricao", query = "SELECT c FROM Classificacao c WHERE c.descricao = :descricao")
    , @NamedQuery(name = "Classificacao.findByIdade", query = "SELECT c FROM Classificacao c WHERE c.idade = :idade")})
public class Classificacao implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCLASSIFICACAO")
    private BigDecimal idclassificacao;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRICAO")
    private String descricao;
   
    @Column(name = "IDADE")
    private BigInteger idade;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "classificacaoIdclassificacao")
    private Collection<Filme> filmeCollection;

    public Classificacao() {
    }

    public Classificacao(BigDecimal idclassificacao) {
        this.idclassificacao = idclassificacao;
    }

    public Classificacao(BigDecimal idclassificacao, String descricao) {
        this.idclassificacao = idclassificacao;
        this.descricao = descricao;
    }

    public BigDecimal getIdclassificacao() {
        return idclassificacao;
    }

    public void setIdclassificacao(BigDecimal idclassificacao) {
        this.idclassificacao = idclassificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigInteger getIdade() {
        return idade;
    }

    public void setIdade(BigInteger idade) {
        this.idade = idade;
    }

    @XmlTransient
    public Collection<Filme> getFilmeCollection() {
        return filmeCollection;
    }

    public void setFilmeCollection(Collection<Filme> filmeCollection) {
        this.filmeCollection = filmeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclassificacao != null ? idclassificacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Classificacao)) {
            return false;
        }
        Classificacao other = (Classificacao) object;
        if ((this.idclassificacao == null && other.idclassificacao != null) || (this.idclassificacao != null && !this.idclassificacao.equals(other.idclassificacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.cwi.crescer.aula5.Classificacao[ idclassificacao=" + idclassificacao + " ]";
    }
    
}
