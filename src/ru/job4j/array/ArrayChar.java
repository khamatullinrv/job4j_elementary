package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i <= pref.length-1; i++) {
            if (word[i] == pref[i]) {
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 't'};
        boolean res = ArrayChar.startsWith(word, pref);
        System.out.println(res);
    }
}