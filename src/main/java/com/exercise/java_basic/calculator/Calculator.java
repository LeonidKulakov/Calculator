package com.exercise.java_basic.calculator;


import java.util.Scanner;

/**
 * 04-java-basic-calculator
 * Application's entry point, use it to demonstrate your code execution
 */
public class Calculator {


    public Calculator(int i) {
    }

    public static void main(String[] args) {
        calculation();
    }

    public static double inputNumber() {
        Scanner scanner = new Scanner(System.in);
        double numb;
        if (scanner.hasNextDouble() || scanner.hasNextInt()) {
            numb = scanner.nextDouble();
        } else {
            System.out.println("you didn't enter a number,try again:");
            numb = inputNumber();
        }
        return numb;
    }

    public static char inputChar() {
        Scanner scanner = new Scanner(System.in);
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("you didn't enter a operator (+, -, *, /), try again:");
            scanner.next();
            operation = inputChar();
        }
        if (operation != '+' & operation != '-' & operation != '*' & operation != '/') {
            System.out.println("you didn't enter a operator (+, -, *, /), try again:");
            operation = inputChar();
        }

        return operation;
    }

    public static void calculation() {

        System.out.println("Enter the first number:");
        double a = inputNumber();
        System.out.println("Enter the second number:");
        double b = inputNumber();
        System.out.println("Enter operator (+, -, *, /):");
        char operation = inputChar();
        double result;
        if (operation == '+') {
            result = a + b;
        } else if (operation == '-') {
            result = a - b;
        } else if (operation == '*') {
            result = a * b;
        } else {
            result = a / b;
        }
        System.out.printf("Result %.2f \n", result);
        restart();

    }

    public static void restart() {
        System.out.println("Do you want to continue? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        char rest = scanner.next().charAt(0);
        if (rest == 'Y' || rest == 'y') {
            Calculator.calculation();
        } else if (rest == 'N' || rest == 'n') {
            System.out.println("Bay!");
        } else {
            System.out.println("Wot?");
            Calculator.restart();
        }
    }


    public double add(double a, double b) {


        return new Double(a + b);
    }

    public double subtract(double a, double b) {

        return new Double(a - b);
    }

    public double multiply(double a, double b) {
        return new Double(a * b);
    }

    public double div(double a, double b) {

        return new Double(a / b);
    }

}

