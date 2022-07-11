//Se dispone de una colección de empleados, de cada uno se conoce:
//Nombre y Apellido
//DNI
//horasTrabajadas
//valorPorHora

public class Ejercic6 {

  private String firstName;
  private String lastName;
  private int DNI;
  private int hoursWorked;
  private int valuePerHour;

  public Ejercic6(String firstName, String lastName, int dNI, int hoursWorked, int valuePerHour) {
  }

  public void Ejercicio6(String firstName, String lastName, int DNI, int hoursWorked, int valuePerHour) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.DNI = DNI;
    this.hoursWorked = hoursWorked;
    this.valuePerHour = valuePerHour;
  }

  String getFirstName() {
    return firstName;
  }

  String getLastName() {
    return lastName;
  }

  int DNI() {
    return DNI;
  }

  public int hoursWorked() {
    return hoursWorked;
  }

  public int valuesPerHour() {
    return valuePerHour;
  }

  public int salarioFloat() {
    return hoursWorked * valuePerHour;
  }

  public Float salario() {
    return null;
  }

}