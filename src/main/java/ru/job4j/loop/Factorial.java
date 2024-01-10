package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        if (number == 0) {
            return 1;
        } else {
            for (int n = 1; n <= number; n++) {
                result = result * n;
            }
        }
        return result;
    }
}
