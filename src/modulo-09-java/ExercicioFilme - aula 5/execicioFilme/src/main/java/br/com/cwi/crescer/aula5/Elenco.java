/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ELENCO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Elenco.findAll", query = "SELECT e FROM Elenco e")
    , @NamedQuery(name = "Elenco.findByIdelenco", query = "SELECT e FROM Elenco e WHERE e.idelenco = :idelenco")
    , @NamedQuery(name = "Elenco.findByNomeelenco", query = "SELECT e FROM Elenco e WHERE e.nomeelenco = :nomeelenco")})
public class Elenco implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDELENCO")
    private BigDecimal idElenco;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMEELENCO")
    private String nomeelenco;
   
    @JoinColumn(name = "ATOR_IDATOR", referencedColumnName = "IDATOR")
    @ManyToOne(optional = false)
    private Ator atorIdAtor;


    public Elenco() {
    }

    public Elenco(BigDecimal idelenco) {
        this.idElenco = idelenco;
    }

    public Elenco(BigDecimal idelenco, String nomeelenco) {
        this.idElenco = idelenco;
        this.nomeelenco = nomeelenco;
    }

    public BigDecimal getIdelenco() {
        return idElenco;
    }

    public void setIdelenco(BigDecimal idElenco) {
        this.idElenco = idElenco;
    }

    public String getNomeElenco() {
        return nomeelenco;
    }

    public void setNomeElenco(String nomeElenco) {
        this.nomeelenco = nomeElenco;
    }

    public Ator getAtorIdator() {
        return atorIdAtor;
    }

    public void setAtorIdAtor(Ator atorIdAtor) {
        this.atorIdAtor = atorIdAtor;
    }
    
}
