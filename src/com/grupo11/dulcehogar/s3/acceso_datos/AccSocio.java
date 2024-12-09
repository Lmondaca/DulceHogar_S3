/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo11.dulcehogar.s3.acceso_datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class AccSocio {
    public AccSocio(){
        
    }
    public Connection insertaSocio(String nombre, String apellidoPaterno, String apellidoMaterno, String rut, String correo, String telefono, String domicilio, String comuna, String numeroSocio) throws SQLException {
        Conexion conexion = new Conexion();
        Connection cnx = conexion.obtenerConexion();
        String query = "INSERT INTO socio (nombre, apellidopaterno, apellidomaterno, rut, correo, telefono, domicilio, comuna, numerocuenta) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = cnx.prepareStatement(query);
        pst.setString(1, nombre);
        pst.setString(2, apellidoPaterno);
        pst.setString(3, apellidoMaterno);
        pst.setString(4, rut);
        pst.setString(5, correo);
        pst.setString(6, telefono);
        pst.setString(7, domicilio);
        pst.setString(8, comuna);
        pst.setString(9, numeroSocio);
        pst.executeUpdate();
        return cnx;
        
   
    }
    
}
