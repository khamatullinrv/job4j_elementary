package ru.job4j.condition;


public class MultipleSwitchWeek {

    public static int numberOfDay (String name) {
        return switch (name) {
            case "понедельник", "Monday" -> 1;
            case "вторник", "tuesday" -> 2;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        //int daynum;
        System.out.println(MultipleSwitchWeek.numberOfDay("понедельник"));
        System.out.println(numberOfDay("Monday"));
        System.out.println(MultipleSwitchWeek.numberOfDay("вторник"));
        System.out.println(numberOfDay("tuesday"));
    }
}