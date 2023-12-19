package main.java;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        String greeting = "Hi, I'm just a simple java calculator and I can do addition, subtraction" +
                ", multiplication and division of two numbers!";
        System.out.println(greeting);

        Scanner input = new Scanner(System.in);

        System.out.print("Let's start with the first number - please enter it: ");
        int value1 = input.nextInt();
        System.out.print("And now please choose the command (+-*/): ");
        String command = input.next();
        System.out.print("Now enter the second number: ");
        int value2 = input.nextInt();

        float result = 0;
        String wrongInput = "";
        switch (command) {
            case "+":
                result = value1 + value2;
                break;
            case "-":
                result = value1 - value2;
                break;
            case "*":
                result = value1 * value2;
                break;
            case "/":
                result = value1 / value2;
                break;
            default:
                wrongInput = "You entered unacceptable command.";
        }

        if (wrongInput.equals("")) {
            System.out.printf("%d %s %d = %.2f", value1, command, value2, result);
        } else {
            System.out.println(wrongInput);
        }

    }
}
