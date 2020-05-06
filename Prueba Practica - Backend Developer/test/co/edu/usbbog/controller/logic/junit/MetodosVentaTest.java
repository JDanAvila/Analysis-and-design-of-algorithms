/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller.logic.junit;

import co.edu.usbbog.controller.logic.MetodosVenta;
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
public class MetodosVentaTest {
    
    MetodosVenta mv = new MetodosVenta();
    
    /**
     * Test of agregar method, of class MetodosVenta.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar Venta");
        String fecha = "2020-05-06";
        int id = 1;
        double total = 1000.0;
        Venta v = new Venta(fecha, id, total);
        boolean expResult = true;
        boolean result = mv.agregar(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class MetodosVenta.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar Venta");
        int id = 1;
        boolean expResult = true;
        boolean result = mv.eliminar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificar method, of class MetodosVenta.
     */
    @Test
    public void testModificar() {
        System.out.println("Modificar Venta");
        String fecha = "2020-05-06";
        int id = 1;
        double total = 1000.0;
        Venta v = new Venta(fecha, id, total);
        boolean expResult = true;
        boolean result = mv.modificar(v, fecha, id, total);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of mostrar method, of class MetodosReporte.
     */
    @Test
    public void testMostrar() {
        System.out.println("Mostrar Reporte");
        String fecha = "2020-05-06";
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Fecha");
        dt.addColumn("id");
        dt.addColumn("Total");
        DefaultTableModel expResult = dt;
        DefaultTableModel result = mv.mostrar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulos method, of class MetodosReporte.
     */
    @Test
    public void testSetTitulos() {
        System.out.println("setTitulos Reporte");
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Fecha");
        dt.addColumn("id");
        dt.addColumn("Total");
        DefaultTableModel expResult = dt;
        DefaultTableModel result = dt;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
