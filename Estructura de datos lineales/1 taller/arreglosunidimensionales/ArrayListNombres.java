package arreglosunidimensionales;

import java.util.ArrayList;

public class ArrayListNombres {
    public static void main(String[] args) {
        // Crear un ArrayList con 5 nombres
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Carlos");
        
        // a) Imprimir el ArrayList
        System.out.println("a) ArrayList inicial: " + nombres);
        
        // b) Adicionar en la posición 1 un nuevo nombre
        nombres.add(1, "Lucía");
        System.out.println("b) Después de adicionar 'Lucía' en posición 1: " + nombres);
        
        // c) Remover de la posición 0 el nombre correspondiente
        String nombreRemovido = nombres.remove(0);
        System.out.println("c) Después de remover el nombre en posición 0 ('" + nombreRemovido + "'): " + nombres);
        
        // d) Adicionar en la posición 0 un nuevo nombre
        nombres.add(0, "Roberto");
        System.out.println("d) Después de adicionar 'Roberto' en posición 0: " + nombres);
        
        // e) Imprimir el ArrayList
        System.out.println("e) ArrayList final: " + nombres);
        
        // f) Obtener el nombre de la posición 1 como String
        String nombrePos1 = nombres.get(1);
        System.out.println("f) Nombre en la posición 1: " + nombrePos1);
        
        // g) Obtener el ultimo nombre de la posición e imprimirlo
        String ultimoNombre = nombres.get(nombres.size() - 1);
        System.out.println("g) Último nombre: " + ultimoNombre);
    }
}