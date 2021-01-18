package ru.job4j.condition;

public class MultiMax {
    public static void max(int first, int second, int third) {
        if (first >= second) {
            if (first >= third) {
                System.out.println(first);
            } else {
                System.out.println(third);
            }

        } else {
            if (second >= third) {
                System.out.println(second);
            } else {
                System.out.println(third);
            }
        }
    }

    public static void main(String[] args) {
        //System.out.println(MultiMax.max(1, 7, -3));
      //  int result = MultiMax.max(1, 7, -3);
       // System.out.println(result);
        MultiMax.max(2,5,8);

    }

}