//Cree un ArrayList y carguelo con sus ciudades favoritas de Argentina, luego imrpima el Ranking.

import java.util.ArrayList;

public class Ejercicio1 {

    public static void main(String[] args) {

        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Córdoba");
        ciudades.add("Bariloche");
        ciudades.add("San Refael");

        System.out.println("Clasificación (para)");
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println("#" + (i + 1) + " - " + ciudades.get(i));
        }
        System.out.println("\n Cladificación (para cada uno)");
        int i = 1;
        for (String ciudad : ciudades) {
            System.out.println("#" + i + " - " + ciudad);
            i++;
        }
    }
}