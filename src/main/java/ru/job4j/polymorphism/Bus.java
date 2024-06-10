package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус ездит по городу со скоростью не более 60 км/ч");
    }

    @Override
    public void countPassengers(int passenger) {
        System.out.println("Количество пассажиров: " + passenger);
    }

    @Override
    public void refill(double fuelQuantity) {
        System.out.println("Количество топлива в баке: " + fuelQuantity);
    }
}
