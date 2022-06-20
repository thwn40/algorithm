package Programmers.ProgrammersLv1;

import java.awt.image.ImageProducer;
import java.util.*;

public class 실패율 {


    public ArrayList<Integer> solution(int N, int[] stages) {
        Map<Integer, Double> result = new TreeMap();

        for (int i = 1; i < N + 1; i++) {

            int clear = 0;
            int challenge = 0;

            for (int stage : stages) {
                if (stage >= i) {
                    clear++;
                }
                if (stage == i) {
                    challenge++;

                }
            }

            if(challenge==0||clear==0){
                result.put(i, 0.0);
            }
            else{
                result.put(i, (double)challenge / clear);
            }

        }

        List<Map.Entry<Integer,Double>> entryList = new LinkedList<>(result.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        ArrayList<Integer> answer = new ArrayList<>();

        for (Map.Entry<Integer, Double> integerDoubleEntry : entryList) {
            answer.add(integerDoubleEntry.getKey());
        }

            return answer;
        }



    public static void main(String[] args) {
        실패율 s = new 실패율();
        System.out.println(s.solution(5,new int[]{2,1,2,6,2,4,3,3}));
    }
}

