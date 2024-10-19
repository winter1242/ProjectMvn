package dataInt;

import com.github.javafaker.Faker;

public class RandomUtilities {
    private static final Faker faker = new Faker();

    public static int[] generator(int min, int max, int cant) {
        int[] miArray = new int[cant];

        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = faker.number().numberBetween(min, max);
        }

        return miArray;
    }
}
