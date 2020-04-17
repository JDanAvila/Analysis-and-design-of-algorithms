/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author hp
 */
public class LeerPoema {
    public String cargarPoema() throws FileNotFoundException, IOException {
        String poema = "";
        FileReader file = new FileReader("C:\\Users\\hp\\3D Objects\\UNIVERSIDAD\\QUINTO SEMESTRE\\Analisis y Diseño de Algoritmos\\Taller 4\\PalabrasRepetidasPoema\\Poema.txt");
        BufferedReader buffer = new BufferedReader(file);
        boolean validacion = true;
        String aux = "";
        while (validacion) {
            aux = buffer.readLine();
            if (aux == null) {
                validacion = false;
            } else {
                poema = poema + " " + aux;
            }
        }
        return poema;
    }
}

//"C:\\Users\\hp\\3D Objects\\UNIVERSIDAD\\QUINTO SEMESTRE\\Analisis y Diseño de Algoritmos\\Taller 4\\PalabrasRepetidasPoema\\Poema.txt"
