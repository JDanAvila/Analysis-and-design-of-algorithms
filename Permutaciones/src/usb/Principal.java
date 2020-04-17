/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usb;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Principal {
    public static void permutaciones(String a, LinkedList<String> conjunto) {
        if (conjunto.size() == 1) {
            System.out.println(a + conjunto.get(0));
        }
        for (int i = 0; i < conjunto.size(); i++) {
            String b = conjunto.remove(i);
            permutaciones(a + b, conjunto);
            conjunto.add(i, b);
        }
    }

    public static void main(String[] args) {
        Scanner lector =  new Scanner(System.in);
        LinkedList<String> conjunto = new LinkedList<String>();
        String f;

        System.out.println("Digite el tamaño del cadena: ");
        int n = lector.nextInt();

        System.out.print("Digite los Valores: ");
        for (int i = 0; i < n; i++) {
            f = lector.next();
            conjunto.add(f);
        }
        permutaciones("", conjunto);
    }    
}
