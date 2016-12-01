/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.entidades;

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

}
