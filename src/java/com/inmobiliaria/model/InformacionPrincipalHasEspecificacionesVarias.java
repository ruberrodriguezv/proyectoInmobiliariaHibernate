package com.inmobiliaria.model;
// Generated 4/03/2015 12:23:08 PM by Hibernate Tools 4.3.1



/**
 * InformacionPrincipalHasEspecificacionesVarias generated by hbm2java
 */
public class InformacionPrincipalHasEspecificacionesVarias  implements java.io.Serializable {


     private InformacionPrincipalHasEspecificacionesVariasId id;
     private EspecificacionesVarias especificacionesVarias;
     private InformacionPrincipal informacionPrincipal;
     private Opcion opcion;

    public InformacionPrincipalHasEspecificacionesVarias() {
    }

    public InformacionPrincipalHasEspecificacionesVarias(InformacionPrincipalHasEspecificacionesVariasId id, EspecificacionesVarias especificacionesVarias, InformacionPrincipal informacionPrincipal, Opcion opcion) {
       this.id = id;
       this.especificacionesVarias = especificacionesVarias;
       this.informacionPrincipal = informacionPrincipal;
       this.opcion = opcion;
    }
   
    public InformacionPrincipalHasEspecificacionesVariasId getId() {
        return this.id;
    }
    
    public void setId(InformacionPrincipalHasEspecificacionesVariasId id) {
        this.id = id;
    }
    public EspecificacionesVarias getEspecificacionesVarias() {
        return this.especificacionesVarias;
    }
    
    public void setEspecificacionesVarias(EspecificacionesVarias especificacionesVarias) {
        this.especificacionesVarias = especificacionesVarias;
    }
    public InformacionPrincipal getInformacionPrincipal() {
        return this.informacionPrincipal;
    }
    
    public void setInformacionPrincipal(InformacionPrincipal informacionPrincipal) {
        this.informacionPrincipal = informacionPrincipal;
    }
    public Opcion getOpcion() {
        return this.opcion;
    }
    
    public void setOpcion(Opcion opcion) {
        this.opcion = opcion;
    }




}


