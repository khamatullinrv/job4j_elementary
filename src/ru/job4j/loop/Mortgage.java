package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, int percent) {
        int year = 0;
        while (amount * percent / 100+ amount - salary > 0) {
            amount = amount + amount * percent / 100;
            amount = amount - salary;
            year++;
            }
        year++;
        return year;
    }

    public static void main(String[] args) {
        System.out.println(Mortgage.year(100, 70, 50));
        System.out.println(Mortgage.year(1000, 1200, 1));
        System.out.println(Mortgage.year(100, 120, 50));

    }
}