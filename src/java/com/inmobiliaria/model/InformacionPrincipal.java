package com.inmobiliaria.model;
// Generated 4/03/2015 12:23:08 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * InformacionPrincipal generated by hbm2java
 */
public class InformacionPrincipal  implements java.io.Serializable {


     private Integer idInformacionPrincipal;
     private Ciudad ciudad;
     private Cocina cocina;
     private Condicion condicion;
     private Departamento departamento;
     private Estado estado;
     private Estrato estrato;
     private Garaje garaje;
     private NumeroAlcobas numeroAlcobas;
     private NumeroBanios numeroBanios;
     private NumeroPlantas numeroPlantas;
     private Parqueadero parqueadero;
     private RangoPreciosAjustado rangoPreciosAjustado;
     private TiempoConstruido tiempoConstruido;
     private TipoInmueble tipoInmueble;
     private TipoOperacion tipoOperacion;
     private TipoPropiedad tipoPropiedad;
     private Usuario usuario;
     private Zona zona;
     private Date fechaRegistroEvento;
     private String enlaceImagen;
     private Set<InformacionPrincipalHasEspecificacionesVarias> informacionPrincipalHasEspecificacionesVariases = new HashSet<InformacionPrincipalHasEspecificacionesVarias>(0);

    public InformacionPrincipal() {
    }

	
    public InformacionPrincipal(Ciudad ciudad, Cocina cocina, Condicion condicion, Departamento departamento, Estado estado, Estrato estrato, Garaje garaje, NumeroAlcobas numeroAlcobas, NumeroBanios numeroBanios, NumeroPlantas numeroPlantas, Parqueadero parqueadero, RangoPreciosAjustado rangoPreciosAjustado, TiempoConstruido tiempoConstruido, TipoInmueble tipoInmueble, TipoOperacion tipoOperacion, TipoPropiedad tipoPropiedad, Usuario usuario, Zona zona, Date fechaRegistroEvento, String enlaceImagen) {
        this.ciudad = ciudad;
        this.cocina = cocina;
        this.condicion = condicion;
        this.departamento = departamento;
        this.estado = estado;
        this.estrato = estrato;
        this.garaje = garaje;
        this.numeroAlcobas = numeroAlcobas;
        this.numeroBanios = numeroBanios;
        this.numeroPlantas = numeroPlantas;
        this.parqueadero = parqueadero;
        this.rangoPreciosAjustado = rangoPreciosAjustado;
        this.tiempoConstruido = tiempoConstruido;
        this.tipoInmueble = tipoInmueble;
        this.tipoOperacion = tipoOperacion;
        this.tipoPropiedad = tipoPropiedad;
        this.usuario = usuario;
        this.zona = zona;
        this.fechaRegistroEvento = fechaRegistroEvento;
        this.enlaceImagen = enlaceImagen;
    }
    public InformacionPrincipal(Ciudad ciudad, Cocina cocina, Condicion condicion, Departamento departamento, Estado estado, Estrato estrato, Garaje garaje, NumeroAlcobas numeroAlcobas, NumeroBanios numeroBanios, NumeroPlantas numeroPlantas, Parqueadero parqueadero, RangoPreciosAjustado rangoPreciosAjustado, TiempoConstruido tiempoConstruido, TipoInmueble tipoInmueble, TipoOperacion tipoOperacion, TipoPropiedad tipoPropiedad, Usuario usuario, Zona zona, Date fechaRegistroEvento, String enlaceImagen, Set<InformacionPrincipalHasEspecificacionesVarias> informacionPrincipalHasEspecificacionesVariases) {
       this.ciudad = ciudad;
       this.cocina = cocina;
       this.condicion = condicion;
       this.departamento = departamento;
       this.estado = estado;
       this.estrato = estrato;
       this.garaje = garaje;
       this.numeroAlcobas = numeroAlcobas;
       this.numeroBanios = numeroBanios;
       this.numeroPlantas = numeroPlantas;
       this.parqueadero = parqueadero;
       this.rangoPreciosAjustado = rangoPreciosAjustado;
       this.tiempoConstruido = tiempoConstruido;
       this.tipoInmueble = tipoInmueble;
       this.tipoOperacion = tipoOperacion;
       this.tipoPropiedad = tipoPropiedad;
       this.usuario = usuario;
       this.zona = zona;
       this.fechaRegistroEvento = fechaRegistroEvento;
       this.enlaceImagen = enlaceImagen;
       this.informacionPrincipalHasEspecificacionesVariases = informacionPrincipalHasEspecificacionesVariases;
    }
   
    public Integer getIdInformacionPrincipal() {
        return this.idInformacionPrincipal;
    }
    
    public void setIdInformacionPrincipal(Integer idInformacionPrincipal) {
        this.idInformacionPrincipal = idInformacionPrincipal;
    }
    public Ciudad getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    public Cocina getCocina() {
        return this.cocina;
    }
    
    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }
    public Condicion getCondicion() {
        return this.condicion;
    }
    
    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public Estado getEstado() {
        return this.estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public Estrato getEstrato() {
        return this.estrato;
    }
    
    public void setEstrato(Estrato estrato) {
        this.estrato = estrato;
    }
    public Garaje getGaraje() {
        return this.garaje;
    }
    
    public void setGaraje(Garaje garaje) {
        this.garaje = garaje;
    }
    public NumeroAlcobas getNumeroAlcobas() {
        return this.numeroAlcobas;
    }
    
    public void setNumeroAlcobas(NumeroAlcobas numeroAlcobas) {
        this.numeroAlcobas = numeroAlcobas;
    }
    public NumeroBanios getNumeroBanios() {
        return this.numeroBanios;
    }
    
    public void setNumeroBanios(NumeroBanios numeroBanios) {
        this.numeroBanios = numeroBanios;
    }
    public NumeroPlantas getNumeroPlantas() {
        return this.numeroPlantas;
    }
    
    public void setNumeroPlantas(NumeroPlantas numeroPlantas) {
        this.numeroPlantas = numeroPlantas;
    }
    public Parqueadero getParqueadero() {
        return this.parqueadero;
    }
    
    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }
    public RangoPreciosAjustado getRangoPreciosAjustado() {
        return this.rangoPreciosAjustado;
    }
    
    public void setRangoPreciosAjustado(RangoPreciosAjustado rangoPreciosAjustado) {
        this.rangoPreciosAjustado = rangoPreciosAjustado;
    }
    public TiempoConstruido getTiempoConstruido() {
        return this.tiempoConstruido;
    }
    
    public void setTiempoConstruido(TiempoConstruido tiempoConstruido) {
        this.tiempoConstruido = tiempoConstruido;
    }
    public TipoInmueble getTipoInmueble() {
        return this.tipoInmueble;
    }
    
    public void setTipoInmueble(TipoInmueble tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }
    public TipoOperacion getTipoOperacion() {
        return this.tipoOperacion;
    }
    
    public void setTipoOperacion(TipoOperacion tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }
    public TipoPropiedad getTipoPropiedad() {
        return this.tipoPropiedad;
    }
    
    public void setTipoPropiedad(TipoPropiedad tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Zona getZona() {
        return this.zona;
    }
    
    public void setZona(Zona zona) {
        this.zona = zona;
    }
    public Date getFechaRegistroEvento() {
        return this.fechaRegistroEvento;
    }
    
    public void setFechaRegistroEvento(Date fechaRegistroEvento) {
        this.fechaRegistroEvento = fechaRegistroEvento;
    }
    public String getEnlaceImagen() {
        return this.enlaceImagen;
    }
    
    public void setEnlaceImagen(String enlaceImagen) {
        this.enlaceImagen = enlaceImagen;
    }
    public Set<InformacionPrincipalHasEspecificacionesVarias> getInformacionPrincipalHasEspecificacionesVariases() {
        return this.informacionPrincipalHasEspecificacionesVariases;
    }
    
    public void setInformacionPrincipalHasEspecificacionesVariases(Set<InformacionPrincipalHasEspecificacionesVarias> informacionPrincipalHasEspecificacionesVariases) {
        this.informacionPrincipalHasEspecificacionesVariases = informacionPrincipalHasEspecificacionesVariases;
    }




}


