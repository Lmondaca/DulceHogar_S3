package com.grupo11.dulcehogar.s3.negocio;

import java.util.Scanner;
//nadadenada
public class Usuario {

    private String rut;
    private String contrasenna;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public Usuario(String rut, String contrasenna, String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.rut = rut;
        this.contrasenna = contrasenna;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public Usuario() {
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

  
    

    

}