/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo11.dulcehogar.s3.negocio;

import com.grupo11.dulcehogar.s3.acceso_datos.AccCuentaSocio;
import com.grupo11.dulcehogar.s3.acceso_datos.AccSocio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 *
 * @author Lucas
 */
public class NegSocio {
    AccSocio accSocio;
    AccCuentaSocio accCuentaSocio;
    
    public NegSocio(){
        this.accSocio = new AccSocio();
        this.accCuentaSocio= new AccCuentaSocio();
        
    }
    
    public String registrarSocio(String nombre, String apellidoPaterno, String apellidoMaterno, String rut, String correo, String telefono, String numeroSocio,String domicilio, String comuna) {
        Validar validar = new Validar();
        if (!validar.esSoloLetras(nombre)) {
            
            return "Nombre inválido. Debe contener solo letras y al menos 2 caracteres.";
        }
        if (!validar.esSoloLetras(apellidoPaterno)) {
            return "Apellido Paterno inválido. Debe contener solo letras y al menos 2 caracteres.";
        }
        if (!validar.esSoloLetras(apellidoMaterno)) {
           return "Apellido Materno inválido. Debe contener solo letras y al menos 2 caracteres.";
        }
        if (!validar.rut(rut)) {
            return "RUT inválido. Debe tener el formato 12.345.678-9.";
        }
        if (!validar.correoValido(correo)) {
            return "Correo inválido. Debe contener un '@' y un '.'.";
        }
        if (!validar.telefonoValido(telefono)) {
            return "Teléfono inválido. Debe tener 9 dígitos y comenzar con 9 o 2.";
        }
        if (!validar.nroCuenta(numeroSocio)) {
             return "Número de socio inválido. Debe ser un número de 9 dígitos.";
        }
        Socio socioNuevo = new Socio(rut, nombre,apellidoPaterno, apellidoMaterno,correo,domicilio,"region","ciudad",comuna,Integer.parseInt(telefono),Integer.parseInt(numeroSocio));
        
          try {
            Connection cnx=accSocio.insertaSocio(nombre, apellidoPaterno, apellidoMaterno, rut, correo, telefono, domicilio, comuna, numeroSocio);

            cnx=accCuentaSocio.insertarCuentaSocio(cnx,Integer.toString(socioNuevo.getCuentaSocio().getNumeroCuenta()));
            cnx.close();
            
        } catch (SQLIntegrityConstraintViolationException e) {
            return "Número de socio ya registrado anteriormente";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }



    
}
