package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inputRubblesToEuro = 140;
        float expectedEuro = 2;
        float outputEuro = Converter.rubleToEuro(inputRubblesToEuro);
        boolean passedEuro = expectedEuro == outputEuro;
        System.out.println("140 rubles are 2 euro. Test result: " + passedEuro);

        float inputRubblesToDollar = 180;
        float expectedDollar = 3;
        float outputDollar = Converter.rubleToDollar(inputRubblesToDollar);
        boolean passedDollar = expectedDollar == outputDollar;
        System.out.println("180 rubles are 3 dollars. Test result: " + passedDollar);
    }
}
