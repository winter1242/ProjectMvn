package dataInt;

public class Ejercicio1 {

    public static void main(String[] args) {
        final var miArray = RandomUtilities.generator(1, 1000, 500);

        multiplicarPorDos(miArray);

        for (int valor : miArray) {
            System.out.print(valor + " ");
        }
    }


    public static void multiplicarPorDos(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }
}