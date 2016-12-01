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
@Table(name = "GENERO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Genero.findAll", query = "SELECT g FROM Genero g")
    , @NamedQuery(name = "Genero.findByIdgenero", query = "SELECT g FROM Genero g WHERE g.idgenero = :idgenero")
    , @NamedQuery(name = "Genero.findByDescricao", query = "SELECT g FROM Genero g WHERE g.descricao = :descricao")})
public class Genero implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGENERO")
    private BigDecimal idgenero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "generoIdgenero")
    private Collection<Filme> filmeCollection;

    public Genero() {
    }

    public Genero(BigDecimal idgenero) {
        this.idgenero = idgenero;
    }

    public Genero(BigDecimal idgenero, String descricao) {
        this.idgenero = idgenero;
        this.descricao = descricao;
    }

    public BigDecimal getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(BigDecimal idgenero) {
        this.idgenero = idgenero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        hash += (idgenero != null ? idgenero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Genero)) {
            return false;
        }
        Genero other = (Genero) object;
        if ((this.idgenero == null && other.idgenero != null) || (this.idgenero != null && !this.idgenero.equals(other.idgenero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.cwi.crescer.aula5.Genero[ idgenero=" + idgenero + " ]";
    }
    
}
