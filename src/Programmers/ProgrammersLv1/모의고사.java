package Programmers.ProgrammersLv1;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {
    static boolean[] visited;
    public ArrayList<Integer> solution(int[] answers) {
        visited = new boolean[answers.length];
        int [] math1 = new int[]{1, 2, 3, 4, 5};
        int [] math2 = new int[]{2,1,2,3,2,4,2,5};
        int [] math3 = new int[]{3,3,1,1,2,2,4,4,5,5};

        int[][] math = new int[3][answers.length];
        int temp =0 ;
        int[] result = {0,0,0};


        for (int i = 0; i < answers.length; i++) {
            if(answers[i]==math1[i%5]){
                result[0]++;
            }
            if(answers[i]==math2[i%8]){
                result[1]++;
            }
            if(answers[i]==math3[i%10]){
                result[2]++;
            }

        }

        temp = Math.max(temp,result[0]);
        temp =  Math.max(temp,result[1]);
        temp =  Math.max(temp,result[2]);

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            if(result[i]>=temp){
                answer.add(i+1);
            }
        }

        System.out.println(answer);
        return answer;
    }



    public static void main(String[] args) {
        //1번 수포자 12345 반복
        //2번 수포자 21232425반복
        //3번 수포자 3311224455반복

        모의고사 S = new 모의고사();
        S.solution(new int[]{1,3,2,4,2});

    }

}
