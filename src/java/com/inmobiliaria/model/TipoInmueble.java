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
 * TipoInmueble generated by hbm2java
 */
@Entity
@Table(name="tipo_inmueble"
    ,catalog="inmobiliaria"
)
public class TipoInmueble  implements java.io.Serializable {


     private Integer idTipoInmueble;
     private String nombreTipoInmueble;
     private Set informacionPrincipals = new HashSet(0);

    public TipoInmueble() {
    }

	
    public TipoInmueble(String nombreTipoInmueble) {
        this.nombreTipoInmueble = nombreTipoInmueble;
    }
    public TipoInmueble(String nombreTipoInmueble, Set informacionPrincipals) {
       this.nombreTipoInmueble = nombreTipoInmueble;
       this.informacionPrincipals = informacionPrincipals;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_tipo_inmueble", unique=true, nullable=false)
    public Integer getIdTipoInmueble() {
        return this.idTipoInmueble;
    }
    
    public void setIdTipoInmueble(Integer idTipoInmueble) {
        this.idTipoInmueble = idTipoInmueble;
    }

    
    @Column(name="nombre_tipo_inmueble", nullable=false, length=45)
    public String getNombreTipoInmueble() {
        return this.nombreTipoInmueble;
    }
    
    public void setNombreTipoInmueble(String nombreTipoInmueble) {
        this.nombreTipoInmueble = nombreTipoInmueble;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tipoInmueble")
    public Set getInformacionPrincipals() {
        return this.informacionPrincipals;
    }
    
    public void setInformacionPrincipals(Set informacionPrincipals) {
        this.informacionPrincipals = informacionPrincipals;
    }




}

