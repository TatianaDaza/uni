package Matrices;

import java.util.Scanner;
import java.util.Random;

public class BusquedaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Solicitar dimensiones de la matriz
        System.out.print("Ingrese el número de filas (m): ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int n = scanner.nextInt();
        
        // Inicializar matriz con números aleatorios entre 1 y 100
        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
        
        // Imprimir la matriz
        System.out.println("\nMatriz generada:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Solicitar número a buscar
        System.out.print("\nIngrese el número a buscar: ");
        int numeroBuscar = scanner.nextInt();
        
        // Buscar el número en la matriz
        boolean encontrado = false;
        int filaEncontrada = -1;
        int columnaEncontrada = -1;
        
        for (int i = 0; i < m && !encontrado; i++) {
            for (int j = 0; j < n && !encontrado; j++) {
                if (matriz[i][j] == numeroBuscar) {
                    encontrado = true;
                    filaEncontrada = i;
                    columnaEncontrada = j;
                }
            }
        }
        
        // Mostrar resultado
        if (encontrado) {
            System.out.println("El número " + numeroBuscar + " se encuentra en la posición: fila " + 
                               filaEncontrada + ", columna " + columnaEncontrada);
        } else {
            System.out.println("El número " + numeroBuscar + " no se encuentra en la matriz.");
        }
        
        scanner.close();
    }
}