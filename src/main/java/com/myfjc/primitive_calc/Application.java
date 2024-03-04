package com.myfjc.primitive_calc;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        String greeting = "Hi, I'm just a simple java calculator and I can do addition, subtraction" +
                ", multiplication and division of two numbers!";
        System.out.println(greeting);

        Scanner input = new Scanner(System.in);

        System.out.print("Let's start with the first number - please enter it: ");
        double value1 = input.nextDouble();
        System.out.print("And now please choose the command (+-*/): ");
        String command = input.next();
        System.out.print("Now enter the second number: ");
        double value2 = input.nextDouble();

        switch (command) {
            case "+":
                addition(value1, value2);
                break;
            case "-":
                subtraction(value1, value2);
                break;
            case "*":
                multiplication(value1, value2);
                break;
            case "/":
                division(value1, value2);
                break;
            default:
                System.out.println("You entered unacceptable command.");
                break;
        }

    }

    private static void addition(double value1, double value2) {
        double result = value1 + value2;
        String command = "+";
        printTheResultOfOperation(value1, value2, result, command);
    }

    private static void subtraction(double value1, double value2) {
        double result = value1 - value2;
        String command = "-";
        printTheResultOfOperation(value1, value2, result, command);
    }

    private static void multiplication(double value1, double value2) {
        double result = value1 * value2;
        String command = "*";
        printTheResultOfOperation(value1, value2, result, command);
    }

    private static void division(double value1, double value2) {
        double result = value1 / value2;
        String command = "/";
        printTheResultOfOperation(value1, value2, result, command);
    }

    private static void printTheResultOfOperation(double value1, double value2, double result, String command) {
        System.out.printf("%.2f %s %.2f = %.2f", value1, command, value2, result);
    }
}
