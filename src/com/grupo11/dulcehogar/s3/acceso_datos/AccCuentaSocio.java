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
public class AccCuentaSocio {
    public AccCuentaSocio(){
        
    }
        public Connection insertarCuentaSocio(Connection cnx, String numeroSocio) throws SQLException {
   
        // Insertar registro en cuenta_socio
        String queryCuenta = "INSERT INTO cuenta_socio (numerocuenta) VALUES (?)";
        PreparedStatement pstCuenta = cnx.prepareStatement(queryCuenta);
        pstCuenta.setString(1, numeroSocio);
        pstCuenta.executeUpdate();
        return cnx;
        
    }
    
}
