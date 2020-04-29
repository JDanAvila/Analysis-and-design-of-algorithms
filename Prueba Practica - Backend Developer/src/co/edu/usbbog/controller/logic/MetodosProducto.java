/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller.logic;

import co.edu.usbbog.controller.persistence.ProductoDAO;
import co.edu.usbbog.model.Producto;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class MetodosProducto {
    private ArrayList<Producto> listaProductos;
    
    public MetodosProducto() {
        this.listaProductos = new ArrayList<>();
    }
    
    ProductoDAO pdao = new ProductoDAO();
    
    
    public boolean agregar(Producto producto) {
//        if(existeProducto(producto)){
//            this.listaProductos.add(producto);
            pdao.agregar(producto);
            return true;
//        }else{
//            return false;
//        }
    }
    
    public boolean eliminar(int id) {
//         for (Producto p : listaProductos) {
//            if (Objects.equals(p.getId(), id)) {
//                this.listaProductos.remove(p);
                pdao.eliminar(id);
                return true;
//            } else {
//                return false;
//            }
//        }
//        return false;
    }
    
    public boolean modificar(Producto producto, int id, String nombre, String marca, String fechaDeVencimiento, double precio) {
//        for (Producto p : listaProductos) {
//            if (p.getId() == id) {
//                p.setNombre(nombre);
//                p.setMarca(marca);
//                p.setFechaDeVencimiento(fechaDeVencimiento);
//                p.setPrecio(precio);
                pdao.modificar(producto, id);
//                return true;
//            } else if (pdao.modificar(producto, id)){
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
        return pdao.mostrar(setTitulos());       
    }
   
    private boolean existeProducto(Producto producto) {
        for (Producto p : listaProductos) {
            if (Objects.equals(p.getId(), producto.getId())) {
                return false;
            }
        }
        return true;
    }
    
    public DefaultTableModel setTitulos(){     
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("id");
        dt.addColumn("Producto");
        dt.addColumn("Marca");
        dt.addColumn("Fecha");
        dt.addColumn("Precio");
        return dt;           
    }
}
