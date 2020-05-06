/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller.persistence;

import co.edu.usbbog.model.Producto;
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
public class ProductoDAO implements ProductoDTO{
    private final ConexionMySQL mySQL;

    public ProductoDAO() {
        //this.mySQL = new ConexionMySQL("jdbc:oracle:thin:@localhost:1521:xe","system","Password123");
        this.mySQL = new ConexionMySQL("127.0.0.1", 3306, "panaderia_db", "Admin_Panaderia", "password");
        //192.168.56.1
    }

    @Override
    public boolean agregar(Producto producto) {
        if (producto!=null) {
            String sql="INSERT INTO producto VALUES(";
            sql+=producto.getId()+", ";
            sql+="\""+producto.getNombre()+"\""+", ";            
            sql+="\""+producto.getMarca()+"\""+", ";  
            sql+="\""+producto.getFechaDeVencimiento()+"\""+",";
            sql+=producto.getPrecio(); 
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
        }    
    }

    @Override
    public boolean modificar(Producto producto, int id) {
        String sql = "UPDATE producto SET ";
        sql += "id = " + producto.getId() + ", ";
        sql += "producto = \"" + producto.getNombre() + "\", ";
        sql += "marca = \"" + producto.getMarca() + "\", ";
        sql += "fechaDeVencimiento = \"" + producto.getFechaDeVencimiento() + "\", ";
        sql += "precio = " + producto.getPrecio();
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
        String sql = "DELETE FROM panaderia_db.producto WHERE " + "id = " + id + ";";
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
    public Producto buscarPorId(int id) {
        Producto producto = null;
        String sql="SELECT * FROM producto WHERE id = " + id+";";
        System.out.println(sql);
        if(this.mySQL.conectar()){
            try {
                Connection con = this.mySQL.getCon();
                Statement stm = con.createStatement();
                ResultSet rs = (ResultSet) stm.executeQuery(sql);
                while(rs.next()){
                producto = new Producto(
                    rs.getInt(1), 
                    rs.getString(2), 
                    rs.getString(3), 
                    rs.getString(4), 
                    rs.getDouble(5));   
                }
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return producto;
    }

    @Override
    public DefaultTableModel mostrar(DefaultTableModel dt) {
        String sql = "SELECT * FROM producto;";
        System.out.println(sql);
        if (this.mySQL.conectar()) {
            try {
                Connection con = this.mySQL.getCon();
                Statement stm = con.createStatement();
                ResultSet rs = (ResultSet) stm.executeQuery(sql);
                Object[] fila = new Object[5];
                while (rs.next()) {
                    fila[0] = rs.getInt(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
                    fila[3] = rs.getString(4);
                    fila[4] = rs.getDouble(5);
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
