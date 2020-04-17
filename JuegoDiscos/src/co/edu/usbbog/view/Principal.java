/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.view;

import co.edu.usbbog.controller.Metodos;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Principal {
    public static void punto5() {
        Metodos torreA = new Metodos();
        torreA.push(4);
        torreA.push(3);
        torreA.push(2);
        torreA.push(1);
        Metodos torreB = new Metodos();
        Metodos torreC = new Metodos();
        boolean continuar = true;
        while (continuar) {
            torreA.imprimir();
            torreB.imprimir();
            torreC.imprimir();
            System.out.println("Extraer de la torre: ");
            Scanner sc = new Scanner(System.in);
            String torre = sc.nextLine();
            String SegundoPaso;
            switch (torre) {
                case "A":
                    System.out.println("Mover a la torre: ");
                    SegundoPaso = sc.nextLine();
                    switch (SegundoPaso) {
                        case "B":
                            torreB.apilar(torreA.desapilar());
                            break;
                        case "C":
                            torreC.apilar(torreA.desapilar());
                            break;
                    }
                    break;
                case "B":
                    System.out.println("Mover a la torre: ");
                    SegundoPaso = sc.nextLine();
                    switch (SegundoPaso) {
                        case "A":
                            torreA.apilar(torreB.desapilar());
                            break;
                        case "C":
                            torreC.apilar(torreB.desapilar());
                            break;
                    }
                    break;
                case "C":
                    System.out.println("Mover a la torre: ");
                    SegundoPaso = sc.nextLine();
                    switch (SegundoPaso) {
                        case "A":
                            torreA.apilar(torreC.desapilar());
                            break;
                        case "B":
                            torreB.apilar(torreC.desapilar());
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
