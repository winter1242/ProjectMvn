package dataInt;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ejercicio2 {


    public static void main(String[] args) {
        int[] miArray = generator();


        for (int valor : obtenerElementosUnicos(miArray)) {
            System.out.print(valor + " ");
        }

    }

    public static int[] generator() {
        int[] miArray = new int[500];
        Random random = new Random();

        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = random.nextInt(1000) + 1;
        }

        return miArray;
    }

    public static int[] obtenerElementosUnicos(int[] array) {
        Set<Integer> elementUnic = new HashSet<>();

        for (int elemento : array) {
            elementUnic.add(elemento);
        }

        int[] resultado = new int[elementUnic.size()];
        int indice = 0;
        for (int elemento : elementUnic) {
            resultado[indice++] = elemento;
        }

        return resultado;
    }
}
