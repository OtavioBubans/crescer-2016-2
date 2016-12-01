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
@Table(name = "ATOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ator.findAll", query = "SELECT a FROM Ator a")
    , @NamedQuery(name = "Ator.findByIdator", query = "SELECT a FROM Ator a WHERE a.idator = :idator")
    , @NamedQuery(name = "Ator.findByNomeator", query = "SELECT a FROM Ator a WHERE a.nomeator = :nomeator")})
public class Ator implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDATOR")
    private BigDecimal idator;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMEATOR")
    private String nomeator;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "atorIdator")
    private Collection<Elenco> elencoCollection;

    public Ator() {
    }

    public Ator(BigDecimal idator) {
        this.idator = idator;
    }

    public Ator(BigDecimal idator, String nomeator) {
        this.idator = idator;
        this.nomeator = nomeator;
    }

    public BigDecimal getIdator() {
        return idator;
    }

    public void setIdator(BigDecimal idator) {
        this.idator = idator;
    }

    public String getNomeator() {
        return nomeator;
    }

    public void setNomeator(String nomeator) {
        this.nomeator = nomeator;
    }

    @XmlTransient
    public Collection<Elenco> getElencoCollection() {
        return elencoCollection;
    }

    public void setElencoCollection(Collection<Elenco> elencoCollection) {
        this.elencoCollection = elencoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idator != null ? idator.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ator)) {
            return false;
        }
        Ator other = (Ator) object;
        if ((this.idator == null && other.idator != null) || (this.idator != null && !this.idator.equals(other.idator))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.cwi.crescer.aula5.Ator[ idator=" + idator + " ]";
    }
    
}
