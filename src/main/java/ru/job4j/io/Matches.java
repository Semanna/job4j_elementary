package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;

        while (count > 0) {
            int maxCount = Math.min(3, count);
            String player = turn ? "Первый игрок," : "Второй игрок,";
            System.out.println(player + " введите число от 1 до " + maxCount + ":");
            int matches = Integer.parseInt(input.nextLine());

            if (matches <= maxCount && matches >= 1) {
                count = count - matches;
                System.out.println("На столе осталось спичек: " + count);
                turn = !turn;
            } else {
                System.out.println("Допустим только ввод чисел от 1 до " + maxCount);
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
