package ru.job4j.condition;

public class Max {
    public static int condition (int left, int right) {
        boolean condition = true;
        int result = left > right ? left:right;
        return result;
    }

    public static void main(String[] args) {
        int result = Max.condition(2, 4 );
        System.out.println(result);
    }
}