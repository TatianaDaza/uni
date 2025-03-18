package arreglosunidimensionales;

public class PrimerosCienPares {
    public static void main(String[] args) {
        // Inicializar un arreglo con los 100 primeros números pares
        int[] numerosPares = new int[100];
        
        for (int i = 0; i < 100; i++) {
            numerosPares[i] = (i + 1) * 2;
        }
        
        // a) Imprimir en una sola línea
        System.out.println("a) Los 100 primeros números pares en una línea:");
        for (int i = 0; i < numerosPares.length; i++) {
            System.out.print(numerosPares[i] + " ");
        }
        System.out.println(); // Salto de línea
        
        // b) Imprimir en 10 líneas indicando el número de línea
        System.out.println("\nb) Los 100 primeros números pares en 10 líneas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Línea " + (i + 1) + ": ");
            for (int j = 0; j < 10; j++) {
                System.out.print(numerosPares[i * 10 + j] + " ");
            }
            System.out.println();
        }
    }
}
