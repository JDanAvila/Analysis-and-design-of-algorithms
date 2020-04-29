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
public interface VentaDTO {
    public boolean agregar(Venta venta);
    public boolean modificar(Venta venta, int id);
    public boolean eliminar(int id);
    public Venta buscarPorId(int id);
    public DefaultTableModel mostrar(DefaultTableModel dt);
}
