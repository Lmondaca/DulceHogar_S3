/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo11.dulcehogar.s3.acceso_datos;

import com.grupo11.dulcehogar.s3.negocio.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Lucas
 */
public class AccLogin {

    public AccLogin() {

    }


    public Usuario buscarUsuario(String rut) {

        try {
            Conexion conexion = new Conexion();
            Connection cnx = conexion.obtenerConexion();
            String query = "SELECT rut, contrasenna, nombre, apellidopaterno, apellidomaterno FROM usuario WHERE rut = ?";
            PreparedStatement pst = cnx.prepareStatement(query);
            pst.setString(1, rut);
            ResultSet rs = pst.executeQuery();
            boolean isNext = rs.next();

            if (isNext) {
                Usuario usuario = new Usuario(rs.getString("rut"), rs.getString("contrasenna"), rs.getString("nombre"), rs.getString("apellidopaterno"),rs.getString("apellidomaterno"));
                cnx.close();
                return usuario;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;

    }


}
