package Programmers.ProgrammersLv1;

import java.awt.image.ImageProducer;
import java.sql.Array;
import java.util.*;

public class 실패율 {


    public ArrayList<Integer> solution(int N, int[] stages) {

        Map<Integer,Double> result = new HashMap<>();


            int[] users = new int[N+1];
            int clear = 0;
            int challenge = stages.length;
            for (int stage : stages) {
                users[stage-1]++;
            }

        for (int i = 0; i < N; i++) {
            if(users[i]==0){
                result.put(i+1,0.0);
            }
            else{
                result.put(i+1,(double)users[i]/challenge);
                challenge -=users[i];
            }

        }




        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(result.keySet());
        Collections.sort(list,Comparator.comparingDouble(result::get).reversed());


        return list;
        }



    public static void main(String[] args) {
        실패율 s = new 실패율();
        System.out.println(s.solution(5,new int[]{2,1,2,6,2,4,3,3}));
    }
}

