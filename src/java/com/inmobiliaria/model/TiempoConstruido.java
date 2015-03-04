package com.inmobiliaria.model;
// Generated 4/03/2015 09:08:20 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TiempoConstruido generated by hbm2java
 */
@Entity
@Table(name="tiempo_construido"
    ,catalog="inmobiliaria"
)
public class TiempoConstruido  implements java.io.Serializable {


     private Integer idTiempoConstruido;
     private String cantidadTiempoConstruido;
     private Set informacionPrincipals = new HashSet(0);

    public TiempoConstruido() {
    }

	
    public TiempoConstruido(String cantidadTiempoConstruido) {
        this.cantidadTiempoConstruido = cantidadTiempoConstruido;
    }
    public TiempoConstruido(String cantidadTiempoConstruido, Set informacionPrincipals) {
       this.cantidadTiempoConstruido = cantidadTiempoConstruido;
       this.informacionPrincipals = informacionPrincipals;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_tiempo_construido", unique=true, nullable=false)
    public Integer getIdTiempoConstruido() {
        return this.idTiempoConstruido;
    }
    
    public void setIdTiempoConstruido(Integer idTiempoConstruido) {
        this.idTiempoConstruido = idTiempoConstruido;
    }

    
    @Column(name="cantidad_tiempo_construido", nullable=false, length=25)
    public String getCantidadTiempoConstruido() {
        return this.cantidadTiempoConstruido;
    }
    
    public void setCantidadTiempoConstruido(String cantidadTiempoConstruido) {
        this.cantidadTiempoConstruido = cantidadTiempoConstruido;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tiempoConstruido")
    public Set getInformacionPrincipals() {
        return this.informacionPrincipals;
    }
    
    public void setInformacionPrincipals(Set informacionPrincipals) {
        this.informacionPrincipals = informacionPrincipals;
    }




}

