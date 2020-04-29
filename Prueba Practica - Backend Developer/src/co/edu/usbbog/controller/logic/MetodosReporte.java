/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller.logic;

import co.edu.usbbog.controller.persistence.ReporteDAO;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class MetodosReporte {
    
    ReporteDAO rdao = new ReporteDAO();
    
    public DefaultTableModel mostrar(String fecha){
        setTitulos();
        //pdao.mostrar(setTitulos());        
        return rdao.mostrarPorFecha(setTitulos(), fecha);       
    }
    
    public DefaultTableModel setTitulos() {
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Fecha");
        dt.addColumn("Total");
        return dt;
    }
}
