package Homework;

public class exercise1_1 {
    public static void main(String[] args) {
        // arithmException();
        arrayOutOfBound();
        // nullPointerException();
    }

    // private static int arithmException() {
    //     return 10/0;
    // }

    private static int arrayOutOfBound() {
        int[] array =new int[10];
        return array[15];
    }

    // private static void nullPointerException() {
    //     String a = null;
    //     System.out.println(a.charAt(0));
    // }

}
