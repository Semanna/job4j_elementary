package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println("Cat " + this.name + " ate " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void getNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.getNick("Gav");
        gav.eat("kotleta");
        gav.show();

        Cat black = new Cat();
        black.getNick("Black");
        black.eat("fish");
        black.show();

    }
}
