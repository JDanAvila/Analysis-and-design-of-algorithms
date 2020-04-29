/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.model;

/**
 *
 * @author hp
 */
public class Venta {
    String fecha;
    int id;
    double total;

    public Venta(int id) {
        this.id = id;
    }

    public Venta(String fecha, int id, double total) {
        this.fecha = fecha;
        this.id = id;
        this.total = total;
    }   

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int idProducto) {
        this.id = idProducto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
