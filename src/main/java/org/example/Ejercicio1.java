package org.example;

public class ClassA {
    public static void main() {

    }

    public int[] multpx(int[] array) {
        int[] miArray = new int[500];


        for (int i = 0; i < 500; i++) {
            int multi = array[i] * 2;
            miArray[i] = multi;
        }
        return miArray;
    }
}
