package dataInt;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var miArray = RandomUtilities.generator(1, 1000, 500);

        ordenarArray(miArray);

        for (int valor : miArray) {
            System.out.print(valor + " ");
        }

    }

    public static void ordenarArray(int[] arr) {
        var n = arr.length;
        var tempo = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tempo = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempo;
                }
            }
        }
    }
}
