package com.epsi.mycal;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.println("Choose between:");
        System.out.println("1-add");
        System.out.println("2-sub");
        System.out.println("3-mul");
        System.out.println("4-div");
        System.out.println("5-isPair");
        System.out.println("6-isFirstDigit");

        Calculator calculator = new Calculator();
        int choice = scanner.nextInt();
        if (choice > 4) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            boolean result;
            if (choice == 5)
                result = calculator.isPair(number);
            else
                result = calculator.isFirstDigit(number);

            System.out.println("Result:" + result);
        }
        else {
            System.out.println("Please enter two numbers");
            System.out.println("First number : ");
            int firstNumber = scanner.nextInt();
            System.out.print("Second number: ");
            int secondNumber = scanner.nextInt();
            int result;
            switch (choice) {
                case 1 -> result = calculator.add(firstNumber, secondNumber);
                case 2 -> result = calculator.sub(firstNumber, secondNumber);
                case 3 -> result = calculator.mul(firstNumber, secondNumber);
                case 4 -> result = calculator.div(firstNumber, secondNumber);
                default -> result = 0;
            }
            System.out.println(result);
        }
    }

}
