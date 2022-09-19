package Homework;

import java.util.Scanner;

public class exercise2_1 {
    public static void main(String[] args) {
        System.out.println(getNumber());
    }

    public static float getNumber() {
        Scanner scan = new Scanner(System.in);
        float num = 0;
        while (!scan.hasNextFloat()) {
            System.out.println("Not a number, try again!");
            scan.nextLine();
        }
        num = scan.nextFloat();
        scan.close();
        return num;
    }
}

