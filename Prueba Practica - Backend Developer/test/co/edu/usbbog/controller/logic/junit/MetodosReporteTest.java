/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller.logic.junit;

import co.edu.usbbog.controller.logic.MetodosReporte;
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
public class MetodosReporteTest {
    
    MetodosReporte mr = new MetodosReporte();

    /**
     * Test of mostrar method, of class MetodosReporte.
     */
    @Test
    public void testMostrar() {
        System.out.println("Mostrar Reporte");
        String fecha = "2020-05-06";
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Fecha");
        dt.addColumn("Total");
        DefaultTableModel expResult = dt;
        DefaultTableModel result = mr.mostrar(fecha);
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
        dt.addColumn("Total");
        DefaultTableModel expResult = dt;
        DefaultTableModel result = dt;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
