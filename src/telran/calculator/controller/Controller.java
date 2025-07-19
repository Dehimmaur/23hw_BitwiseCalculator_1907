package telran.calculator.controller;

import telran.calculator.model.Operations;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int a = scanner.nextInt();


        System.out.println("Pleace enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Please choose operation: AND, OR, XOR, NOT, SHIFT, SHIFT_LEFT, SHIFT_RIGHT," +
                "UNSIGNED_SHIFT_RIGHT");
        String operation = scanner.next().toUpperCase();

        System.out.println("a : " + a + ", b : " + b + ", operation : " + operation);
        Operations operation1 = Operations.valueOf(operation);

        int result = operation1.apply(a, b);
        System.out.println("Result: " + result);

    }
}
