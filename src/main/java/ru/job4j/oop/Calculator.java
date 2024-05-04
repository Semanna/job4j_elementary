package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int sum) {
        return x + sum;
    }

    public static int minus(int minus) {
        return x - minus;
    }

    public int divide(int divide) {
        return divide / x;
    }

    public int multiply(int multiply) {
        return x * multiply;
    }

    public int sumAllOperation(int result) {
        return Calculator.sum(result) + Calculator.minus(result) + divide(result) + multiply(result);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = sum(5);
        int result2 = minus(5);
        int result3 = calculator.divide(5);
        int result4 = calculator.multiply(5);

        int total = calculator.sumAllOperation(5);

        System.out.println("Sum: " + result1);
        System.out.println("Minus: " + result2);
        System.out.println("Divide: " + result3);
        System.out.println("Multiply: " + result4);
        System.out.println("Total: " + total);
    }
}
