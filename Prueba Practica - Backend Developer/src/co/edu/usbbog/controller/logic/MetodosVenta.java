/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller.logic;

import co.edu.usbbog.controller.persistence.VentaDAO;
import co.edu.usbbog.model.Producto;
import co.edu.usbbog.model.Venta;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class MetodosVenta {
    private ArrayList<Producto> listaProductos;
    
    public MetodosVenta() {
        this.listaProductos = new ArrayList<>();
    }
    
    VentaDAO vdao = new VentaDAO();
    
    
    public boolean agregar(Venta venta) {
//        if(existeProducto(producto)){
//            this.listaProductos.add(producto);
            vdao.agregar(venta);
            return true;
//        }else{
//            return false;
//        }
    }
    
    public boolean eliminar(int id) {
//         for (Producto p : listaProductos) {
//            if (Objects.equals(p.getId(), id)) {
//                this.listaProductos.remove(p);
                vdao.eliminar(id);
                return true;
//            } else {
//                return false;
//            }
//        }
//        return false;
    }
    
    public boolean modificar(Venta venta, String fecha, int id, double total) {
//        for (Producto p : listaProductos) {
//            if (p.getId() == id) {
//                p.setNombre(nombre);
//                p.setMarca(marca);
//                p.setFechaDeVencimiento(fechaDeVencimiento);
//                p.setPrecio(precio);
                vdao.modificar(venta, id);
//                return true;
//            } else if (vdao.modificar(producto, id)){
//                return true;
//            } else {
//                return false;
//            }
//        }
        return true;
    }  
    
    public DefaultTableModel mostrar(){
        setTitulos();
        //pdao.mostrar(setTitulos());        
        return vdao.mostrar(setTitulos());       
    }
   
    private boolean existeProducto(Venta venta) {
        for (Producto p : listaProductos) {
            if (Objects.equals(p.getId(), venta.getId())) {
                return false;
            }
        }
        return true;
    }
    
    public DefaultTableModel setTitulos(){     
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Fecha");
        dt.addColumn("id");
        dt.addColumn("Total");
        return dt;           
    }
}
