/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller.persistence;

import co.edu.usbbog.model.Producto;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public interface ProductoDTO {
    public boolean agregar(Producto producto);
    public boolean modificar(Producto producto, int id);
    public boolean eliminar(int id);
    public Producto buscarPorId(int id);
    public DefaultTableModel mostrar(DefaultTableModel dt);
}
