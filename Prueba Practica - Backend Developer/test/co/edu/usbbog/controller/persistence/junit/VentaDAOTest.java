/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller.persistence.junit;

import co.edu.usbbog.controller.persistence.VentaDAO;
import co.edu.usbbog.model.Venta;
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
public class VentaDAOTest {
    
    VentaDAO vdao =  new VentaDAO();
    
    /**
     * Test of agregar method, of class VentaDAO.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar VentaDAO");
        String fecha = "";
        int id = 1;
        double total = 1000.0;
        Venta v = new Venta(fecha, id, total);
        boolean expResult = false;
        boolean result = vdao.agregar(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificar method, of class VentaDAO.
     */
    @Test
    public void testModificar() {
        System.out.println("Modificar VentaDAO");
        String fecha = "";
        int id = 1;
        double total = 1000.0;
        Venta v = new Venta(fecha, id, total);
        boolean expResult = false;
        boolean result = vdao.modificar(v, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class VentaDAO.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar VentaDAO");
        int id = 1;
        boolean expResult = true;
        boolean result = vdao.eliminar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorId method, of class VentaDAO.
     */
    @Test
    public void testBuscarPorId() {
        System.out.println("buscarPorId VentaDAO");
        int id = 1;
        Venta expResult = null;
        Venta result = vdao.buscarPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar method, of class VentaDAO.
     */
    @Test
    public void testMostrar() {
        System.out.println("Mostrar VentaDAO");
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("id");
        dt.addColumn("Producto");
        dt.addColumn("Marca");
        dt.addColumn("Fecha");
        dt.addColumn("Precio");
        DefaultTableModel expResult = dt;
        DefaultTableModel result = vdao.mostrar(dt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
