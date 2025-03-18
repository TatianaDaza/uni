package Matrices;

import java.util.Scanner;
import java.util.Random;

public class MatrizSimetrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Solicitar tamaño de la matriz cuadrada
        System.out.print("Ingrese el tamaño de la matriz cuadrada (n): ");
        int n = scanner.nextInt();
        
        // Inicializar matriz con números aleatorios entre 1 y 100
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
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
        
        // Verificar si la matriz es simétrica
        boolean esSimetrica = true;
        for (int i = 0; i < n && esSimetrica; i++) {
            for (int j = 0; j < n && esSimetrica; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                }
            }
        }
        
        // Mostrar resultado
        if (esSimetrica) {
            System.out.println("\nLa matriz ES simétrica.");
        } else {
            System.out.println("\nLa matriz NO es simétrica.");
        }
        
        // Imprimir los números de las esquinas
        System.out.println("\nNúmeros de las esquinas:");
        System.out.println("Superior izquierda: " + matriz[0][0]);
        System.out.println("Superior derecha: " + matriz[0][n-1]);
        System.out.println("Inferior izquierda: " + matriz[n-1][0]);
        System.out.println("Inferior derecha: " + matriz[n-1][n-1]);
        
        scanner.close();
    }
}