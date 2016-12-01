/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Otávio
 */
@Entity
@Table(name = "IDIOMA")

public class Idioma implements Serializable {

   @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_IDIOMA")
    @SequenceGenerator(name = "SEQ_IDIOMA", sequenceName = "SEQ_IDIOMA", allocationSize = 1)
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_IDIOMA")
    private BigDecimal ididioma;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMEIDIOMA")
    private String nomeidioma;
   
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
