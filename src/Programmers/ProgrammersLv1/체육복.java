package Programmers.ProgrammersLv1;

import java.util.*;

public class 체육복 {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        HashMap<Integer,Integer> result = new HashMap<>();
        Arrays.sort(lost);

        for (int i = 1; i < n+1; i++) {
            result.put(i,1);
        }

        for (int i : lost) {
            result.put(i,result.get(i)-1);
        }

        for (int i : reserve) {
            result.put(i,result.get(i)+1);
        }
        System.out.println(result);
        for (int i = 1; i < n+1; i++) {
            if(i==1&&result.get(i)>=2){
                if(result.get(i+1)==0){
                    result.put(i,result.get(i)-1);
                    result.put(i+1,result.get(i+1)+1);
                }

            }
            else if(i>1&&i<n&&result.get(i)>=2){

                if(result.get(i-1)==0){
                    result.put(i,result.get(i)-1);
                    result.put(i-1,result.get(i-1)+1);

                }
                else if(result.get(i+1)==0){
                    result.put(i,result.get(i)-1);
                    result.put(i+1,result.get(i+1)+1);

                }
            }
            else if(i==n&&result.get(i)>=2){
                if(result.get(i-1)==0){
                    result.put(i,result.get(i)-1);
                    result.put(i-1,result.get(i-1)+1);
                }

            }
            System.out.println("i = " + i);
            System.out.println(result);
        }

        for (int i = 1; i < n+1; i++) {
            if(result.get(i)>=1){
                answer++;
            }
        }

        System.out.println(result);


        return answer;
    }

    public static void main(String[] args) {
        체육복 s = new 체육복();
        int[] lost = new int[]{4, 2};
        int[] reserve = new int[]{3,5};

        System.out.println(s.solution(5, lost, reserve));
    }
}
