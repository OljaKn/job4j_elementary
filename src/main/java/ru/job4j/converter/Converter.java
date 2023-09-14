package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(1000);
        float dollar = Converter.rubleToDollar(500);
        System.out.println("1000 rubles are " + euro + " euro.");
        System.out.println("500 rubles are " + dollar + " dollar.");
    }
}
