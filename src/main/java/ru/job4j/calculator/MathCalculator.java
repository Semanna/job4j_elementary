package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double substractAndDivide(double first, double second) {
        return substract(first, second)
                + divide(first, second);
    }

    public static double sumOfAllOperations(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + substract(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат суммирования вычислений суммы и умножения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат суммирования вычислений вычитания и деления равен: " + substractAndDivide(20, 40));
        System.out.println("Результат суммирования вычислений всех 4 операций равен: " + sumOfAllOperations(10, 20));
    }
}
