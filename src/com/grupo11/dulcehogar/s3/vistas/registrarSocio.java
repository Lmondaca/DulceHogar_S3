/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.grupo11.dulcehogar.s3.vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.grupo11.dulcehogar.s3.acceso_datos.Conexion;
import com.grupo11.dulcehogar.s3.negocio.NegSocio;
import javax.swing.JOptionPane;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 *
 * @author micha
 */
public class registrarSocio extends javax.swing.JInternalFrame {

    
    NegSocio negSocio;
    /**
     * Creates new form registrarSocio
     */
    public registrarSocio() {
        initComponents();
        this.negSocio = new NegSocio();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidoPaterno = new javax.swing.JTextField();
        txt_apellidoMaterno = new javax.swing.JTextField();
        txt_RUT = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_domicilio = new javax.swing.JTextField();
        txt_comuna = new javax.swing.JTextField();
        txt_numeroSocio = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        fieldPassReg = new javax.swing.JPasswordField();

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setTitle("Registrar Socio");

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido Paterno");

        jLabel3.setText("Apellido Materno");

        jLabel4.setText("RUT (12.345.678-9)");

        jLabel5.setText("Correo");

        jLabel6.setText("Teléfono");

        jLabel7.setText("Domicilio");

        jLabel8.setText("Comuna");

        jLabel9.setText("Número Socio");

        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        jLabel10.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_registrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_nombre)
                        .addComponent(txt_apellidoPaterno)
                        .addComponent(txt_apellidoMaterno)
                        .addComponent(txt_RUT)
                        .addComponent(txt_correo)
                        .addComponent(txt_telefono)
                        .addComponent(txt_domicilio)
                        .addComponent(txt_comuna)
                        .addComponent(txt_numeroSocio, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(fieldPassReg)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(34, 34, 34))
                                                                            .addComponent(txt_apellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(34, 34, 34))
                                                                    .addComponent(txt_apellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(34, 34, 34))
                                                            .addComponent(txt_RUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(34, 34, 34))
                                                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34))
                                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34))
                                    .addComponent(txt_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))
                            .addComponent(txt_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_numeroSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fieldPassReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_registrar)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String nombre = txt_nombre.getText().toUpperCase();
        String apellidoPaterno = txt_apellidoPaterno.getText().toUpperCase();
        String apellidoMaterno = txt_apellidoMaterno.getText().toUpperCase();
        String rut = txt_RUT.getText().toUpperCase();
        String correo = txt_correo.getText().toUpperCase();
        String telefono = txt_telefono.getText().toUpperCase();
        String domicilio = txt_domicilio.getText().toUpperCase();
        String comuna = txt_comuna.getText().toUpperCase();
        String numeroSocio = txt_numeroSocio.getText().toUpperCase();
        String pass = String.valueOf(fieldPassReg.getPassword());

        String mensajeRetorno =negSocio.registrarSocio(nombre, apellidoPaterno, apellidoMaterno, rut, correo, telefono, numeroSocio,domicilio,comuna,pass);
        if (mensajeRetorno != "") {
            JOptionPane.showMessageDialog(this,mensajeRetorno , "Error", JOptionPane.ERROR_MESSAGE);

            return;
        }
    

        
      
        JOptionPane.showMessageDialog(this, "Socio RUN: " + rut + " registrado exitosamente");
            txt_nombre.setText("");
            txt_apellidoPaterno.setText("");
            txt_apellidoMaterno.setText("");
            txt_RUT.setText("");
            txt_correo.setText("");
            txt_telefono.setText("");
            txt_domicilio.setText("");
            txt_comuna.setText("");
            txt_numeroSocio.setText("");
    }//GEN-LAST:event_btn_registrarActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private javax.swing.JPasswordField fieldPassReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField txt_RUT;
    private javax.swing.JTextField txt_apellidoMaterno;
    private javax.swing.JTextField txt_apellidoPaterno;
    private javax.swing.JTextField txt_comuna;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_domicilio;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numeroSocio;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
