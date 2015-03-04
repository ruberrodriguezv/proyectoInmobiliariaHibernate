package com.inmobiliaria.model;
// Generated 4/03/2015 12:23:08 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * NumeroBanios generated by hbm2java
 */
public class NumeroBanios  implements java.io.Serializable {


     private Integer idNumeroBanios;
     private String cantidadBanios;
     private Set<InformacionPrincipal> informacionPrincipals = new HashSet<InformacionPrincipal>(0);

    public NumeroBanios() {
    }

	
    public NumeroBanios(String cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }
    public NumeroBanios(String cantidadBanios, Set<InformacionPrincipal> informacionPrincipals) {
       this.cantidadBanios = cantidadBanios;
       this.informacionPrincipals = informacionPrincipals;
    }
   
    public Integer getIdNumeroBanios() {
        return this.idNumeroBanios;
    }
    
    public void setIdNumeroBanios(Integer idNumeroBanios) {
        this.idNumeroBanios = idNumeroBanios;
    }
    public String getCantidadBanios() {
        return this.cantidadBanios;
    }
    
    public void setCantidadBanios(String cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }
    public Set<InformacionPrincipal> getInformacionPrincipals() {
        return this.informacionPrincipals;
    }
    
    public void setInformacionPrincipals(Set<InformacionPrincipal> informacionPrincipals) {
        this.informacionPrincipals = informacionPrincipals;
    }




}


