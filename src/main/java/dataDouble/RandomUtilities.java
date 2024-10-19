package dataDouble;

import com.github.javafaker.Faker;

public class RandomUtilities {
    private static final Faker faker = new Faker();

    public static double[] generator(int min, int max, int cant) {
        final var miArray = new double[cant];

        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = faker.number().randomDouble(2, min, max);
        }

        return miArray;
    }
}
