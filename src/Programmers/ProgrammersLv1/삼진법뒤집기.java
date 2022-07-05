package Programmers.ProgrammersLv1;

import java.util.ArrayList;

public class 삼진법뒤집기 {
    public int solution(int n) {
        /**
         * 1.3진법으로 만들기
         * 2.역순으로 뒤집기
         * 3.다시 10진법으로 만들기
         */
        int answer = 0;
        Integer temp = n;
        StringBuilder result2 = new StringBuilder();
        ArrayList<Integer> result = new ArrayList<>();
        while(temp>0){
            result.add(temp%3);
            result2.append(temp%3);
            temp=temp/3;

        }
        System.out.println("result2 = " + result2);
        for (int i = result.size()-1; i >=0; i--) {
            answer+= result.get(i) * Math.pow(3, result.size()-i-1);
        }
        System.out.println(Integer.parseInt(result2.toString(),3));

        return answer;
    }
    public static void main(String[] args) {
        삼진법뒤집기 a = new 삼진법뒤집기();
        System.out.println(a.solution(45));
    }
}
