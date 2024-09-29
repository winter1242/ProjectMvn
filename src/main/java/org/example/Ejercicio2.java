package org.example;

import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        double[] miArray = generator();

        valorUnico(miArray);


        for (double valor : miArray) {
            System.out.print(valor + " ");
        }
    }

    public static double[] generator() {
        int tamaño = 500;
        double min = 10000;
        double max = 100000;

        double[] arrayAleatorio = new double[tamaño];
        Random random = new Random();

        for (int i = 0; i < tamaño; i++) {
            arrayAleatorio[i] = min + (max - min) * random.nextDouble();
        }

        return arrayAleatorio;
    }

    public static void valorUnico(double[] array) {
      
    }
}
