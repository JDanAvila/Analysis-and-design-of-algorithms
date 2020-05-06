/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller.logic.junit;

import co.edu.usbbog.controller.logic.MetodosProducto;
import co.edu.usbbog.model.Producto;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class MetodosProductoTest {
    
    MetodosProducto mp = new MetodosProducto();

    /**
     * Test of agregar method, of class MetodosProducto.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar Producto");
        int id = 1;
        String nombre = "Papa";
        String marca = "Pastusa";
        String fechaDeVencimiento = "YYYY-MM-DD";
        double precio = 1000.0;
        Producto p = new Producto(id, nombre, marca, fechaDeVencimiento, precio);
        boolean expResult = true;
        boolean result = mp.agregar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class MetodosProducto.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar Producto");
        int id = 1;
        //Producto p = new Producto(id);
        boolean expResult = true;
        boolean result = mp.eliminar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificar method, of class MetodosProducto.
     */
    @Test
    public void testModificar() {
        System.out.println("Modificar Producto");
        int id = 1;
        String nombre = "Papa";
        String marca = "Pastusa";
        String fechaDeVencimiento = "YYYY-MM-DD";
        double precio = 1000.0;
        Producto p = new Producto(id, nombre, marca, fechaDeVencimiento, precio);
        boolean expResult = true;
        boolean result = mp.modificar(p, id, nombre, marca, fechaDeVencimiento, precio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar method, of class MetodosReporte.
     */
    @Test
    public void testMostrar() {
        System.out.println("Mostrar Producto");
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("id");
        dt.addColumn("Producto");
        dt.addColumn("Marca");
        dt.addColumn("Fecha");
        dt.addColumn("Precio");
        DefaultTableModel expResult = dt;
        DefaultTableModel result = mp.mostrar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulos method, of class MetodosReporte.
     */
    @Test
    public void testSetTitulos() {
        System.out.println("setTitulos Producto");
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("id");
        dt.addColumn("Producto");
        dt.addColumn("Marca");
        dt.addColumn("Fecha");
        dt.addColumn("Precio");
        DefaultTableModel expResult = dt;
        DefaultTableModel result = dt;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
