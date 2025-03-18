package arreglosunidimensionales;

import java.util.Scanner;

public class InvertirNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números a procesar: ");
        int n = scanner.nextInt();
        
        int[] numeros = new int[n];
        int[] invertidos = new int[n];
        
        // Leer los n números
        System.out.println("Ingrese los " + n + " números enteros:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
            invertidos[i] = invertirNumero(numeros[i]);
        }
        
        // Imprimir los arreglos
        System.out.println("\nNúmeros originales:");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println("\nNúmeros invertidos:");
        for (int i = 0; i < n; i++) {
            System.out.print(invertidos[i] + " ");
        }
        
        scanner.close();
    }
    
    // Método para invertir un número
    public static int invertirNumero(int num) {
        int invertido = 0;
        boolean esNegativo = num < 0;
        
        // Convertir a positivo para invertir
        if (esNegativo) {
            num = -num;
        }
        
        while (num > 0) {
            invertido = invertido * 10 + num % 10;
            num /= 10;
        }
        
        // Si era negativo, el invertido también debe serlo
        return esNegativo ? -invertido : invertido;
    }
}