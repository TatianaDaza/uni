package arreglosunidimensionales;

import java.util.Scanner;

public class FactorialNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números a procesar: ");
        int n = scanner.nextInt();
        
        int[] numeros = new int[n];
        long[] factoriales = new long[n];
        
        // Leer los n números
        System.out.println("Ingrese los " + n + " números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
            factoriales[i] = calcularFactorial(numeros[i]);
        }
        
        // Imprimir los arreglos
        System.out.println("\nNúmeros iniciales:");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println("\nFactoriales correspondientes:");
        for (int i = 0; i < n; i++) {
            System.out.print(factoriales[i] + " ");
        }
        
        scanner.close();
    }
    
    // Método para calcular el factorial de un número
    public static long calcularFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        
        long factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}