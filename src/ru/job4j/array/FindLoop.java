package ru.job4j.array;

public class FindLoop {
     public static int indexOf(int[] data, int el) {

         int rst = -1; // если элемента нет в массиве, то возвращаем -1.

         for (int index = 0; index < 10; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }

        }
        return rst;
    }

    public static void main(String[] args) {
        {
            int[] data = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            System.out.println(data [0]);
            System.out.println( indexOf(data, 10));
            //  indexOf
        }
    }
}
