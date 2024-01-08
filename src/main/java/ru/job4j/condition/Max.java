package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return (left < right) ? right : left;
    }

    public static void main(String[] args) {
        int result = Max.max(1, 2);
        System.out.println("Максимальное число: " + result);
    }

}
