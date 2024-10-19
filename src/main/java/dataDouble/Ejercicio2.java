package dataDouble;

import java.util.HashSet;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var miArray = RandomUtilities.generator(1, 1000, 500);

        for (double valor : valorUnico(miArray)) {
            System.out.print(valor + " ");
        }
    }

    public static Double[] valorUnico(double[] array) {
        final var elementUnic = new HashSet<Double>();

        for (Double elemento : array) {
            elementUnic.add(elemento);
        }

        final var resultado = new Double[elementUnic.size()];

        var indice = 0;
        for (Double elemento : elementUnic) {
            resultado[indice++] = elemento;
        }

        return resultado;
    }
}
