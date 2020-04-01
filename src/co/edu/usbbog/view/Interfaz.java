/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.view;

import co.edu.usbbog.model.Pais;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author hp
 */
public class Interfaz extends javax.swing.JFrame {
    
    Pais p = new Pais();
    private File fichero; 
    
    String sep = File.separator;
    Path path = Paths.get("C:"+sep+"Users"+sep+"hp"+sep+"Desktop"+sep+"prueba.txt");

    /**
     * Creates new form Principal
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
    
    public void cargarExportar(File fich){
        this.fichero = fich;
    }
    
    public void añadirExportar(File fich){
        String nuevoItem;
        this.fichero = fich;
        if (jTextFieldNombrePais.getText().equals("") || jTextFieldNoContagiados.getText().equals("") || jTextFieldNoMuertes.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "ERROR: Faltan datos", "Mensaje de Error", JOptionPane.WARNING_MESSAGE);
            //return;
        }
//        Covid c = new Covid(jTextFieldNombrePais.getText(), Integer.parseInt(jTextFieldNoContagiados.getText()), Integer.parseInt(jTextFieldNoMuertes.getText()));
//        nuevoItem = jTextFieldNombrePais.getText() + " " + jTextFieldNoContagiados.getText() + " " + jTextFieldNoMuertes.getText() + " \n";
//        p.pais.add(c);
//        jTextAreaListaPaises.setText(jTextAreaListaPaises.getText() + nuevoItem);
    }
    
    public void mostrar(){
        jTextAreaListaPaises.setText(p.mostrar());
        jTextAreaListaNoContagiados.setText(p.mostrarPorContagiados());
        jTextAreaListaNoMuertes.setText(p.mostrarPorMuertes());
        
    }
    
    public void agregar(){
        p.agregar(jTextFieldNombrePais.getText(), Integer.parseInt(jTextFieldNoContagiados.getText()), Integer.parseInt(jTextFieldNoMuertes.getText()));
        añadirExportar(fichero);
        JOptionPane.showMessageDialog(null,"Se agrego un elemento a la lista");
        jTextFieldNombrePais.setText(null);
        jTextFieldNoContagiados.setText(null);
        jTextFieldNoMuertes.setText(null);
        mostrar();
    }
    
    public void modificar(){
        p.modificar(jTextFieldNombrePais.getText(), Integer.parseInt(jTextFieldNoContagiados.getText()), Integer.parseInt(jTextFieldNoMuertes.getText()));
        JOptionPane.showMessageDialog(null,"Se modifico un elemento a la lista");
        jTextFieldNombrePais.setText(null);
        jTextFieldNoContagiados.setText(null);
        jTextFieldNoMuertes.setText(null);
        mostrar();
    }   
    
    public void eliminar(){
        String limite = " ";// Elemento que separa el nombre, el usuario y la contraseña dentro del fichero
        String[] trozos; // Dividimos la linea del dichero en unidades independientes
        String nombre; // Nombre del sitio que el usuario ha introducido en el cuadro de texto
        String nombreTrozo; // Nombre del sitio dentro del string trozos
        Boolean encontrado = false;
        LinkedList<String> clonLista = new LinkedList(); // Almacenamos todas las lineas que no son las que queremos borrar, para despues volverlas a guardar
        
        if (jTextFieldNombrePais.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El campo del nombre del sitio está vacío", "Campo vacío", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {

                BufferedReader reader = new BufferedReader(new FileReader(fichero));  // Cargamos el fichero para lectura
                String linea = reader.readLine(); // Leemos la primera linea

                if (linea == null) {
                    JOptionPane.showMessageDialog(this, "El fichero está vacío", "Fichero vacío", JOptionPane.INFORMATION_MESSAGE);
                    reader.close();// Cerramos el fichero para lectura
                } else {
                    do {
                        p.eliminar(jTextFieldNombrePais.getText());
                        trozos = linea.split(limite, 3); //Dividimos la linea leida en tres parte

                        nombre = jTextFieldNombrePais.getText().toUpperCase();
                        nombreTrozo = trozos[0].toUpperCase();

                        if (!nombreTrozo.equals(nombre)) {
                            //Comprobamos que la linea no sea vacia. Si es vacia, no la guardamos
                            if (!nombreTrozo.equals("")) {
                                clonLista.add(linea);
                            }
                        } else {
                            encontrado = true;
                        }

                        linea = reader.readLine(); // leemos la siguiente línea

                    } while (linea != null);

                    reader.close();// Cerramos el fichero para lectura

                    if (!encontrado) {
                        JOptionPane.showMessageDialog(this, "No hay ningun sitio con ese nombre", "No está el sitio", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        BufferedWriter writer = new BufferedWriter(new FileWriter(fichero));
                        while (!clonLista.isEmpty()) {
                            writer.write(clonLista.poll().toString());
                            writer.newLine();
                        }
                        writer.flush();
                        writer.close();
                        JOptionPane.showMessageDialog(this, "Eliminado con éxito", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } catch (IOException e) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        jTextFieldNombrePais.setText(null);
        mostrar();
    }
    
    public void guardar(){
       BufferedWriter writer; //Para escribir en el fichero     

        if (fichero == null) {
            //Activamos el filtro para que nos muestre, por defecto, los archivos de texto
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
            JFileChooser fileChooserGuardar = new JFileChooser();
            fileChooserGuardar.setFileFilter(filtro);
            fileChooserGuardar.setDialogTitle("Guardar");
            int seleccion = fileChooserGuardar.showSaveDialog(this);

            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = fileChooserGuardar.getSelectedFile();
                fileChooserGuardar.setFileSelectionMode(JFileChooser.FILES_ONLY);
                try {
                    writer = new BufferedWriter(new FileWriter(fichero + ".txt")); // Ponemos .txt para darle extension al archivo que creamos
                    while (!p.pais.isEmpty()) {
                        writer.write(p.pais.poll().toString());
                        writer.newLine();
                    }
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error guardar archivo", JOptionPane.ERROR_MESSAGE);
                }

                JOptionPane.showMessageDialog(this, "El fichero de texto se ha guardado correctamente con los datos introducidos");
            }
        } else if (!(fichero == null)) // Añadimos al fichero existente
        {
            try {
                writer = new BufferedWriter(new FileWriter(fichero, true));
                while (!p.pais.isEmpty()) {
                    writer.write(p.pais.poll().toString());
                    writer.newLine();
                }
                writer.flush();
                writer.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error guardar archivo", JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(this, "El fichero de texto se ha guardado correctamente con los datos introducidos");
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: Error al guardar", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void exportar(){        
        // Creamos un filtro para que se reconozcan los archivos de texto
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
        JFileChooser fileChooserCargar = new JFileChooser();
        fileChooserCargar.setFileFilter(filtro);
        fileChooserCargar.setDialogTitle("Abrir");

        int seleccion = fileChooserCargar.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File file = fileChooserCargar.getSelectedFile();
            cargarExportar(file);               
        }
        String info_archivo = leerArchivo(path.toString());
		if(info_archivo != null){
			//System.out.println("Texto archivo: "+info_archivo);
                        jTextAreaListaPaises.setText(info_archivo);
                }        

        
        
        
        //guardar();
        //mostrar();
        //añadirExportar(fichero);
    }
    
    public static String leerArchivo(String path){
		try{
			FileReader reader = new FileReader(path);
			BufferedReader buffer = new BufferedReader(reader);
			
			String linea = buffer.readLine();
			String texto = linea;
			while(linea != null){
				//System.out.println(linea);
				linea = buffer.readLine();
				if(linea!= null)
					texto = texto + linea+"\n";
			}			
			return texto;
		}catch(Exception e){
			System.out.println("Hubo un error leyendo el archivo." +e.getMessage());
		}
		return null;
	}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneListaNoMuertes = new javax.swing.JScrollPane();
        jTextAreaListaNoMuertes = new javax.swing.JTextArea();
        jScrollPaneListaNoContagiados = new javax.swing.JScrollPane();
        jTextAreaListaNoContagiados = new javax.swing.JTextArea();
        jLabelListaNoMuertes = new javax.swing.JLabel();
        jLabelListaNoContagiados = new javax.swing.JLabel();
        jLabelNoMuertes = new javax.swing.JLabel();
        jTextFieldNoMuertes = new javax.swing.JTextField();
        jLabelNombrePais = new javax.swing.JLabel();
        jTextFieldNombrePais = new javax.swing.JTextField();
        jLabelNoContagiados = new javax.swing.JLabel();
        jTextFieldNoContagiados = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonMostrar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaListaPaises = new javax.swing.JTextArea();
        jButtonExportar = new javax.swing.JButton();
        jLabelTituloProyecto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextAreaListaNoMuertes.setColumns(20);
        jTextAreaListaNoMuertes.setRows(5);
        jScrollPaneListaNoMuertes.setViewportView(jTextAreaListaNoMuertes);

        getContentPane().add(jScrollPaneListaNoMuertes, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 210, 540));

        jTextAreaListaNoContagiados.setColumns(20);
        jTextAreaListaNoContagiados.setRows(5);
        jScrollPaneListaNoContagiados.setViewportView(jTextAreaListaNoContagiados);

        getContentPane().add(jScrollPaneListaNoContagiados, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 210, 540));

        jLabelListaNoMuertes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelListaNoMuertes.setText("Lista Paises Con No.Muertes");
        getContentPane().add(jLabelListaNoMuertes, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        jLabelListaNoContagiados.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelListaNoContagiados.setText("Lista Paises Con No.Contagiados");
        getContentPane().add(jLabelListaNoContagiados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabelNoMuertes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelNoMuertes.setText("Número De Muertes:");
        getContentPane().add(jLabelNoMuertes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));
        getContentPane().add(jTextFieldNoMuertes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 200, 30));

        jLabelNombrePais.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelNombrePais.setText("Nombre País:");
        getContentPane().add(jLabelNombrePais, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));
        getContentPane().add(jTextFieldNombrePais, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 200, 30));

        jLabelNoContagiados.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelNoContagiados.setText("Número De Contagiados:");
        getContentPane().add(jLabelNoContagiados, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));
        getContentPane().add(jTextFieldNoContagiados, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 200, 30));

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 300, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonMostrar.setText("Mostrar");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, -1, -1));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, -1, -1));

        jTextAreaListaPaises.setColumns(20);
        jTextAreaListaPaises.setRows(5);
        jScrollPane1.setViewportView(jTextAreaListaPaises);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 220, 260));

        jButtonExportar.setText("Exportar");
        jButtonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, -1, -1));

        jLabelTituloProyecto.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        jLabelTituloProyecto.setText("EL CORONAVIRUS ALIAS COVID-19");
        jPanel1.add(jLabelTituloProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 760, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        agregar();
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        modificar();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        eliminar();      
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        mostrar();
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportarActionPerformed
        exportar();
    }//GEN-LAST:event_jButtonExportarActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonExportar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JLabel jLabelListaNoContagiados;
    private javax.swing.JLabel jLabelListaNoMuertes;
    private javax.swing.JLabel jLabelNoContagiados;
    private javax.swing.JLabel jLabelNoMuertes;
    private javax.swing.JLabel jLabelNombrePais;
    private javax.swing.JLabel jLabelTituloProyecto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneListaNoContagiados;
    private javax.swing.JScrollPane jScrollPaneListaNoMuertes;
    private javax.swing.JTextArea jTextAreaListaNoContagiados;
    private javax.swing.JTextArea jTextAreaListaNoMuertes;
    private javax.swing.JTextArea jTextAreaListaPaises;
    private javax.swing.JTextField jTextFieldNoContagiados;
    private javax.swing.JTextField jTextFieldNoMuertes;
    private javax.swing.JTextField jTextFieldNombrePais;
    // End of variables declaration//GEN-END:variables

}
