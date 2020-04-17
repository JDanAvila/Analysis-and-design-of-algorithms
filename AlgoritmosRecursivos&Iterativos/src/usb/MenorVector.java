package usb;

import java.util.Scanner;

public class MenorVector {
    public static int menorVectorRecursivo(int vector[], int size) {
        if (size == 0) {
            return vector[0];
        } else {
            if (vector[size] < menorVectorRecursivo(vector, size - 1)) {
                return vector[size];
            } else {
                return menorVectorRecursivo(vector, size - 1);
            }
        }
    }
    
    public static int menorVectorIterativo(int vector[],int menor){
        for (int i = 0; i < vector.length -1; i++) {
            if(vector[i]<menor) {
                menor = vector[i];
            }        
        }       
        return menor;
    }
    
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("Ingresa el tamaño del vector");
        int vector[] = new int[l.nextInt()];
        
        System.out.print("Introduce los Valores :");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = l.nextInt();
        }
        
        System.out.println(menorVectorRecursivo(vector, vector.length-1));
        System.out.println(menorVectorIterativo(vector, 0));
    }
}
