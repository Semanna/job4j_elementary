package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return (second < first) ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }

    public static void main(String[] args) {
        int result = max(2, 5, 8, 12);
        System.out.println("Максимальное число: " + result);
    }

}
