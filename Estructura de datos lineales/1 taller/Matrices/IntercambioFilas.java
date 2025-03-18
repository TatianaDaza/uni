package Matrices;

import java.util.Scanner;
import java.util.Random;

public class IntercambioFilas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Solicitar dimensiones de la matriz
        System.out.print("Ingrese el número de filas (m): ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int n = scanner.nextInt();
        
        // Verificar que la matriz tenga al menos 2 filas
        if (m < 2) {
            System.out.println("La matriz debe tener al menos 2 filas para intercambiar.");
            scanner.close();
            return;
        }
        
        // Inicializar matriz con números aleatorios entre 1 y 100
        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
        
        // Imprimir la matriz original
        System.out.println("\nMatriz original:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Intercambiar la primera fila con la segunda
        for (int j = 0; j < n; j++) {
            int temp = matriz[0][j];
            matriz[0][j] = matriz[1][j];
            matriz[1][j] = temp;
        }
        
        // Imprimir la matriz después del intercambio
        System.out.println("\nMatriz después de intercambiar la primera fila con la segunda:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}