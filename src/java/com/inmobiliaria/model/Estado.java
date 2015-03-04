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
 * Estado generated by hbm2java
 */
@Entity
@Table(name="estado"
    ,catalog="inmobiliaria"
)
public class Estado  implements java.io.Serializable {


     private Integer idEstado;
     private String nombreEstado;
     private Set informacionPrincipals = new HashSet(0);

    public Estado() {
    }

	
    public Estado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }
    public Estado(String nombreEstado, Set informacionPrincipals) {
       this.nombreEstado = nombreEstado;
       this.informacionPrincipals = informacionPrincipals;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_estado", unique=true, nullable=false)
    public Integer getIdEstado() {
        return this.idEstado;
    }
    
    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    
    @Column(name="nombre_estado", nullable=false, length=20)
    public String getNombreEstado() {
        return this.nombreEstado;
    }
    
    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="estado")
    public Set getInformacionPrincipals() {
        return this.informacionPrincipals;
    }
    
    public void setInformacionPrincipals(Set informacionPrincipals) {
        this.informacionPrincipals = informacionPrincipals;
    }




}

