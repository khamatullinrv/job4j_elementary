package ru.job4j.loop;

public class Counter {
   /* public static int sum(int start, int finish) {
        int sum = 0;
        for ( start = 0; start <= finish; start++  ) {
            sum = sum + start;
        }
        return sum;
    } */
    public static int sumByEven(int start, int finish) {
        int sum = 0;
         //i = start;
        for ( int i = start; i <= finish; i++) {
            //start2 = start;
            if (i % 2 == 0 ) {
             sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
            // System.out.println(sum(0, 10));
            // System.out.println(sum(0, 10));
            //System.out.println(sum(3, 8));
            //System.out.println(sum(1, 1));

        System.out.println(sumByEven(7, 10));
        System.out.println(sumByEven(1, 30));
        System.out.println(sumByEven(1, 1));
    }
}