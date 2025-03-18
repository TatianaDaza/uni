package arreglosunidimensionales;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSumaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("Ingrese números enteros (0 para terminar):");
        int numero;
        
        do {
            numero = scanner.nextInt();
            if (numero != 0) {
                numeros.add(numero);
            }
        } while (numero != 0);
        
        // Mostrar los números leídos
        System.out.println("\nNúmeros leídos: " + numeros);
        
        // Calcular la suma
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        System.out.println("Suma: " + suma);
        
        // Calcular la media
        double media = 0;
        if (!numeros.isEmpty()) {
            media = (double) suma / numeros.size();
        }
        System.out.println("Media: " + media);
        
        scanner.close();
    }
}