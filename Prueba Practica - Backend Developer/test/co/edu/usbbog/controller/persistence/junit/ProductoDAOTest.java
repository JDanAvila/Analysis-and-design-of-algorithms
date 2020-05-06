/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller.persistence.junit;

import co.edu.usbbog.controller.persistence.ProductoDAO;
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
public class ProductoDAOTest {
    
    ProductoDAO pdao = new ProductoDAO();

    /**
     * Test of agregar method, of class ProductoDAO.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar ProductoDAO");
        int id = 1;
        String nombre = "Papa";
        String marca = "Pastusa";
        String fechaDeVencimiento = "YYYY-MM-DD";
        double precio = 1000.0;
        Producto p  = new Producto(id, nombre, marca, fechaDeVencimiento, precio);
        boolean expResult = false;
        boolean result = pdao.agregar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificar method, of class ProductoDAO.
     */
    @Test
    public void testModificar() {
        System.out.println("Modificar ProductoDAO");
        int id = 1;
        String nombre = "Papa";
        String marca = "Pastusa";
        String fechaDeVencimiento = "YYYY-MM-DD";
        double precio = 1000.0;
        Producto p  = new Producto(id, nombre, marca, fechaDeVencimiento, precio);
        boolean expResult = false;
        boolean result = pdao.modificar(p, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class ProductoDAO.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar ProductoDAO");
        int id = 1;
        boolean expResult = true;
        boolean result = pdao.eliminar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
    * Test of buscarPorId method, of class ProductoDAO.
    */
    @Test
    public void testBuscarPorId() {
        System.out.println("BuscarPorId ProductoDAO");
        int id = 1;
        Producto expResult = null;
        Producto result = pdao.buscarPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of mostrar method, of class ProductoDAO.
     */
    @Test
    public void testMostrar() {
        System.out.println("Mostrar ProductoDAO");
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("id");
        dt.addColumn("Producto");
        dt.addColumn("Marca");
        dt.addColumn("Fecha");
        dt.addColumn("Precio");
        DefaultTableModel expResult = dt;
        DefaultTableModel result = pdao.mostrar(dt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
