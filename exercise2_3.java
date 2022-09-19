package Homework;

public class exercise2_3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Pointer cant point on null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Array is out of bounds");
        } catch (Throwable ex) {
            System.out.println("Something went wrong");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
