package dataInt;

import java.util.Random;

public class Ejercicio1 {

    public static void main(String[] args) {
        int[] miArray = generator();

        multiplicarPorDos(miArray);


        for (int valor : miArray) {
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

    public static void multiplicarPorDos(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }
}