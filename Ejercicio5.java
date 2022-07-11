//Dadas 2 ArrayList que contienen
//horas trabajadas (matriz1) y valor horario (matriz2),
//del resumen de carga horaria semanal de un empleado.
//Se debe generar otra lista que contenga los totales y
//luego imprime
//el total a cobrar.

import java.util.ArrayList;

public class Ejercicio5 {

    private static String totalHoursWorked;

    public static <totalSemanal> void main(String[] args) {

        ArrayList<Integer> hoursWorked = new ArrayList<>();
        ArrayList<Integer> tarifahoraria = new ArrayList<>();
        ArrayList<Integer> totalPerDay = new ArrayList<>();

        hoursWorked.add(9);
        hoursWorked.add(10);
        hoursWorked.add(12);
        hoursWorked.add(6);
        hoursWorked.add(8);

        tarifahoraria.add(25);
        tarifahoraria.add(26);
        tarifahoraria.add(35);
        tarifahoraria.add(23);
        tarifahoraria.add(24);

        for (int i = 0; i < hoursWorked.size(); i++) {
            totalPerDay.add(hoursWorked.get(i) * tarifahoraria.get(i));
        }

        System.out.println("\nTotal de horas trabajadas por semana: " + totalHoursWorked);

        int totalSemanal = 0;
        for (Integer Day : totalPerDay) {
            totalSemanal += Day;
        }

        System.out.println(totalPerDay);
        System.out.println("\nTotal Semanal:  U$D" + totalSemanal);

    }

}
