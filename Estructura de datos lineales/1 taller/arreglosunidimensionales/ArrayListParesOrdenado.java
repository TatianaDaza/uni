package arreglosunidimensionales;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListParesOrdenado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializar ArrayList con los 20 primeros números pares
        ArrayList<Integer> numerosPares = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numerosPares.add(i * 2);
        }
        
        // a) Imprimir el ArrayList
        System.out.println("a) ArrayList inicial con los 20 primeros números pares:");
        System.out.println(numerosPares);
        
        // b) Insertar un número en la posición correcta
        System.out.print("\nb) Ingrese un número para insertar: ");
        int numeroInsertar = scanner.nextInt();
        
        // Encontrar la posición correcta
        int posicion = 0;
        while (posicion < numerosPares.size() && numerosPares.get(posicion) < numeroInsertar) {
            posicion++;
        }
        
        numerosPares.add(posicion, numeroInsertar);
        System.out.println("ArrayList después de insertar " + numeroInsertar + ":");
        System.out.println(numerosPares);
        
        // c) Borrar un valor solicitado
        System.out.print("\nc) Ingrese un número para borrar: ");
        int numeroBorrar = scanner.nextInt();
        
        Integer objetoABorrar = Integer.valueOf(numeroBorrar);
        boolean removido = numerosPares.remove(objetoABorrar);
        
        if (removido) {
            System.out.println("Número " + numeroBorrar + " removido exitosamente.");
        } else {
            System.out.println("El número " + numeroBorrar + " no existe en el ArrayList.");
        }
        
        System.out.println("ArrayList después de intentar borrar " + numeroBorrar + ":");
        System.out.println(numerosPares);
        
        scanner.close();
    }
}