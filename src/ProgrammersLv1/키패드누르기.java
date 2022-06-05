package ProgrammersLv1;


import java.util.HashMap;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}


public class 키패드누르기 {


    public String solution(int[] numbers, String hand) {
        String answer = "";
        hand = (hand.equals("right")) ? "R" : "L";


        HashMap<Integer, Point> numbersMap = new HashMap<>();
        int count = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numbersMap.put(count, new Point(i, j));
                count++;
            }
        }
        numbersMap.put(0, new Point(3, 1));

        Point currentLThumb = new Point(3, 0);
        Point currentRThumb = new Point(3, 2);

        for (int number : numbers) {
            String temp = "";

            if (number == 1 || number == 4 || number == 7) {
                temp = "L";
            } else if (number == 3 || number == 6 || number == 9) {
                temp = "R";
            } else {

                if (distance(currentLThumb, numbersMap.get(number)) > distance(currentRThumb, numbersMap.get(number))) {
                    temp= "R";
                }
                else if (distance(currentLThumb, numbersMap.get(number)) < distance(currentRThumb, numbersMap.get(number))) {
                    temp= "L";
                }
                else {
                    if (hand.equals("R")) {
                        temp= "R";
                    } else {
                        temp= "L";
                    }
                }
            }
            currentRThumb = temp.equals("R") ? numbersMap.get(number) : currentRThumb ;
            currentLThumb = temp.equals("L") ? numbersMap.get(number) : currentLThumb ;

            answer+=temp;

        }

        return answer;
    }

    public static void main(String[] args) {
        키패드누르기 s = new 키패드누르기();
        s.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");

    }

    public int distance(Point a, Point b) {

        int x = Math.abs(b.x - a.x);
        int y = Math.abs(b.y - a.y);
        return x + y;
    }


}
