package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double p= (a + b + c)/2;
        double rsl = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(15, 15, 24);
        System.out.println("area (10, 10, 12) = " + rsl);
    }
}
