/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo11.dulcehogar.s3.negocio;

import com.grupo11.dulcehogar.s3.acceso_datos.AccCuentaSocio;
import com.grupo11.dulcehogar.s3.vistas.montoTotalCancelado;
import com.grupo11.dulcehogar.s3.vistas.pagarCuotaMensual;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class NegCuentaSocio {
    AccCuentaSocio accCuentaSocio;

 

    public NegCuentaSocio() {
        this.accCuentaSocio = new AccCuentaSocio();
    }
    
    
    
    public CuentaSocio buscarValorCuota(pagarCuotaMensual thispagarCuotaMensual, String rut) throws HeadlessException {
        
        
        
        try {
            CuentaSocio cuentaSocio = accCuentaSocio.buscarValorCuota(rut);
            if (cuentaSocio !=null) {
                return cuentaSocio;
                
            } else {
                JOptionPane.showMessageDialog(thispagarCuotaMensual, "Erro en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(thispagarCuotaMensual, "Error al buscar los datos del socio", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public void pagarCuota(pagarCuotaMensual thispagarCuotaMensual,String rut, String txt_montoCuota) throws NumberFormatException, HeadlessException {
        double montoCuota = Double.parseDouble(txt_montoCuota);
        
        
        try {
            // Consultar la cantidad aportada actual y el número de cuota
           
            
            CuentaSocio cuentaSocio = accCuentaSocio.buscarValorCuota(rut);
            if (cuentaSocio!=null) {
                //double cantidadAportada = rs.getDouble("cantaportada");
                //int numeroCuota = rs.getInt("numcuota");
                double cantidadAportada = cuentaSocio.getCantAportada();
                int numeroCuota = cuentaSocio.getNumCuota();

                // Actualizar la cantidad aportada con el monto ingresado y restar 1 al número de cuota
                double nuevaCantidadAportada = cantidadAportada + montoCuota;
                int nuevoNumeroCuota = numeroCuota - 1;
                accCuentaSocio.pagarCuota( nuevaCantidadAportada, nuevoNumeroCuota, rut);

                JOptionPane.showMessageDialog(thispagarCuotaMensual, "Cuota pagada exitosamente");
            } else {
                JOptionPane.showMessageDialog(thispagarCuotaMensual, "Socio no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(thispagarCuotaMensual, "Error al pagar la cuota", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public String buscarMontoApor(montoTotalCancelado thismontoTotalCancelado, String rut) {
        
        try {
            String montoApor= accCuentaSocio.buscarMontoApor(rut);
            if(montoApor!=""){
                return montoApor;
            }
            else{
                JOptionPane.showMessageDialog(thismontoTotalCancelado, "Socio no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

   

    
    
}
