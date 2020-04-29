/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller.persistence;

import co.edu.usbbog.model.Venta;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public interface ReporteDTO {
    public DefaultTableModel mostrarPorFecha(DefaultTableModel dt, String fecha);
}
