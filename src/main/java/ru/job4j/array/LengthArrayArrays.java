package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{2}, {3, 4}, {1, 5, 7}, {6, 8, 9, 0}};
        for (int[] number : numbers) {
            System.out.println("Размер вложенного массива равен : " + number.length);
        }
    }
}
