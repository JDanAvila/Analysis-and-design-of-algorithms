package usb;

import java.util.Scanner;

public class Fibonacci {
    //recursividad
    public static int fibonacciRecursivo(int n) {
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else if(n >= 1){
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }else{
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }       
    }
    
    public static String fibonacciIterativo(int n) {
        int fibo = 0, a = 1, b, i = 0;
        do {
            b = fibo;
            fibo = a + fibo;
            a = b;
            System.out.print(a + " ");
            i++;
        } while (i <= n);
        return "";
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Introduce el tamaño para la serie fibonacci: ");
        int n = l.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciRecursivo(i) + " ");           
        }
        System.out.println("");
        
        System.out.println(fibonacciIterativo(n));
    }
}
