package com.inmobiliaria.model;
// Generated 4/03/2015 12:23:08 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cocina generated by hbm2java
 */
public class Cocina  implements java.io.Serializable {


     private Integer idCocina;
     private String nombreCocina;
     private Set<InformacionPrincipal> informacionPrincipals = new HashSet<InformacionPrincipal>(0);

    public Cocina() {
    }

	
    public Cocina(String nombreCocina) {
        this.nombreCocina = nombreCocina;
    }
    public Cocina(String nombreCocina, Set<InformacionPrincipal> informacionPrincipals) {
       this.nombreCocina = nombreCocina;
       this.informacionPrincipals = informacionPrincipals;
    }
   
    public Integer getIdCocina() {
        return this.idCocina;
    }
    
    public void setIdCocina(Integer idCocina) {
        this.idCocina = idCocina;
    }
    public String getNombreCocina() {
        return this.nombreCocina;
    }
    
    public void setNombreCocina(String nombreCocina) {
        this.nombreCocina = nombreCocina;
    }
    public Set<InformacionPrincipal> getInformacionPrincipals() {
        return this.informacionPrincipals;
    }
    
    public void setInformacionPrincipals(Set<InformacionPrincipal> informacionPrincipals) {
        this.informacionPrincipals = informacionPrincipals;
    }




}


