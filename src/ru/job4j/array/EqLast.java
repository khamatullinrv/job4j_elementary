package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        if (left[left.length-1] == right[right.length-1]) {
            return true;
        }
        else  {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 2};
        int[] right = {5, 4, 3};
        System.out.println(EqLast.check(left, right));
    }
}