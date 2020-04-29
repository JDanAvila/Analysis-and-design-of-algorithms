/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller.persistence;

import co.edu.usbbog.model.Producto;
import co.edu.usbbog.model.Venta;
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
public class VentaDAO implements VentaDTO{
    private final ConexionMySQL mySQL;

    public VentaDAO() {
        //this.mySQL = new ConexionMySQL("jdbc:oracle:thin:@localhost:1521:xe","system","Password123");
        this.mySQL = new ConexionMySQL("127.0.0.1", 3306, "panaderia_db", "Admin_Panaderia", "password");
        //192.168.56.1
    }
    @Override
    public boolean agregar(Venta venta) {
        if (venta!=null) {
            String sql="INSERT INTO venta VALUES(";
            sql+="\""+venta.getFecha()+"\""+", ";            
            sql+=venta.getId()+", ";  
            sql+=venta.getTotal();
            sql+=");";
            System.out.println(sql);
            if(this.mySQL.conectar()){
                Connection con = this.mySQL.getCon();
                try {
                    Statement stm = con.createStatement();
                    stm.execute(sql);
                    stm.close();
                    con.close();
                    return true;
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                    return false;
                }
            }else{
                return false;
            }           
        } else {
            return false;
        }    }

    @Override
    public boolean modificar(Venta venta, int id) {
String sql = "UPDATE venta SET ";
        sql += "id = \"" + venta.getFecha() + "\", ";
        sql += "producto = " + venta.getId()+ ", ";
        sql += "precio = " + venta.getTotal();
        sql += " WHERE id = " + id + ";";
        System.out.println(sql);
        if (this.mySQL.conectar()) {
            Connection con = this.mySQL.getCon();
            try {
                Statement stm = con.createStatement();
                stm.execute(sql);
                stm.close();
                con.close();
                return true;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return false;
            }
        } else {
            return false;
        }             
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "DELETE FROM panaderia_db.venta WHERE " + "id = " + id + ";";
        System.out.println(sql);
        if (this.mySQL.conectar()) {
            Connection con = this.mySQL.getCon();
            try {
                Statement stm = con.createStatement();
                stm.execute(sql);
                stm.close();
                con.close();
                return true;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return false;
            }
        } else {
            return false;
        }    }

    @Override
    public Venta buscarPorId(int id) {
        Venta venta = null;
        String sql="SELECT * venta WHERE id = " + id+";";
        System.out.println(sql);
        if(this.mySQL.conectar()){
            try {
                Connection con = this.mySQL.getCon();
                Statement stm = con.createStatement();
                ResultSet rs = (ResultSet) stm.executeQuery(sql);
                while(rs.next()){
                venta = new Venta(
                    rs.getString(1), 
                    rs.getInt(2), 
                    rs.getDouble(3)
                );   
                }
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return venta;
    }

    @Override
    public DefaultTableModel mostrar(DefaultTableModel dt) {
        String sql = "SELECT * FROM venta;";
        System.out.println(sql);
        if (this.mySQL.conectar()) {
            try {
                Connection con = this.mySQL.getCon();
                Statement stm = con.createStatement();
                ResultSet rs = (ResultSet) stm.executeQuery(sql);
                Object[] fila = new Object[3];
                while (rs.next()) {
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getInt(2);
                    fila[2] = rs.getDouble(3);
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
