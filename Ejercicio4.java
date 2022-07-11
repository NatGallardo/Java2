// Cargue un arrayList con 12 nombres de estudiantes (String),
// luego sepárelos en 3 cursos (3 arrayList) e imprima estos cursos.

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {

        ArrayList<String> estudiantes = new ArrayList<>();
        estudiantes.add("Gael");
        estudiantes.add("Andrés");
        estudiantes.add("Juan");
        estudiantes.add("Ariel");
        estudiantes.add("David");
        estudiantes.add("Guillermo");
        estudiantes.add("Ricardo");
        estudiantes.add("José");
        estudiantes.add("Tomás");
        estudiantes.add("Carlos");
        estudiantes.add("Joaquín");
        estudiantes.add("Danilo");

        List<String> Aula1 = estudiantes.subList(0, 4);
        List<String> Aula2 = estudiantes.subList(4, 8);
        List<String> Aula3 = estudiantes.subList(8, (estudiantes.size()));

        System.out.println("\n" + "Aula1");
        for (int i = 0; i < Aula1.size(); i++) {
            System.out.println(Aula1.get(i));
        }

        System.out.println("\n" + "Aula2");
        for (String s : Aula2) {
            System.out.println(s);
        }

        System.out.println("\n" + "Aula3");
        for (String s : Aula3) {
            System.out.println(s);
        }

    }

}