package ru.job4j.condition;

public class Triangle {

    public static boolean NOTexist(double ab, double ac, double bc) {
        return ab + bc <= ac || ab + ac <= bc || ac + bc <= ac;



    }

    public static void main(String[] args) {
        System.out.println(NOTexist(2, 2, 2));
        System.out.println(NOTexist(4, 4, 8));
    }
}