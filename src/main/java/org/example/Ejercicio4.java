package org.example;

import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] miArray = generator();

        ordenarArray(miArray);

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

    public static void ordenarArray(int[] arr) {
        int n = arr.length;
        int tempo = 0;
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
