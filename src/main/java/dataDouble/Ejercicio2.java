package dataDouble;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

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

    public static Double[] valorUnico(double[] array) {
        Set<Double> elementUnic = new HashSet<>();

        for (Double elemento : array) {
            elementUnic.add(elemento);
        }

        Double[] resultado = new Double[elementUnic.size()];
        int indice = 0;
        for (Double elemento : elementUnic) {
            resultado[indice++] = elemento;
        }

        return resultado;
    }
}
