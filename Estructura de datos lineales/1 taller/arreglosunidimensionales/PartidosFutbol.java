package arreglosunidimensionales;

import java.util.ArrayList;
import java.util.Iterator;

class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;
    
    public Partido(String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }
    
    public String getEquipoLocal() {
        return equipoLocal;
    }
    
    public String getEquipoVisitante() {
        return equipoVisitante;
    }
    
    public int getGolesLocal() {
        return golesLocal;
    }
    
    public int getGolesVisitante() {
        return golesVisitante;
    }
    
    public boolean ganoLocal() {
        return golesLocal > golesVisitante;
    }
    
    public boolean ganoVisitante() {
        return golesVisitante > golesLocal;
    }
    
    public boolean esEmpate() {
        return golesLocal == golesVisitante;
    }
    
    @Override
    public String toString() {
        return equipoLocal + " " + golesLocal + " - " + golesVisitante + " " + equipoVisitante;
    }
}

public class PartidosFutbol {
    public static void main(String[] args) {
        // Crear ArrayList para almacenar partidos
        ArrayList<Partido> partidos = new ArrayList<>();
        
        // Cargar los datos de partidos desde el texto proporcionado
        cargarPartidos(partidos);
        
        // Mostrar todos los partidos
        System.out.println("======= TODOS LOS PARTIDOS =======");
        for (Partido partido : partidos) {
            System.out.println(partido);
        }
        
        // a) Mostrar los partidos donde el visitante fue el ganador
        System.out.println("\n======= PARTIDOS DONDE GANÓ EL VISITANTE =======");
        ArrayList<Partido> partidosGanadosVisitante = new ArrayList<>();
        for (Partido partido : partidos) {
            if (partido.ganoVisitante()) {
                partidosGanadosVisitante.add(partido);
                System.out.println(partido);
            }
        }
        System.out.println("Total de partidos ganados por el visitante: " + partidosGanadosVisitante.size());
        
        // b) Contar cuántas veces ganó el Sevilla e imprimir
        int victoriasSevilla = 0;
        for (Partido partido : partidos) {
            if ((partido.getEquipoLocal().equals("Sevilla") && partido.ganoLocal()) ||
                (partido.getEquipoVisitante().equals("Sevilla") && partido.ganoVisitante())) {
                victoriasSevilla++;
            }
        }
        System.out.println("\n======= VICTORIAS DEL SEVILLA =======");
        System.out.println("El Sevilla ganó un total de " + victoriasSevilla + " partidos.");
        
        // c) Eliminar los partidos cuyo resultado no sea un empate e imprimir
        System.out.println("\n======= ELIMINANDO PARTIDOS QUE NO SON EMPATE =======");
        
        // Creamos una copia para no modificar la original durante las funcionalidades restantes
        ArrayList<Partido> partidosCopia = new ArrayList<>(partidos);
        
        Iterator<Partido> iterator = partidosCopia.iterator();
        while (iterator.hasNext()) {
            Partido partido = iterator.next();
            if (!partido.esEmpate()) {
                iterator.remove();
            }
        }
        
        System.out.println("Partidos que terminaron en empate:");
        for (Partido partido : partidosCopia) {
            System.out.println(partido);
        }
        System.out.println("Total de partidos empatados: " + partidosCopia.size());
        
        // d) Contar cuántos partidos ganó el equipo local
        int victoriasLocal = 0;
        for (Partido partido : partidos) {
            if (partido.ganoLocal()) {
                victoriasLocal++;
            }
        }
        System.out.println("\n======= VICTORIAS DE EQUIPOS LOCALES =======");
        System.out.println("Los equipos locales ganaron un total de " + victoriasLocal + " partidos.");
    }
    
    // Método para cargar los partidos desde el texto proporcionado
    private static void cargarPartidos(ArrayList<Partido> partidos) {
        String[] datosPartidos = {
            "Valencia::Betis::1::0",
            "Betis::Osasuna::1::0",
            "Atletico Madrid::Zaragoza::0::0",
            "Zaragoza::Valencia::2::2",
            "Mallorca::Deportivo::0::1",
            "Deportivo::Atletico Madrid::1::0",
            "Alaves::Barcelona::0::0",
            "Barcelona::Mallorca::2::0",
            "Athletic::Real Sociedad::3::0",
            "Real Sociedad::Alaves::2::1",
            "Espanyol::Getafe::0::2",
            "Getafe::Athletic::1::1",
            "Celta::Malaga::2::0",
            "Malaga::Espanyol::1::2",
            "Cadiz::Real Madrid::1::2",
            "Real Madrid::Celta::2::3",
            "Sevilla::Racing Santander::1::0",
            "Racing Santander::Cadiz::0::1",
            "Osasuna::Villarreal::2::1",
            "Villarreal::Sevilla::1::1",
            "Betis::Zaragoza::0::0",
            "Zaragoza::Osasuna::3::1",
            "Valencia::Deportivo::2::2",
            "Deportivo::Betis::1::1",
            "Atletico Madrid::Barcelona::2::1",
            "Barcelona::Valencia::2::2",
            "Mallorca::Real Sociedad::5::2",
            "Real Sociedad::Atletico Madrid::3::2",
            "Alaves::Getafe::3::4",
            "Getafe::Mallorca::1::1",
            "Athletic::Malaga::1::2",
            "Malaga::Alaves::0::0",
            "Espanyol::Real Madrid::1::0",
            "Real Madrid::Athletic::3::1",
            "Celta::Racing Santander::0::1",
            "Racing Santander::Espanyol::1::0",
            "Cadiz::Villarreal::1::1",
            "Villarreal::Celta::1::2",
            "Osasuna::Sevilla::1::0",
            "Sevilla::Cadiz::0::0",
            "Zaragoza::Deportivo::1::1",
            "Deportivo::Osasuna::0::1",
            "Betis::Barcelona::1::4",
            "Barcelona::Zaragoza::2::2",
            "Valencia::Real Sociedad::2::1",
            "Real Sociedad::Betis::1::1",
            "Atletico Madrid::Getafe::0::1",
            "Getafe::Valencia::2::1",
            "Mallorca::Malaga::1::4",
            "Malaga::Atletico Madrid::0::2"
        };
        
        for (String datosPartido : datosPartidos) {
            String[] datos = datosPartido.split("::");
            if (datos.length >= 4) {
                String equipoLocal = datos[0];
                String equipoVisitante = datos[1];
                int golesLocal = Integer.parseInt(datos[2]);
                int golesVisitante = Integer.parseInt(datos[3]);
                
                partidos.add(new Partido(equipoLocal, equipoVisitante, golesLocal, golesVisitante));
            }
        }
    }
}