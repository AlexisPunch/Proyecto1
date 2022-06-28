/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.proyecto1.inti;

import com.punch.ejecutar.EjecutarProcedure;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author metal
 */
public class GuardarArticulo extends javax.swing.JFrame {

    /**
     * Creates new form GuardarArticulo
     */
    public GuardarArticulo() {
        initComponents();
         txtClave.setEditable(false);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevoArticulo = new javax.swing.JButton();
        guardButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEsp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMed = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        nuevoArticulo.setText("Nuevo");
        nuevoArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoArticuloActionPerformed(evt);
            }
        });

        guardButton.setText("Guardar");
        guardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardButtonActionPerformed(evt);
            }
        });

        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Precio");

        jLabel3.setText("Especificaciones");

        jLabel6.setText("Clave");

        txtClave.setBackground(new java.awt.Color(255, 255, 0));
        txtClave.setForeground(new java.awt.Color(0, 0, 0));
        txtClave.setText("FOLIO AUTOMÁTICO");
        txtClave.setCaretColor(new java.awt.Color(255, 255, 0));
        txtClave.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        jLabel7.setText("Medida");

        txtMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMed)
                            .addComponent(txtClave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEsp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevoArticulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoArticulo)
                    .addComponent(guardButton)
                    .addComponent(jButton3))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardButtonActionPerformed
        // TODO add your handling code here:
             String clave = "";
             Connection conectar = null;
             String nombre = txtNombre.getText();
             String precio = txtPrecio.getText();
             String esp = txtEsp.getText();   
             String medida= txtMed.getText();
          
           SQLConexion con= new SQLConexion();
             con.conectar();
             //aqui
             
         
             
              
            
            
            if ( nombre.isEmpty() || precio.isEmpty() || esp.isEmpty() || medida.isEmpty()) {
            JOptionPane.showInternalMessageDialog(null, "No guardado, llene todos los campos.");
            
        } else { 
        
                      
        try {
         
     
             ResultSet as= st.("SELECT max(cve_articulo) from cat_articulos");
                while (as.next()) {
                                    
            
            clave = as.getString(1);
               }
                
                
                  if (clave == null) {

                            txtClave.setText("1000001");
    } else {

        int Increment = Integer.parseInt(clave);
        Increment = Increment + 1 ;
      

            
       
       
        
         String insert = "INSERT INTO CAT_ARTICULOS (cve_articulo,nombre,estatus,precio_unitario,especificaciones,cve_umedida) VALUES ("+Increment+",'"+nombre+"',1,"+precio+",'"+esp+"','"+medida+"')";
              
         int rs = st.executeUpdate(insert);
                JOptionPane.showInternalMessageDialog(null, "Guardado correctamente");
                  txtClave.setText(""+Increment); 
        txtEsp.setEditable(false);
        txtMed.setEditable(false);
        txtNombre.setEditable(false);
        txtPrecio.setEditable(false);
             
    }
         
            
            
        } catch (SQLException e) {
            
            
            JOptionPane.showInternalMessageDialog(null, "Error al guardar, Ingresar un valor numérico en el campo precio");
      
            
            
        }
            
        
    }//GEN-LAST:event_guardButtonActionPerformed
}
    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void txtMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedActionPerformed

    private void nuevoArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoArticuloActionPerformed
        // TODO add your handling code here:
                txtClave.setText("FOLIO AUTOMÁTICO");
                txtNombre.setText("");
                txtPrecio.setText("");
                txtEsp.setText("");
                txtMed.setText("");
        
        txtEsp.setEditable(true);
        txtMed.setEditable(true);
        txtNombre.setEditable(true);
        txtPrecio.setEditable(true);
    }//GEN-LAST:event_nuevoArticuloActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       catArticulos actualizar = new catArticulos();
      actualizar.setVisible(true);
        hide();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(GuardarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuardarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuardarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuardarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuardarArticulo().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton nuevoArticulo;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtEsp;
    private javax.swing.JTextField txtMed;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
