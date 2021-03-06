package com.inmobiliaria.model;
// Generated 4/03/2015 12:23:08 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idUsuario;
     private Ciudad ciudad;
     private Departamento departamento;
     private Genero genero;
     private Roles roles;
     private String nombreUsuario;
     private String apellidoUsuario;
     private Date fechaNacimientoUsuario;
     private String direccionUsuario;
     private String barrioUsuario;
     private String telefonoUsuario;
     private String emailUsuario;
     private String userUsuario;
     private String contraseniaUsuario;
     private Set<InformacionPrincipal> informacionPrincipals = new HashSet<InformacionPrincipal>(0);

    public Usuario() {
    }

	
    public Usuario(Ciudad ciudad, Departamento departamento, Genero genero, Roles roles, String nombreUsuario, String apellidoUsuario, Date fechaNacimientoUsuario, String direccionUsuario, String barrioUsuario, String telefonoUsuario, String emailUsuario, String userUsuario, String contraseniaUsuario) {
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.genero = genero;
        this.roles = roles;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.direccionUsuario = direccionUsuario;
        this.barrioUsuario = barrioUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.emailUsuario = emailUsuario;
        this.userUsuario = userUsuario;
        this.contraseniaUsuario = contraseniaUsuario;
    }
    public Usuario(Ciudad ciudad, Departamento departamento, Genero genero, Roles roles, String nombreUsuario, String apellidoUsuario, Date fechaNacimientoUsuario, String direccionUsuario, String barrioUsuario, String telefonoUsuario, String emailUsuario, String userUsuario, String contraseniaUsuario, Set<InformacionPrincipal> informacionPrincipals) {
       this.ciudad = ciudad;
       this.departamento = departamento;
       this.genero = genero;
       this.roles = roles;
       this.nombreUsuario = nombreUsuario;
       this.apellidoUsuario = apellidoUsuario;
       this.fechaNacimientoUsuario = fechaNacimientoUsuario;
       this.direccionUsuario = direccionUsuario;
       this.barrioUsuario = barrioUsuario;
       this.telefonoUsuario = telefonoUsuario;
       this.emailUsuario = emailUsuario;
       this.userUsuario = userUsuario;
       this.contraseniaUsuario = contraseniaUsuario;
       this.informacionPrincipals = informacionPrincipals;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Ciudad getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public Genero getGenero() {
        return this.genero;
    }
    
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public Roles getRoles() {
        return this.roles;
    }
    
    public void setRoles(Roles roles) {
        this.roles = roles;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getApellidoUsuario() {
        return this.apellidoUsuario;
    }
    
    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }
    public Date getFechaNacimientoUsuario() {
        return this.fechaNacimientoUsuario;
    }
    
    public void setFechaNacimientoUsuario(Date fechaNacimientoUsuario) {
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
    }
    public String getDireccionUsuario() {
        return this.direccionUsuario;
    }
    
    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }
    public String getBarrioUsuario() {
        return this.barrioUsuario;
    }
    
    public void setBarrioUsuario(String barrioUsuario) {
        this.barrioUsuario = barrioUsuario;
    }
    public String getTelefonoUsuario() {
        return this.telefonoUsuario;
    }
    
    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }
    public String getEmailUsuario() {
        return this.emailUsuario;
    }
    
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
    public String getUserUsuario() {
        return this.userUsuario;
    }
    
    public void setUserUsuario(String userUsuario) {
        this.userUsuario = userUsuario;
    }
    public String getContraseniaUsuario() {
        return this.contraseniaUsuario;
    }
    
    public void setContraseniaUsuario(String contraseniaUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
    }
    public Set<InformacionPrincipal> getInformacionPrincipals() {
        return this.informacionPrincipals;
    }
    
    public void setInformacionPrincipals(Set<InformacionPrincipal> informacionPrincipals) {
        this.informacionPrincipals = informacionPrincipals;
    }




}


