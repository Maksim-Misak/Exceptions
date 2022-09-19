package Homework;

public class exercise2_2 {
    public static void main(String[] args) {
        int[] intArray = { 1, 6, 7, 4, 9, 4 };
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
