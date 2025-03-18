package arreglosunidimensionales;

import java.util.Scanner;

public class MayorMenorArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Encontrar el número menor
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        // Encontrar el número mayor
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        
        System.out.println("\nEl número menor del arreglo es: " + menor);
        System.out.println("El número mayor del arreglo es: " + mayor);
        
        scanner.close();
    }
}