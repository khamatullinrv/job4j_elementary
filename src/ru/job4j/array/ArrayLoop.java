package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {

        int[] numbers = new int[5];

          /* for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
            System.out.println(numbers[index]);
        } */

        //int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            for (int index : numbers) {
                System.out.println(index);
            }
        }
    }
}
