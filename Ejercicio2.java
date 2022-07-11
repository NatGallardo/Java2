//Cree un ArrayList, agregue 5 enteros. Luego agregue un número entero al principio
//de la lista y otro al final. Finalmente, itera e imprime los elementos de la lista
//y el tamaño de la lista (antes y después de agregar en la primera y última posición).

import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {

        ArrayList<Integer> integersAL = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            integersAL.add(i * 100);
        }
        System.out.println(integersAL);

        int sizeBefore = integersAL.size();
        integersAL.add(0, 5);
        integersAL.add(55);
        int sizeAfter = integersAL.size();

        System.out.println("\nfor");
        for (int i = 0; i < integersAL.size(); i++) {
            System.out.println(integersAL.get(i));
        }

        System.out.println("\nenhanced for");
        for (Integer integer : integersAL) {
            System.out.println(integer);
        }

        System.out.println("\nsize before add: " + sizeBefore);
        System.out.println("size after add: " + sizeAfter);

    }
}
