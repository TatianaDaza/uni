package Juego;

import java.util.Random;
import java.util.Scanner;

public class BatallaNaval {
    public static void main(String[] args) {
        char[][] tableroOculto = new char[10][10]; // Tablero con barcos (oculto)
        char[][] tableroVisible = new char[10][10]; // Tablero visible para el jugador
        int barcosRestantes = 5; // Número total de barcos
        int turnosMaximos = 10;
        int turnosActuales = 0;
        
        inicializarTablero(tableroOculto, 'O');
        inicializarTablero(tableroVisible, 'O');
        colocarBarcos(tableroOculto);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¡Bienvenido a Batalla Naval!");
        System.out.println("Tienes 10 turnos para hundir todos los barcos.");
        System.out.println("O: Agua | -: Fallo | H: Acierto");
        
        while (barcosRestantes > 0 && turnosActuales < turnosMaximos) {
            System.out.println("\n--- Turno " + (turnosActuales + 1) + " ---");
            mostrarTablero(tableroVisible);
            
            // Pedir coordenadas al jugador
            System.out.print("Ingresa fila (0-9): ");
            int fila = scanner.nextInt();
            System.out.print("Ingresa columna (0-9): ");
            int columna = scanner.nextInt();
            
            // Verificar si las coordenadas son válidas
            if (fila < 0 || fila >= 10 || columna < 0 || columna >= 10) {
                System.out.println("Coordenadas inválidas. Intenta de nuevo.");
                continue;
            }
            
            // Verificar si ya se disparó en esa posición
            if (tableroVisible[fila][columna] != 'O') {
                System.out.println("Ya has disparado en esa posición. Intenta de nuevo.");
                continue;
            }
            
            // Realizar disparo
            if (tableroOculto[fila][columna] == 'X') {
                tableroVisible[fila][columna] = 'H';
                tableroOculto[fila][columna] = 'H';
                System.out.println("¡Acierto! Has golpeado un barco.");
                barcosRestantes--;
            } else {
                tableroVisible[fila][columna] = '-';
                System.out.println("¡Fallo! No hay barco en esa posición.");
            }
            
            turnosActuales++;
        }
        
        // Mostrar resultado final
        System.out.println("\n--- Fin del juego ---");
        mostrarTablero(tableroVisible);
        
        if (barcosRestantes == 0) {
            System.out.println("¡Felicidades! Has hundido todos los barcos en " + turnosActuales + " turnos.");
        } else {
            System.out.println("Se han agotado tus turnos. Quedan " + barcosRestantes + " barcos por hundir.");
            System.out.println("Así estaba el tablero:");
            mostrarTablero(tableroOculto);
        }
        
        scanner.close();
    }
    
    // Inicializar tablero con el caracter indicado
    public static void inicializarTablero(char[][] tablero, char caracter) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = caracter;
            }
        }
    }
    
    // Mostrar tablero
    public static void mostrarTablero(char[][] tablero) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Colocar barcos en el tablero
    public static void colocarBarcos(char[][] tablero) {
        Random random = new Random();
        
        // Definir tamaños de los barcos
        int[] tamañosBarcos = {5, 4, 3, 3, 2};
        
        for (int i = 0; i < tamañosBarcos.length; i++) {
            int tamaño = tamañosBarcos[i];
            boolean colocado = false;
            
            while (!colocado) {
                // Orientación: 0 = horizontal, 1 = vertical
                int orientacion = random.nextInt(2);
                
                int fila, columna;
                
                if (orientacion == 0) { // Horizontal
                    fila = random.nextInt(10);
                    columna = random.nextInt(10 - tamaño + 1);
                } else { // Vertical
                    fila = random.nextInt(10 - tamaño + 1);
                    columna = random.nextInt(10);
                }
                
                // Verificar si se puede colocar el barco
                boolean puedeColocar = true;
                for (int j = 0; j < tamaño; j++) {
                    if (orientacion == 0) { // Horizontal
                        if (tablero[fila][columna + j] == 'X') {
                            puedeColocar = false;
                            break;
                        }
                    } else { // Vertical
                        if (tablero[fila + j][columna] == 'X') {
                            puedeColocar = false;
                            break;
                        }
                    }
                }
                
                // Colocar el barco si es posible
                if (puedeColocar) {
                    for (int j = 0; j < tamaño; j++) {
                        if (orientacion == 0) { // Horizontal
                            tablero[fila][columna + j] = 'X';
                        } else { // Vertical
                            tablero[fila + j][columna] = 'X';
                        }
                    }
                    colocado = true;
                }
            }
        }
    }
}