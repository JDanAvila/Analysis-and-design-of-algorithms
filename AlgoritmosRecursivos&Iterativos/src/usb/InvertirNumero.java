package usb;

import java.util.Scanner;

public class InvertirNumero {

    public static String invertirNumeroRecursivo(int num) {
        if (num < 10) {
            return String.valueOf(num);
        } else {
            return String.valueOf(num % 10) + invertirNumeroRecursivo(num / 10);
        }
    }
    
    public static String invertirNumeroIterativo(int num) {
        String invertirNumero = String.valueOf(num), invertirNumeroInvertido = "";
        for (int x = invertirNumero.length() - 1; x >= 0; x--) {
            invertirNumeroInvertido = invertirNumeroInvertido + invertirNumero.charAt(x);
        }
        return invertirNumeroInvertido;
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Introduce el numero para invertir: ");
        int n = l.nextInt();
        System.out.println(invertirNumeroRecursivo(n));
        System.out.println(invertirNumeroIterativo(n));
    }
}
