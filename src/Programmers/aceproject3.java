package Programmers;

import java.util.Arrays;

public class aceproject3 {

    public int solution(int n, int maxhp, int[] times, int[] effects) {
        int answer = 0;
        int potionEffect = 0;

        int curhp = 0;


        for (int i = 0; i < times[n-1]+1; i++) {
        for (int j = 0; j < n; j++) {
            if (i == times[j]) {
                potionEffect += effects[j];
                curhp -= effects[j];
                break;
            }
        }
        curhp += potionEffect;
        if (curhp >= maxhp) {
            curhp = maxhp;
            answer++;

        }
        if (curhp <= 0) {
            curhp = 0;
            answer++;
        }


        }


        return answer;
    }

    public static void main(String[] args) {
        aceproject3 a = new aceproject3();
        System.out.println( a.solution(5,10,new int[]{1,5,7,10,11}, new int[]{4,-6,-1,4,1}));

        
    }
}
