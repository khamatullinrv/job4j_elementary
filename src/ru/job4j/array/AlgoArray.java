package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};

        for (int index = 0; index < (array.length - 1); index++) {
            boolean flag = true;
            while (flag) {
                flag = false;
                for (int i = 0; i < array.length-1;  i++) {
                    if (array[i] > array[i + 1]) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        //System.out.println(array[index]);
                        flag = true;
                    }
                }
            }

            for ( index = 0; index < array.length; index++) {
                System.out.println(array[index]);
            }
        }
    }
}