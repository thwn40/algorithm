package Programmers.ProgrammersLv1;

import java.util.HashMap;
import java.util.Map;

public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        /**
         * left부터 right까지 반복한다
         * 약수를 찾는다
         * 약수의 갯수가 짝수면 더하고,홀수면 뺀다
         */
        HashMap<Integer,Integer> map = new HashMap();


        int answer = 0;
        for (int i = left; i <= right; i++) {
            yaksuToMap(map, i);
        }
        Integer temp = 0;
        for (Integer integer : map.keySet()) {
            answer = evenOrOdd(map, answer, integer);

        }
        return answer;
    }

    private int evenOrOdd(HashMap<Integer, Integer> map, int answer, Integer integer) {
        Integer temp;
        temp= map.get(integer);
        if(temp%2==1){
            answer -= integer;
        }
        else{
            answer += integer;
        }
        return answer;
    }

    private void yaksuToMap(HashMap<Integer, Integer> map, int i) {
        for (int j = 1; j < i +1; j++) {
            if(i %j==0){
                map.put(i, map.getOrDefault(i,0)+1);
            }
        }
    }

    public static void main(String[] args) {
        약수의개수와덧셈 s = new 약수의개수와덧셈();
        System.out.println(s.solution(13,17));

    }
}
