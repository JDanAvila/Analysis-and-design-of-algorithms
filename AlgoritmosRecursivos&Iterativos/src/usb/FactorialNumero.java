package usb;

import java.util.Scanner;

public class FactorialNumero {
    //METODO RECURSIVO
    public static int factorialRecursivo(int n) {
        if (n == 0) {
            return 1; //Caso Base
        } else {
            return n * factorialRecursivo(n - 1);
        }
    }
   
    //METODO ITERATIVO
    public static int factorialIterativo(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }
   
    
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Introduce el numero para hallar su facturial: ");
        int n = l.nextInt();
        System.out.println(factorialRecursivo(n));
        System.out.println(factorialIterativo(n));       
    }
}
