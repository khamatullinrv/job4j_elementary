package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        System.out.println("The age of the customer is : " + age);
        if ( age >= 21) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }

    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);
        Cinema.access(17);
        Cinema.access(18);
        Cinema.access(19);
        Cinema.access(20);
        Cinema.access(21);
    }
}