package org.example;

import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        double[] miArray = generator();

        System.out.println("La suma es " + suma(miArray));


    }

    public static double[] generator() {
        int tamano = 500;
        double min = 10000;
        double max = 100000;

        double[] arrayAleatorio = new double[tamano];
        Random random = new Random();

        for (int i = 0; i < tamano; i++) {
            arrayAleatorio[i] = min + (max - min) * random.nextDouble();
        }
        for (double valor : arrayAleatorio) {
            System.out.print(valor);
        }

        return arrayAleatorio;
    }

    public static double suma(double[] array) {
        double sumav = 0;
        for (double elemento : array) {
            sumav += elemento;
        }


        return sumav;
    }

}
