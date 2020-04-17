package usb;

import java.util.Scanner;

public class SumarVector {

    public static int sumarValoresRecursivo(int array[], int posArray) {      
        int tam = posArray;
        int rta;

        if (tam == 0) {
            return array[tam];
        } else {   
            rta = (array[tam]) + sumarValoresRecursivo(array, tam - 1);
        }
       return rta;
    }
    
    public static int sumarValoresIterativo(int array[], int sumaTotal) {
        for (int i = 0; i < array.length; i++) {
            sumaTotal += array[i];
        }
        return sumaTotal;
    }


    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del vector");
        int arr[] = new int[l.nextInt()];

        System.out.print("Introduce los Valores :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = l.nextInt();
        }
        System.out.println(sumarValoresRecursivo(arr, arr.length - 1));
        System.out.println(sumarValoresIterativo(arr, 0));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr.length-1+" "+arr[i]);
//        }
    }
}
