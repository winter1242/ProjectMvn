package dataDouble;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var miArray = RandomUtilities.generator(1, 1000, 500);

        dividirEntreMil(miArray);

        for (double valor : miArray) {
            System.out.print(valor + " ");
        }
    }

    public static void dividirEntreMil(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] /= 1000;
        }
    }
}
