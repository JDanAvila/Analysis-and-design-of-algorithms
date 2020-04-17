/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller;

import java.util.Stack;

/**
 *
 * @author hp
 */
public class Metodos {
    Stack< Integer> torre = new Stack< Integer>();

    public void push(int disco) {
        torre.push(disco);
    }

    public boolean apilar(int disco) {
        boolean apilado = false;
        if (torre.empty()|| disco < torre.peek()) {
            torre.push(disco);
            apilado = true;
        }
        return apilado;
    }

    public int desapilar() {
        int elemento = 0;
        elemento = torre.pop();
        return elemento;
    }

    public void imprimir() {
        torre.toString();
    }
}
