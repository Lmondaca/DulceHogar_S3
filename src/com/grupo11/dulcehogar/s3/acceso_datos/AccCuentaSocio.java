/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo11.dulcehogar.s3.acceso_datos;

import com.grupo11.dulcehogar.s3.negocio.CuentaSocio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        public CuentaSocio buscarValorCuota(String rut) {

        try {
            Conexion conexion = new Conexion();
            Connection cnx = conexion.obtenerConexion();
            String query = "SELECT numerocuenta, valorcuota, cantaportada, numcuota FROM cuenta_socio WHERE numerocuenta = (SELECT numerocuenta FROM socio WHERE rut = ?)";
            PreparedStatement pst = cnx.prepareStatement(query);
            pst.setString(1, rut);
            ResultSet rs = pst.executeQuery();
            boolean isNext = rs.next();
            
            if (isNext) {
                CuentaSocio cuentaSocio = new CuentaSocio(Integer.parseInt(rs.getString("numerocuenta")), Integer.parseInt(rs.getString("valorcuota")), Integer.parseInt(rs.getString("cantaportada")), Integer.parseInt(rs.getString("numcuota")));
                cnx.close();
                return cuentaSocio;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;

    }
        public void pagarCuota(double nuevaCantidadAportada, int nuevoNumeroCuota, String rut) throws SQLException {
        Conexion conexion = new Conexion();
        Connection cnx = conexion.obtenerConexion();
        String updateQuery = "UPDATE cuenta_socio SET cantaportada = ?, numcuota = ? WHERE numerocuenta = (SELECT numerocuenta FROM socio WHERE rut = ?)";
        PreparedStatement updatePst = cnx.prepareStatement(updateQuery);
        updatePst.setDouble(1, nuevaCantidadAportada);
        updatePst.setInt(2, nuevoNumeroCuota);
        updatePst.setString(3, rut);
        updatePst.executeUpdate();
        cnx.close();
    }

    
}
