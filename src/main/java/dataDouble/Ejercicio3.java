package dataDouble;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var miArray = RandomUtilities.generator(1, 1000, 500);

        System.out.println("La suma es " + suma(miArray));


    }

    public static double suma(double[] array) {
        var sumav = 0.0;
        for (double elemento : array) {
            sumav += elemento;
        }

        return sumav;
    }

}
