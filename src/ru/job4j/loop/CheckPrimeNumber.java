package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(long number) {
        boolean prime = true;
        for (long i = 2; i < number; i++) {
              if (number % i == 0) {
                  prime = false;
                  break;
            }
        }
          return prime;
    }

    public static void main(String[] args) {
            System.out.println(check(5));
            System.out.println(check(4));
             System.out.println(check(3));

    }
}