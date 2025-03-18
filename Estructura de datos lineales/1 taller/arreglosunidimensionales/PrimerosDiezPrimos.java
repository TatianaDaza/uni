package arreglosunidimensionales;

public class PrimerosDiezPrimos {
    public static void main(String[] args) {
        // Inicializar un arreglo con los primeros 10 números primos
        int[] numerosPrimos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        
        // Imprimir el arreglo
        System.out.println("Los primeros 10 números primos son:");
        for (int i = 0; i < numerosPrimos.length; i++) {
            System.out.print(numerosPrimos[i] + " ");
        }
        System.out.println(); // Salto de línea final
    }
}