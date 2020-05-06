/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller.persistence;

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
public class ReporteDAOTest {
    
    ReporteDAO rdao = new ReporteDAO();

    /**
     * Test of mostrarPorFecha method, of class ReporteDAO.
     */
    @Test
    public void testMostrarPorFecha() {
        System.out.println("mostrarPorFecha ReporteDAO");
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Fecha");
        dt.addColumn("Total");
        String fecha = "2020-05-06";
        DefaultTableModel expResult = dt;
        DefaultTableModel result = rdao.mostrarPorFecha(dt, fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
