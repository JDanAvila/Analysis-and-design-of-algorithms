/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller;

import co.edu.usbbog.model.Palabras;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Contador {
    ArrayList<Palabras> palabras = new ArrayList<Palabras>();

    public int contarEspacios(String poema, int indice, int espacios) {
        if (indice != poema.length()) {

            if (' ' == poema.charAt(indice)) {
                espacios++;
                indice++;
                espacios = contarEspacios(poema, indice, espacios);
                indice = poema.length();
            } else {
                indice++;
                espacios = contarEspacios(poema, indice, espacios);
                indice = poema.length();
            }
        }
        return espacios;

    }

    public int contadorVocales(String poema, int indice, int vocales) {
        if (indice != poema.length()) {
            if ('a' == poema.charAt(indice) || 'e' == poema.charAt(indice)
                    || 'i' == poema.charAt(indice) || 'o' == poema.charAt(indice) || 'u' == poema.charAt(indice)
                    || 'A' == poema.charAt(indice) || 'E' == poema.charAt(indice) || 'I' == poema.charAt(indice)
                    || 'O' == poema.charAt(indice) || 'U' == poema.charAt(indice)) {
                vocales++;
                indice++;
                vocales = contadorVocales(poema, indice, vocales);
                indice = poema.length();
            } else {
                indice++;
                vocales = contadorVocales(poema, indice, vocales);
                indice = poema.length();
            }
        }
        return vocales;
    }

    public int contadorConsonantes(String poema, int indice, int consonante) {
        if (indice != poema.length()) {
            if ('a' == poema.charAt(indice) || 'e' == poema.charAt(indice)
                    || 'i' == poema.charAt(indice) || 'o' == poema.charAt(indice) || 'u' == poema.charAt(indice)
                    || 'A' == poema.charAt(indice) || 'E' == poema.charAt(indice) || 'I' == poema.charAt(indice)
                    || 'O' == poema.charAt(indice) || 'U' == poema.charAt(indice)) {
                indice++;
                consonante = contadorConsonantes(poema, indice, consonante);
                indice = poema.length();
            } else {
                consonante++;
                indice++;
                consonante = contadorConsonantes(poema, indice, consonante);
                indice = poema.length();
            }
        }
        return consonante;
    }

    public int contadorLetras(String poema) {
        int contador = poema.length();
        return contador;
    }

    public void contarPalabras(String poema, int indice) {
        String palabra = "";
        int cont = 0;
        boolean condicion = true;
        boolean aux = false;
        if (indice < poema.length()) {
            do {
                if (indice < poema.length()) {
                    if (poema.charAt(indice) == ' ') {
                        condicion = false;
                    } else {
                        palabra = palabra + poema.charAt(indice);
                    }
                    indice++;
                } else {
                    condicion = false;
                }
            } while (condicion);
            if (palabras.isEmpty()) {
                Palabras nueva = new Palabras(palabra);
                palabras.add(nueva);
            } else {
                for (int j = 0; j < palabras.size(); j++) {
                    if (palabras.get(j).getPalabra().equalsIgnoreCase(palabra)) {
                        cont = palabras.get(j).getRepeticiones();
                        palabras.get(j).setRepeticiones(cont + 1);
                        aux = true;
                    }
                }
                if (aux == false) {
                    Palabras nueva = new Palabras(palabra);
                    palabras.add(nueva);
                }
            }

            palabra = "";
            condicion = true;
            contarPalabras(poema, indice);
            indice = poema.length();
        }

    }
}
