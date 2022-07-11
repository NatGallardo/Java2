//Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.

import java.util.ArrayList;
import java.util.Collections;

public class E3 {

  public static void main(String[] args) {
    ArrayList<String> valuesAL = new ArrayList<>();

    valuesAL.add("As");
    valuesAL.add("2");
    valuesAL.add("3");
    valuesAL.add("4");
    valuesAL.add("5");
    valuesAL.add("6");
    valuesAL.add("7");
    valuesAL.add("8");
    valuesAL.add("9");
    valuesAL.add("10");
    valuesAL.add("Jack");
    valuesAL.add("Reina");
    valuesAL.add("Rey");

    System.out.println("\nImprimir");
    for (String i : valuesAL) {
      System.out.println(i);
    }

    System.out.println("\nImprimir al Revés");
    Collections.sort(valuesAL, Collections.reverseOrder());
    for (String i : valuesAL) {
      System.out.println(i);
    }

    System.out.println("\nReordenar");
    Collections.shuffle(valuesAL);
    for (String i : valuesAL) {
      System.out.println(i);
    }

  }

}
