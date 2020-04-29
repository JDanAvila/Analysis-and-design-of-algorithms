/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.model;

import java.util.Date;


/**
 *
 * @author hp
 */
public class Producto {
    int id;
    String nombre;
    String marca;
    String fechaDeVencimiento;
    double precio;

    public Producto(int id) {
        this.id = id;
    }

    public Producto(int id, String nombre, String marca, String fechaDeVencimiento, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.precio = precio;
    }    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
}
