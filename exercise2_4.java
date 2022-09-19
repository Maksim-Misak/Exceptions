package Homework;

import java.util.Scanner;

public class exercise2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (input.isEmpty()) {
            throw new RuntimeException("Can't input an empty line. Try again!");
        }
        scanner.close();
    }
}
