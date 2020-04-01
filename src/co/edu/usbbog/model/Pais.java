/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.model;

import co.edu.usbbog.controller.Covid;
import java.util.LinkedList;

/**
 *
 * @author hp
 */
public class Pais {

    public LinkedList<Covid> pais = new LinkedList<>();
    
    Covid co = new Covid();
    
    public void coronavirus(){
        
    }

    public void agregar(String nombrePais, int numeroContagiados, int numeroMuertos) {
        Covid c = new Covid(nombrePais, numeroContagiados, numeroMuertos);
        pais.add(c);
    }
    
    public String modificar(String nombrePais, int numeroContagiados, int numeroMuertos){
        Covid c = new Covid(nombrePais, numeroContagiados, numeroMuertos);
        String salida = "";
        for (int i = 0; i < pais.size(); i++) {
            if (nombrePais.equalsIgnoreCase(pais.get(i).getNombrePais())) {
                pais.set(i, c);
            } else {
                salida = "No existe el Pais";
            }            
        }
        return salida;
    }
       
    public String eliminar(String nombrePais){
        String salida = "";
        for (int i = 0; i < pais.size(); i++) {
            if (nombrePais.equalsIgnoreCase(pais.get(i).getNombrePais())) {                
                pais.remove(i);
            } else {
                salida = "No existe el Pais";
            }            
        }
        return salida;
    }

    public String mostrar() {
        String salida = "";
        for (Object listaPais : pais) {
            salida = salida + listaPais
                    + "\n-------------------------------------\n";
        }
        return salida;
    }
    
    public String mostrarTxt(){
        String salida = "";
        
        return salida;
    }
    
    public String mostrarPorContagiados() {
        for (int i = 0; i < pais.size() - 1; i++) {
            for (int j = 0; j < pais.size() - 1; j++) {
                if (pais.get(j).getNumeroContagiados() < pais.get(j + 1).getNumeroContagiados()) {                    
                    Covid aux = pais.get(j + 1);
                    Covid aux2 = pais.get(j);
                    pais.set(j, aux);
                    pais.set(j + 1, aux2);
                }
            }
        }
        return mostrar();
    }
    
    public String mostrarPorMuertes() {
        for (int i = 0; i < pais.size() - 1; i++) {
            for (int j = 0; j < pais.size() - 1; j++) {
                if (pais.get(j).getNumeroMuertos() < pais.get(j + 1).getNumeroMuertos()) {
                    Covid aux = pais.get(j + 1);
                    Covid aux2 = pais.get(j);
                    pais.set(j, aux);
                    pais.set(j + 1, aux2);
                }
            }
        }
        return mostrar();
    }
}
