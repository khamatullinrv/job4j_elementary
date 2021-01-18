package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        if (first >= second) {
            if (first >= third) {
                return first;
            } else {
                return third;
            }

        } else {
            if (second >= third) {
                return second;
            } else {
                return third;
            }
        }
    }

    public static void main(String[] args) {
        //System.out.println(MultiMax.max(1, 7, -3));
        int result = MultiMax.max(1, 7, -3);
        System.out.println(result);

    }

}