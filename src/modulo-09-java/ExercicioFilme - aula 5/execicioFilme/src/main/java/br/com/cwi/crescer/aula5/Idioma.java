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
@Table(name = "IDIOMA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Idioma.findAll", query = "SELECT i FROM Idioma i")
    , @NamedQuery(name = "Idioma.findByIdidioma", query = "SELECT i FROM Idioma i WHERE i.ididioma = :ididioma")
    , @NamedQuery(name = "Idioma.findByNomeidioma", query = "SELECT i FROM Idioma i WHERE i.nomeidioma = :nomeidioma")})
public class Idioma implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDIDIOMA")
    private BigDecimal ididioma;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMEIDIOMA")
    private String nomeidioma;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idiomaIdidioma")
    private Collection<Filme> filmeCollection;

    public Idioma() {
    }

    public Idioma(BigDecimal ididioma) {
        this.ididioma = ididioma;
    }

    public Idioma(BigDecimal ididioma, String nomeidioma) {
        this.ididioma = ididioma;
        this.nomeidioma = nomeidioma;
    }

    public BigDecimal getIdidioma() {
        return ididioma;
    }

    public void setIdidioma(BigDecimal ididioma) {
        this.ididioma = ididioma;
    }

    public String getNomeidioma() {
        return nomeidioma;
    }

    public void setNomeidioma(String nomeidioma) {
        this.nomeidioma = nomeidioma;
    }

}
