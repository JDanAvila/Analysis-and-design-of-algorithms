/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class ReporteDAO implements ReporteDTO{
    
    private final ConexionMySQL mySQL;

    public ReporteDAO() {
        //this.mySQL = new ConexionMySQL("jdbc:oracle:thin:@localhost:1521:xe","system","Password123");
        this.mySQL = new ConexionMySQL("127.0.0.1", 3306, "panaderia_db", "Admin_Panaderia", "password");
        //192.168.56.1
    }

    @Override
    public DefaultTableModel mostrarPorFecha(DefaultTableModel dt, String fecha) {
        String sql = "SELECT fechaVenta, total FROM venta WHERE fechaVenta = \"" + fecha +"\";";
        System.out.println(sql);
        if (this.mySQL.conectar()) {
            try {
                Connection con = this.mySQL.getCon();
                Statement stm = con.createStatement();
                ResultSet rs = (ResultSet) stm.executeQuery(sql);
                Object[] fila = new Object[2];
                while (rs.next()) {
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getDouble(2);
                    dt.addRow(fila);
                }
                    rs.close();
                    stm.close();
                    con.close();                
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dt;    
    }
    
}
