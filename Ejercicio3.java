//crear una lista que contenga como elementos la numeración de las cartas de una baraja francesa
//(solo los valores, no las cifras). 
//Debes:
//Cargar ArrayList(en orden),
//imprimir,
//imprimir en orden inverso,
//barajar la ArrayList e imprimir de nuevo.

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {

    public static void main(String[] args) {
        ArrayList<Integer> valuesAL = new ArrayList<>();

        System.out.println("\nCarga las barajas e imprímelo.");
        for (int i = 1; i < 14; i++) {
            valuesAL.add(i);
        }

        for (int i = 0; i < valuesAL.size(); i++) {
            System.out.print(valuesAL.get(i));
        }

        System.out.println("\nImprime valuesAL en orden inverso");

        Collections.sort(valuesAL, Collections.reverseOrder());
        for (int i : valuesAL) {
            System.out.println(i);
        }

        System.out.println("\nMezclar el ArrayList, y volver a imprimir");
        Collections.shuffle(valuesAL);
        for (int i : valuesAL) {
            System.out.println(i);
        }

    }

}
