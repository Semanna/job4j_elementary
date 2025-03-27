package ru.job4j.calculator;

public class Fit {
    private static final int MAN_BASE = 100;
    private static final int WOMAN_BASE = 110;
    private static final double FACTOR = 1.15;

    public static double calculateWeight(short height, int base, double factor) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        return (height - base) * factor;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;
        double man = calculateWeight(heightMan, MAN_BASE, FACTOR);
        double woman = calculateWeight(heightWoman, WOMAN_BASE, FACTOR);

        System.out.printf("Man %d is %.2f%n", heightMan, man);
        System.out.printf("Woman %d is %.2f%n", heightWoman, woman);
    }
}
