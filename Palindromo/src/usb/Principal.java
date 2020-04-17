/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usb;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Principal {
    public static boolean palindromo(String n) {
        if (n.length() <= 1) {
            return true;
        } else {
            if (n.charAt(0) == n.charAt(n.length() - 1)) {
                return palindromo(n.substring(1, n.length() - 1));
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese palabra: ");
        String n = lector.next();

        System.out.println(palindromo(n));
    }
}
