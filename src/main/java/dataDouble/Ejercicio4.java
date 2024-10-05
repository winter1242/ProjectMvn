package dataDouble;

import java.util.Random;

public class Ejercicio4 {

    public static void main(String[] args) {
        double[] miArray = generator();

        ordenarArray(miArray);


        for (double valor : miArray) {
            System.out.println(valor + "     ");
        }
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


    public static void ordenarArray(double[] arr) {
        //Comentario de prueba
        int n = arr.length;
        double tempo = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    tempo = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempo;
                }
            }
        }
    }
}
