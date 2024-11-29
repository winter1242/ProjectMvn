package dataInt;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var miArray = RandomUtilities.generator(1, 1000, 500);

        System.out.println(sumarElementos(miArray));
    }

    public static int sumarElementos(int[] array) {
        var suma = 0;
        var indice = 0;
        for (var elemento : array) {
            suma += array[indice++];
        }
        return suma;
    }

}
