package Programmers.ProgrammersLv1;

import java.util.*;

public class 체육복 {

    public int solution(int n, int[] lost, int[] reserve) {
        /**
         * 1. 전체학생에 대한 HashMap을 만들고 체육복이 하나씩 있다고 가정한다.
         * 2. lost배열을 돌면서 체육복을 잃어버린 학생들은 -1을 해준다.
         * 3. reserve배열을 돌면서 여벌 체육복이 있는 학생들은 +1을 해준다.
         * 4. HashMap을 돌면서 체육복이 2개 이상 있는 학생들은 앞뒤에 체육복이 없는 학생에게 빌려준다 그럼 체육복 빌려준 학생은 -1해주고 빌린 학생은 +1 해준다.
         * 5. 체육복이 한개 이상있는 학생들의 갯수를 세준다.
         */
        int answer = 0;
        HashMap<Integer,Integer> result = new HashMap<>();

        for (int i = 0; i < n+2; i++) {
            result.put(i,1);
        }

        for (int i : lost) {
            result.put(i,result.get(i)-1);
        }

        for (int i : reserve) {
            result.put(i,result.get(i)+1);
        }


        for (int i = 1; i < n+1; i++) {
            if(result.get(i)>=2){
                    if(result.get(i-1)==0){
                        result.put(i,result.get(i)-1);
                        result.put(i-1,result.get(i-1)+1);
                    }

                    else if(result.get(i+1)==0){
                        result.put(i,result.get(i)-1);
                        result.put(i+1,result.get(i+1)+1);
                    }
                }

        }

        for (int i = 1; i < n+1; i++) {
            if(result.get(i)>=1){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        체육복 s = new 체육복();
        int[] lost = new int[]{4, 2};
        int[] reserve = new int[]{3,5};

        System.out.println(s.solution(5, lost, reserve));
    }
}
