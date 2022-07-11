// Está disponible una colección de Empleados, para cada empleado se conoce:
// - nombre y apellido
// - DNI
// - horas trabajadas
// - valor por hora
// Todos los empleados se cargan en un conjunto (HashSet),
// calcule el salario (horas trabajadas x valor por hora) de toda esa lista y entonces
// almacenar en un Mapa (o Diccionario) donde "la clave es el dni" y "el valor es el sueldo calculado".

import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio6 extends Ejercic6 {

  public Ejercicio6(String firstName, String lastName, int DNI, int hoursWorked, int valuePerHour) {
    super(firstName, lastName, DNI, hoursWorked, valuePerHour);
  }

  public static void main(String[] args) {

    HashSet<Ejercic6> empleadosHS = new HashSet<>();
    HashMap<Integer, Float> employeeSalaryHM = new HashMap<>();

    empleadosHS.add(new Ejercic6("John F.", "Kennedy", 19610120, 6048, 150));
    empleadosHS.add(new Ejercic6("Lyndon B.", "Johnson", 19631122, 18144, 150));
    empleadosHS.add(new Ejercic6("Richard", "Nixon", 19690120, 15120, 150));
    empleadosHS.add(new Ejercic6("Gerald", "Ford", 19740809, 9072, 150));
    empleadosHS.add(new Ejercic6("Jimmy", "Carter", 19770120, 12096, 150));
    empleadosHS.add(new Ejercic6("Ronald", "Reagan", 19810120, 24192, 150));
    empleadosHS.add(new Ejercic6("George HW", "Bush", 19890120, 12096, 150));
    empleadosHS.add(new Ejercic6("Factura", "Clinton", 19930120, 24192, 150));
    empleadosHS.add(new Ejercic6("George W.", "Bush", 20010120, 24192, 150));
    empleadosHS.add(new Ejercic6("Barack", "Obama", 20090120, 24192, 150));
    empleadosHS.add(new Ejercic6("Donald", "Trump", 20170120, 12096, 150));
    empleadosHS.add(new Ejercic6("Joe", "Biden", 20210120, 3024, 150));

    System.out.println("\nmostrar HashSet");
    for (Ejercic6 i : empleadosHS) {
      System.out.println(i.getFirstName() + " " + i.getLastName() +
          ", DNI: " + i.DNI() +
          ", Horas trabajadas: " + i.hoursWorked() +
          ", Valor por hora: $" + i.valuesPerHour() +
          " » Salario: $" + i.salario());
    }

    for (Ejercic6 i : empleadosHS) {
      employeeSalaryHM.put(i.DNI(), i.salario());
    }

    System.out.println("Imprimir claves");
    for (Integer i : employeeSalaryHM.keySet()) {
      System.out.println(" DNI: " + i);
    }
    System.out.println("Imprimir valores");
    for (Float i : employeeSalaryHM.values()) {
      System.out.println(" salario: $" + i);
    }

  }

}
