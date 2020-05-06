/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.view;

import co.edu.usbbog.controller.logic.MetodosProducto;
import co.edu.usbbog.model.Producto;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class ProductoCRUD extends javax.swing.JFrame {

    MetodosProducto mp = new MetodosProducto();
    /**
     * Creates new form ProductoCRUD
     */
    public ProductoCRUD() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelId = new javax.swing.JLabel();
        jLabelProducto = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jLabelFechaDeVencimiento = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldFechaDeVencimiento = new javax.swing.JTextField();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldProducto = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMostrar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelId.setText("Id");
        jPanel1.add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabelProducto.setText("Producto");
        jPanel1.add(jLabelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabelMarca.setText("Marca");
        jPanel1.add(jLabelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabelFechaDeVencimiento.setText("Fecha de vencimiento");
        jPanel1.add(jLabelFechaDeVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabelPrecio.setText("Precio");
        jPanel1.add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 80, -1));

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 90, -1));

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 80, -1));

        jButton4.setText("Mostrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 90, -1));
        jPanel1.add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 140, -1));

        jTextFieldFechaDeVencimiento.setText("YYYY-MM-DD");
        jPanel1.add(jTextFieldFechaDeVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 140, -1));
        jPanel1.add(jTextFieldMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 140, -1));
        jPanel1.add(jTextFieldProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, -1));
        jPanel1.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 140, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("PRODUCTO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 80, -1));

        jTableMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableMostrar);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 10, 420, 310));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modificar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mostrar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        volver();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ProductoCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductoCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductoCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductoCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductoCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFechaDeVencimiento;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMostrar;
    private javax.swing.JTextField jTextFieldFechaDeVencimiento;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldProducto;
    // End of variables declaration//GEN-END:variables

    private void agregar() {
        int id = Integer.parseInt(jTextFieldId.getText());
        double precio = Integer.parseInt(jTextFieldPrecio.getText());
        Producto p = new Producto(id, jTextFieldProducto.getText(), jTextFieldMarca.getText(), jTextFieldFechaDeVencimiento.getText(), precio);
        if (mp.agregar(p)) {
            JOptionPane.showMessageDialog(this, "Agregado correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo agregar ");
        }
        jTextFieldId.setText(null);
        jTextFieldProducto.setText(null);
        jTextFieldMarca.setText(null);
        jTextFieldFechaDeVencimiento.setText(null);
        jTextFieldPrecio.setText(null);
        mostrar();
    }

    private void eliminar() {
        int id = Integer.parseInt(jTextFieldId.getText());
        if (mp.eliminar(id)) {
            JOptionPane.showMessageDialog(this, "Eliminado correctamente");
            jTextFieldId.setText(null);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar");
        }
        jTextFieldId.setText(null);
        mostrar();
    }

    private void modificar() {
        int id = Integer.parseInt(jTextFieldId.getText());
        double precio = Integer.parseInt(jTextFieldPrecio.getText());
        Producto p = new Producto(id, jTextFieldProducto.getText(), jTextFieldMarca.getText(), jTextFieldFechaDeVencimiento.getText(), precio);
        if (mp.modificar(p ,id, jTextFieldProducto.getText(), jTextFieldMarca.getText(), jTextFieldFechaDeVencimiento.getText(), precio)) {
            JOptionPane.showMessageDialog(this, "Modificado correctamente");
            jTextFieldId.setText(null);
            jTextFieldProducto.setText(null);
            jTextFieldMarca.setText(null);
            jTextFieldFechaDeVencimiento.setText(null);
            jTextFieldPrecio.setText(null);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo modificar");
        }     
        mostrar();
    }

    private void mostrar() {
        jTableMostrar.setModel(mp.mostrar());
    }

    private void volver() {
        Interfaz i = new Interfaz();
        i.setVisible(true);
        dispose();
    }
}