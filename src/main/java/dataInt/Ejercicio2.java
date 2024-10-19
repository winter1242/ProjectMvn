package dataInt;

import java.util.HashSet;

public class Ejercicio2 {


    public static void main(String[] args) {
        final var miArray = RandomUtilities.generator(1, 1000, 500);

        for (int valor : obtenerElementosUnicos(miArray)) {
            System.out.print(valor + " ");
        }
    }

    public static int[] obtenerElementosUnicos(int[] array) {
        var elementUnic = new HashSet<Integer>();

        for (int elemento : array) {
            elementUnic.add(elemento);
        }

        int[] resultado = new int[elementUnic.size()];
        int indice = 0;
        
        for (var elemento : elementUnic) {
            resultado[indice++] = elemento;
        }

        return resultado;
    }
}
