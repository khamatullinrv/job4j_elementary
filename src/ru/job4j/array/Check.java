package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == data[i + 1]) {
            } else result = false;
            break;
        }
        return result;
    }

    public static void main(String[] args) {
            boolean[] data = new boolean[]{true,false, true, true,false, true};
            boolean rsl = Check.mono(data);
             System.out.println( rsl);
        }
  }
