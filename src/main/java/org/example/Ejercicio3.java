package org.example;

import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] miArray = generator();


        System.out.println(sumarElementos(miArray));

    }

    public static int[] generator() {
        int[] miArray = new int[500];
        Random random = new Random();

        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = random.nextInt(1000) + 1;
        }

        return miArray;
    }

    public static int sumarElementos(int[] array) {
        int suma = 0;
        int indice = 0;
        for (int elemento : array) {
            suma += array[indice++];
        }


        return suma;
    }
    
}
