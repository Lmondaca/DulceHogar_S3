/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupo11.dulcehogar.s3.vistas;

/**
 *
 * @author micha
 */
public class paginaInicio extends javax.swing.JFrame {

    /**
     * Creates new form paginaInicio
     */
    public paginaInicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop01 = new javax.swing.JDesktopPane();
        btn_registrarSocio = new javax.swing.JButton();
        btn_verDatos = new javax.swing.JButton();
        btn_pagarCuotaMensual = new javax.swing.JButton();
        btn_montoTotalCancelado = new javax.swing.JButton();
        btn_cuotaPorCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnb_registrarSocio = new javax.swing.JMenuItem();
        mnb_verDatos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnb_pagarCuotaMensual = new javax.swing.JMenuItem();
        mnb_montoTotalCancelado = new javax.swing.JMenuItem();
        mnb_cuotaPorCancelar = new javax.swing.JMenuItem();
        mnb_salir = new javax.swing.JMenu();
        mni_salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dulce Hogar");

        javax.swing.GroupLayout desktop01Layout = new javax.swing.GroupLayout(desktop01);
        desktop01.setLayout(desktop01Layout);
        desktop01Layout.setHorizontalGroup(
            desktop01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );
        desktop01Layout.setVerticalGroup(
            desktop01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        btn_registrarSocio.setText("Registrar Socio");
        btn_registrarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarSocioActionPerformed(evt);
            }
        });

        btn_verDatos.setText("Ver Datos Socio");
        btn_verDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verDatosActionPerformed(evt);
            }
        });

        btn_pagarCuotaMensual.setText("Pagar Cuota Mensual");
        btn_pagarCuotaMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagarCuotaMensualActionPerformed(evt);
            }
        });

        btn_montoTotalCancelado.setText("Monto Total Cancelado");
        btn_montoTotalCancelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_montoTotalCanceladoActionPerformed(evt);
            }
        });

        btn_cuotaPorCancelar.setText("Cuotas Por Pagar");
        btn_cuotaPorCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuotaPorCancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("Ctrl +1");

        jLabel7.setText("Ctrl +2");

        jLabel8.setText("Ctrl +3");

        jLabel9.setText("Ctrl +4");

        jLabel10.setText("Ctrl +5");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ctrl + x");

        jMenu1.setText("Socios");

        mnb_registrarSocio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnb_registrarSocio.setText("Registrar");
        mnb_registrarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnb_registrarSocioActionPerformed(evt);
            }
        });
        jMenu1.add(mnb_registrarSocio);

        mnb_verDatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnb_verDatos.setText("Ver Datos");
        mnb_verDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnb_verDatosActionPerformed(evt);
            }
        });
        jMenu1.add(mnb_verDatos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cuentas");

        mnb_pagarCuotaMensual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnb_pagarCuotaMensual.setText("Pagar Cuota Mensual");
        mnb_pagarCuotaMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnb_pagarCuotaMensualActionPerformed(evt);
            }
        });
        jMenu2.add(mnb_pagarCuotaMensual);

        mnb_montoTotalCancelado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnb_montoTotalCancelado.setText("Consultatr Monto Total Cancelado");
        mnb_montoTotalCancelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnb_montoTotalCanceladoActionPerformed(evt);
            }
        });
        jMenu2.add(mnb_montoTotalCancelado);

        mnb_cuotaPorCancelar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnb_cuotaPorCancelar.setText("Consultar N° Cuotas por Cancelar");
        mnb_cuotaPorCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnb_cuotaPorCancelarActionPerformed(evt);
            }
        });
        jMenu2.add(mnb_cuotaPorCancelar);

        jMenuBar1.add(jMenu2);

        mnb_salir.setText("Salir");

        mni_salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mni_salir.setText("Salir");
        mni_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_salirActionPerformed(evt);
            }
        });
        mnb_salir.add(mni_salir);

        jMenuBar1.add(mnb_salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cuotaPorCancelar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_verDatos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_montoTotalCancelado))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_registrarSocio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_pagarCuotaMensual))
                            .addComponent(desktop01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                        .addContainerGap(85, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 64, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desktop01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrarSocio)
                    .addComponent(btn_pagarCuotaMensual)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_verDatos)
                    .addComponent(btn_montoTotalCancelado)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cuotaPorCancelar)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnb_registrarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnb_registrarSocioActionPerformed
        desktop01.removeAll();
        desktop01.repaint();
        registrarSocio test= new registrarSocio();
        desktop01.add(test);
        test.setVisible(true);
    }//GEN-LAST:event_mnb_registrarSocioActionPerformed

    private void mnb_verDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnb_verDatosActionPerformed
        desktop01.removeAll();
        desktop01.repaint();
        verDatosSocio test= new verDatosSocio();
        desktop01.add(test);
        test.setVisible(true);
    }//GEN-LAST:event_mnb_verDatosActionPerformed

    private void mnb_pagarCuotaMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnb_pagarCuotaMensualActionPerformed
        desktop01.removeAll();
        desktop01.repaint();
        pagarCuotaMensual test= new pagarCuotaMensual();
        desktop01.add(test);
        test.setVisible(true);
    }//GEN-LAST:event_mnb_pagarCuotaMensualActionPerformed

    private void mnb_montoTotalCanceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnb_montoTotalCanceladoActionPerformed
        desktop01.removeAll();
        desktop01.repaint();
        montoTotalCancelado test= new montoTotalCancelado();
        desktop01.add(test);
        test.setVisible(true);
    }//GEN-LAST:event_mnb_montoTotalCanceladoActionPerformed

    private void mnb_cuotaPorCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnb_cuotaPorCancelarActionPerformed
        desktop01.removeAll();
        desktop01.repaint();
        cuotaPorCancelar test= new cuotaPorCancelar();
        desktop01.add(test);
        test.setVisible(true);       
                
    }//GEN-LAST:event_mnb_cuotaPorCancelarActionPerformed

    private void btn_registrarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarSocioActionPerformed
        desktop01.removeAll();
        desktop01.repaint();
        registrarSocio test= new registrarSocio();
        desktop01.add(test);
        test.setVisible(true);
    }//GEN-LAST:event_btn_registrarSocioActionPerformed

    private void btn_verDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verDatosActionPerformed
        desktop01.removeAll();
        desktop01.repaint();
        verDatosSocio test= new verDatosSocio();
        desktop01.add(test);
        test.setVisible(true);
    }//GEN-LAST:event_btn_verDatosActionPerformed

    private void btn_pagarCuotaMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagarCuotaMensualActionPerformed
        desktop01.removeAll();
        desktop01.repaint();
        pagarCuotaMensual test= new pagarCuotaMensual();
        desktop01.add(test);
        test.setVisible(true);
    }//GEN-LAST:event_btn_pagarCuotaMensualActionPerformed

    private void btn_montoTotalCanceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_montoTotalCanceladoActionPerformed
        desktop01.removeAll();
        desktop01.repaint();
        montoTotalCancelado test= new montoTotalCancelado();
        desktop01.add(test);
        test.setVisible(true);
    }//GEN-LAST:event_btn_montoTotalCanceladoActionPerformed

    private void btn_cuotaPorCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuotaPorCancelarActionPerformed
        desktop01.removeAll();
        desktop01.repaint();
        cuotaPorCancelar test= new cuotaPorCancelar();
        desktop01.add(test);
        test.setVisible(true); 
    }//GEN-LAST:event_btn_cuotaPorCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0); //Salir del programa
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mni_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_salirActionPerformed
        System.exit(0); //Salir del programa
    }//GEN-LAST:event_mni_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(paginaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paginaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paginaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paginaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paginaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cuotaPorCancelar;
    private javax.swing.JButton btn_montoTotalCancelado;
    private javax.swing.JButton btn_pagarCuotaMensual;
    private javax.swing.JButton btn_registrarSocio;
    private javax.swing.JButton btn_verDatos;
    private javax.swing.JDesktopPane desktop01;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnb_cuotaPorCancelar;
    private javax.swing.JMenuItem mnb_montoTotalCancelado;
    private javax.swing.JMenuItem mnb_pagarCuotaMensual;
    private javax.swing.JMenuItem mnb_registrarSocio;
    private javax.swing.JMenu mnb_salir;
    private javax.swing.JMenuItem mnb_verDatos;
    private javax.swing.JMenuItem mni_salir;
    // End of variables declaration//GEN-END:variables
}
