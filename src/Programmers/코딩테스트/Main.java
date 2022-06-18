package Programmers.코딩테스트;

import java.util.ArrayList;

public class Main {
    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

  public long solution(int[][] beds, int[][] tables, int cost){
      long answer=0;
      ArrayList<Point> bedspoint = new ArrayList<>();
      ArrayList<Point> tablepoint = new ArrayList<>();
      for (int i = 0; i < beds.length; i++) {
          bedspoint.add(new Point(beds[i][0],beds[i][1]));
      }
      for (int i = 0; i < tables.length; i++) {
          tablepoint.add(new Point(tables[i][0],tables[i][i]));
      }
      return answer;
  }

    public static void main(String[] args) {

    }
}
