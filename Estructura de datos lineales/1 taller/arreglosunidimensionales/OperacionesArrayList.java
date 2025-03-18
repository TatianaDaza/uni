package arreglosunidimensionales;

import java.util.ArrayList;
import java.util.Scanner;

public class OperacionesArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // a) Adicionar 6 datos e imprimir la lista
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(60);
        System.out.println("a) Lista inicial: " + a);
        
        // b) Adicionar valores en posiciones específicas
        a.add(1, 1000);
        a.add(3, 2000);
        System.out.println("b) Lista después de añadir 1000 en pos 1 y 2000 en pos 3: " + a);
        
        // c) Reemplazar valores usando set
        a.set(0, 5000);
        a.set(2, 10000);
        System.out.println("c) Lista después de reemplazar pos 0 con 5000 y pos 2 con 10000: " + a);
        
        // d) Imprimir la posición de la primera ocurrencia de 2000
        int primeraOcurrencia = a.indexOf(2000);
        System.out.println("d) Primera ocurrencia de 2000: " + primeraOcurrencia);
        
        // e) Imprimir la posición de la última ocurrencia de 2000
        int ultimaOcurrencia = a.lastIndexOf(2000);
        System.out.println("e) Última ocurrencia de 2000: " + ultimaOcurrencia);
        
        // f) Adicionar 2000 en la última posición
        a.add(2000);
        System.out.println("f) Lista después de añadir 2000 al final: " + a);
        
        // g) Repetir impresiones de posiciones
        System.out.println("g) Nueva primera ocurrencia de 2000: " + a.indexOf(2000));
        System.out.println("   Nueva última ocurrencia de 2000: " + a.lastIndexOf(2000));
        
        // h) Averiguar si el valor 40 está en el ArrayList
        int pos40 = a.indexOf(40);
        if (pos40 != -1) {
            System.out.println("h) El valor 40 está en la posición: " + pos40);
        } else {
            System.out.println("h) El valor 40 no está en el ArrayList");
        }
        
        // i) Eliminar el valor en la posición 5
        Integer valorEliminado = a.remove(5);
        System.out.println("i) Valor eliminado de la posición 5: " + valorEliminado);
        System.out.println("   Lista después de eliminar el valor: " + a);
        
        // j) Verificar si la lista está vacía y contar elementos
        if (a.isEmpty()) {
            System.out.println("j) La lista está vacía");
        } else {
            System.out.println("j) La lista no está vacía, tiene " + a.size() + " elementos");
        }
        
        // k) Crear un segundo ArrayList
        ArrayList<Integer> b = new ArrayList<>();
        b.add(111);
        b.add(222);
        b.add(333);
        System.out.println("k) Lista b: " + b);
        
        // l) Crear un tercer ArrayList
        ArrayList<Integer> c = new ArrayList<>();
        c.add(77777);
        c.add(88888);
        System.out.println("l) Lista c: " + c);
        
        // m) Agregar a la lista b los elementos de a y c
        b.addAll(a);
        b.addAll(c);
        System.out.println("m) Lista b después de agregar elementos de a y c: " + b);
        
        // n) Adicionar un nuevo valor a la lista a
        a.add(99999);
        System.out.println("n) Lista a después de agregar 99999: " + a);
        
        // o) Borrar de la lista b los elementos de a
        boolean removidos = b.removeAll(a);
        System.out.println("o) ¿Se eliminaron los elementos de a en b?: " + removidos);
        System.out.println("   Lista b después de eliminar elementos de a: " + b);
        System.out.println("   Lista a actual: " + a);
        
        // p) Borrar todos los elementos de la lista a
        a.clear();
        System.out.println("p) Lista a después de borrar todos los elementos: " + a);
        System.out.println("   ¿La lista a está vacía?: " + a.isEmpty());
        
        scanner.close();
    }
}