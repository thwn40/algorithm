package Programmers.ProgrammersLv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class 같은숫자는싫어 {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] arr2 = new int[arr.length+2];

        arr2[0]=99;
        arr2[arr.length+1]=99;
        for (int i = 0; i < arr.length ; i++) {
            arr2[i+1]=arr[i];

        }


        for (int i = 2; i < arr.length+2; i++) {
            if(arr2[i-1]!=arr2[i]){
               answer.add(arr2[i-1]);
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        같은숫자는싫어 s = new 같은숫자는싫어();
        s.solution(new int[]{2,0,0,0});
    }
}
