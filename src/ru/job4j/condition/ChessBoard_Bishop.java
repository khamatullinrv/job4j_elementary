package ru.job4j.condition;

public class ChessBoard_Bishop {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
          if ((x1 - x2) == (y1 - y2)) {
              rsl = Math.abs(x2 - x1);
          }
           // rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        return rsl;
        }


    public static void main(String[] args) {
        System.out.println(ChessBoard_Bishop.way(0, 0, 10, 10));
    }
}
