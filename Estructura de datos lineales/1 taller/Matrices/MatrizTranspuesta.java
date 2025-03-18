package Matrices;

import java.util.Scanner;

public class MatrizTranspuesta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar dimensiones de la matriz
        System.out.print("Ingrese el número de filas (m): ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int n = scanner.nextInt();
        
        // Inicializar matriz con valores predeterminados
        int[][] matriz = new int[m][n];
        int valor = 1;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = valor++;
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
        
        // Calcular la transpuesta
        int[][] transpuesta = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        
        // Imprimir la matriz transpuesta
        System.out.println("\nMatriz transpuesta:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}