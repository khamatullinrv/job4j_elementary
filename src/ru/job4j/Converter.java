package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar.");

        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int in_usd = 120;
        int expected_usd = 2;
        int out_usd = Converter.rubleToEuro(in);
        boolean passed_usd = expected_usd == out_usd;
        System.out.println("120 rubles are 2. Test result : " + passed_usd);
    }
}
