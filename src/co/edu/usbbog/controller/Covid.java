/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.controller;

/**
 *
 * @author hp
 */
public class Covid {

    String nombrePais;
    int numeroContagiados;
    int numeroMuertos;

    public Covid() {
    }

    public Covid(String nombrePais, int numeroContagiados, int numeroMuertos) {
        this.nombrePais = nombrePais;
        this.numeroContagiados = numeroContagiados;
        this.numeroMuertos = numeroMuertos;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public int getNumeroContagiados() {
        return numeroContagiados;
    }

    public void setNumeroContagiados(int numeroContagiados) {
        this.numeroContagiados = numeroContagiados;
    }

    public int getNumeroMuertos() {
        return numeroMuertos;
    }

    public void setNumeroMuertos(int numeroMuertos) {
        this.numeroMuertos = numeroMuertos;
    }

 
    @Override
    public String toString() {
        return "País: " + nombrePais + 
                "\nNumero Contagiados: " + numeroContagiados +
                "\nNumero Muertes: " + numeroMuertos;        
    }

}
