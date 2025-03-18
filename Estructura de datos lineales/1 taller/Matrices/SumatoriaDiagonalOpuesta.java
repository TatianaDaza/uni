package Matrices;

import java.util.Scanner;
import java.util.Random;

public class SumatoriaDiagonalOpuesta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Solicitar tamaño de la matriz cuadrada
        System.out.print("Ingrese el tamaño de la matriz cuadrada (n): ");
        int n = scanner.nextInt();
        
        // Inicializar matriz con números aleatorios entre 1 y 50
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(50) + 1;
            }
        }
        
        // Imprimir la matriz
        System.out.println("\nMatriz generada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Calcular la sumatoria de la diagonal opuesta a la principal
        int sumatoria = 0;
        for (int i = 0; i < n; i++) {
            sumatoria += matriz[i][n - 1 - i];
        }
        
        // Mostrar resultado
        System.out.println("\nLa sumatoria de los elementos de la diagonal opuesta a la principal es: " + sumatoria);
        
        // Mostrar elementos de la diagonal opuesta
        System.out.println("\nElementos de la diagonal opuesta a la principal:");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][n - 1 - i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}