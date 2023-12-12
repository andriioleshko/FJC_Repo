package main.java;

import java.util.Scanner;

class Operations {

    static void addTwoNumbers(double value1, double value2) {
        double result = value1 + value2;
        String command = "+";
        printTheResultOfOperation(value1, value2, result, command);
    }

    static void subtractTwoNumbers(double value1, double value2) {
        double result = value1 - value2;
        String command = "-";
        printTheResultOfOperation(value1, value2, result, command);
    }

    static void multiplyTwoNumbers(double value1, double value2) {
        double result = value1 * value2;
        String command = "*";
        printTheResultOfOperation(value1, value2, result, command);
    }

    static void divideTwoNumbers(double value1, double value2) {
        double result = value1 / value2;
        String command = "/";
        printTheResultOfOperation(value1, value2, result, command);
    }

    static void printTheResultOfOperation(double value1, double value2, double result, String command) {
        System.out.printf("%.2f %s %.2f = %.2f", value1, command, value2, result);
    }
}

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
            case "+" -> Operations.addTwoNumbers(value1, value2);
            case "-" -> Operations.subtractTwoNumbers(value1, value2);
            case "*" -> Operations.multiplyTwoNumbers(value1, value2);
            case "/" -> Operations.divideTwoNumbers(value1, value2);
            default -> System.out.println("You entered unacceptable command.");
        }

    }
}
