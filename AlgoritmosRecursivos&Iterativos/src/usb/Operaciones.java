package usb;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Operaciones {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opc = 1;
        do {
            System.out.println("Digite los numeros a operar: ");
            System.out.println("Primer numero: ");
            int a = lector.nextInt();
            System.out.println("Segundo numero: ");
            int b = lector.nextInt();

            System.out.println("Seleccione una opcion" + "\n"
                    + "1.Sumar" + "\n"
                    + "2.Restar" + "\n"
                    + "3.Multiplicar" + "\n"
                    + "4.Dividir" + "\n"
                    + "5.Potencia de los dos numeros" + "\n"
                    + "6.salir");

            int opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El resultado es: " + sumaRecursivo(a, b));
                    System.out.println("El resultado es: " + sumaIterativo(a, b));
                    break;
                case 2:
                    System.out.println("El resultado es: " + restarRecursivo(a, b));
                    System.out.println("El resultado es: " + restarIterativo(a, b));
                    break;
                case 3:
                    System.out.println("El resultado es: " + multiplicarRecursivo(a, b));
                    System.out.println("El resultado es: " + multiplicarIterativo(a, b));
                    break;
                case 4:
                    System.out.println("El resultado es: " + dividirRecursivo(a, b));
                    System.out.println("El resultado es: " + dividirIterativo(a, b));
                    break;
                case 5:
                    System.out.println("Dijite el exponente:");
                    int expo = lector.nextInt();
                    System.out.println("El resultado del exponente " + a + "es: " + potenciaNum1Recursivo(a, expo));
                    System.out.println("El resultado del exponente " + a + "es: " + potenciaNum1Iterativo(a, expo));
                    System.out.println("El resultado del exponente " + b + "es: " + potenciaNum2Recursivo(b, expo));
                    System.out.println("El resultado del exponente " + b + "es: " + potenciaNum2Iterativo(b, expo));
                    break;
                case 6:
                    opc = 0;
            }

        } while (opc != 0);
    }

    public static int sumaRecursivo(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            if (b == 0) {
                return a;
            } else {
                return 1 + sumaRecursivo(a, b - 1);
            }
        }
    }
    
    public static int sumaIterativo(int a, int b) {
        int rta = a + b;
        return rta;
    }

    public static int restarRecursivo(int a, int b) {
        if (a == 0) {
            return -b;
        } else {
            if (b == 0) {
                return a;
            } else {
                if (a > b) {
                    return 1 + restarRecursivo(a, b + 1);
                } else {
                    if (b > a) {
                        return -1 + restarRecursivo(a + 1, b);
                    }
                }
            }
            return 0;
        }
    }
    
    public static int restarIterativo(int a, int b) {
        int rta = a - b;
        return rta;
    }

    public static int multiplicarRecursivo(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else {
            if (a == 1) {
                return b;
            } else {
                if (b == 1) {
                    return a;
                } else {
                    return a + multiplicarRecursivo(a, b - 1);
                }
            }
        }
    }
    
    public static int multiplicarIterativo(int a, int b){
        int rta = a * b;
        return rta;
    }
    
    public static int dividirRecursivo(int a, int b) {
        if (b > a) {
            return 0;
        } else {
            return 1 + dividirRecursivo(a - b, b);
        }
    }
    
    public static int dividirIterativo(int a, int b){
        int rta = a / b;
        return rta;
    }
    
    public static int potenciaNum1Recursivo(int a, int expo) {
        if (expo == 0) {
            return 1;
        } else {
            if (expo == 1) {
                return a;
            } else {
                return a * potenciaNum1Recursivo(a, expo - 1);
            }
        }
    }
    
    public static double potenciaNum1Iterativo(int a, int expo) {
        double rta = Math.pow(a, expo);
        return rta;
    }
    
    public static int potenciaNum2Recursivo(int b, int expo) {
        if (expo == 0) {
            return 1;
        } else {
            if (expo == 1) {
                return b;
            } else {
                return b * potenciaNum2Recursivo(b, expo - 1);
            }
        }
    }
    
    public static double potenciaNum2Iterativo(int b, int expo) {
        double rta = Math.pow(b, expo);
        return rta;
    }
}
