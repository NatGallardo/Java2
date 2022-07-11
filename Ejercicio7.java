//Crea una función que le dé 2 argumentos int
// (siendo el primero más pequeño que el segundo), devuelve una matriz de cadenas.
//Con la secuencia de números enteros de principio a fin.
//Pero :si el número es múltiplo de 2 colocará el valor "Fizz",
//si es múltiplo de 3 "Buzz" y si es un múltiplo de ambos, configurará "FizzBuzz".
//Observación:
//Los "2 argumentos" indican con qué valor empezar a calcular y"el segundo" con qué valor frenar (no incluido en el cálculo).
//Ej: (1, 5) ----> calculará valores de 1, 2, 3, 4
//Aporte:
//fizzBuzzFunction(1,6) // 6 marca el límite, y no está incluido.
//[“1”, “Efervescencia”, “Zumbido”, “Efervescencia”, “5”]
//Función fizzBuzz(1,8)
//[“1”, “Fizz”, “Buzz”, “Fizz”, “5”, “FizzBuzz”, “7”]

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

  public static void main(String[] args) {

    System.out.println("ingrese numero");

    try (Scanner sc = new Scanner(System.in)) {
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();

      ArrayList<String> returnOfFizzBuzzFunction = fizzBuzzFunctionArrayList(n1, n2);
      System.out.println(returnOfFizzBuzzFunction);
    }
  }

  public static ArrayList<String> fizzBuzzFunctionArrayList(int n1, int n2) {
    ArrayList<String> arrayOfStrings = new ArrayList<>();

    if (n1 < n2) {
      for (int i = n1; i < n2; i++) {
        if ((i % 2 == 0) && (i % 3 == 0)) {
          arrayOfStrings.add("FizzBuzz");
        } else if (i % 2 == 0) {
          arrayOfStrings.add("Efervescente");
        } else if (i % 3 == 0) {
          arrayOfStrings.add("Zumbador");
        } else {
          ;
          arrayOfStrings.add(String.valueOf(i));
        }
      }
    }
    return arrayOfStrings;
  }
}
