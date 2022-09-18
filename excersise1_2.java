package Homework;

import java.util.Arrays;

public class excersise1_2 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 4, 10, 6, 15};
        int[] array2 = {9, 3, 7, 5, 6};
        System.out.println(Arrays.toString(quotientOfArrays(array1, array2)));
    }

    private static int[] quotientOfArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Given arrays have different sizes");
        }
        int[] array3 = new int[array1.length];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] / array2[i];
        }
        return array3;
    }
}
