/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.view;

import co.edu.usbbog.controller.Contador;
import co.edu.usbbog.controller.LeerPoema;
import java.io.IOException;

/**
 *
 * @author hp
 */
public class Principal {
    public static void main(String[] args) throws IOException{
        LeerPoema fichero = new LeerPoema();
        Contador contadores = new Contador();
        String cadena = fichero.cargarPoema();
        System.out.println(cadena);
        System.out.println(contadores.contadorVocales(cadena, 0, 0));
        System.out.println(contadores.contadorConsonantes(cadena, 0, 0));
        System.out.println(contadores.contarEspacios(cadena, 0, 0));

        contadores.contarPalabras(cadena, 0);
    }
}
