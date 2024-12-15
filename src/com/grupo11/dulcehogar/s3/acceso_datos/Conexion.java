package com.grupo11.dulcehogar.s3.acceso_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    // Método para obtener una conexión
    public Connection obtenerConexion() {
        Connection conexion = null;

        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Datos de conexión
            String url = "jdbc:mysql://localhost:3306/dulcehogar"; // Asegúrate de que esta URL sea correcta
            String user = "root";
            String pass = "";

            // Establecer la conexión
            conexion = DriverManager.getConnection(url, user, pass);
            System.out.println("Se ha establecido la conexión con la BD");
            
            // Cerrar la conexión
            // conexion.close();
            // System.out.println("Se ha desconectado de la BD");
        } catch (ClassNotFoundException ex) {
            System.out.println("No se pudo cargar el driver");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("No se pudo establecer la conexión");
            ex.printStackTrace();
        }
        return conexion;
    }
    
    // Método principal para probar la conexión
    /*public static void main(String[] args) {
        Conexion conexionBD = new Conexion();
        Connection cnx = conexionBD.obtenerConexion();
        
        // Cerrar la conexión
        if (cnx != null) {
            try {
                cnx.close();
                System.out.println("Se ha desconectado de la BD");
            } catch (SQLException ex) {
                System.out.println("No se pudo cerrar la conexión");
                ex.printStackTrace();
            }
        }
    }*/
}
