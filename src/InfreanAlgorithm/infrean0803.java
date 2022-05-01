package InfreanAlgorithm;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class infrean0803 {


        public int[] solution(String[] id_list, String[] report, int k) {
            Map<String,Integer> singo = new HashMap<>();
            Map<String,String> map = new HashMap<>();
            Map<String,String> map2 = new HashMap<>();
            int[] answer = new int[id_list.length];

            report = Arrays.stream(report).distinct().toArray(String[]::new);

            for (String s : id_list) {
                singo.put(s,0);
            }

            for (String s : report) {
                String[] reporter = s.split(" ");
                map.put(reporter[1],map.get(reporter[1])+" "+reporter[0]);
                singo.put(reporter[0],singo.get(reporter[0])+1);

            }

            for (String s : report) {
                String[] reporter = s.split(" ");
                if(map.get(reporter[1]).split(" ").length<=k){
                    singo.put(reporter[0],singo.get(reporter[0])-1);
                }

            }



            for (int i = 0; i < id_list.length; i++) {
                answer[i]=singo.get(id_list[i]);

            }
        
            return answer;
        }
        

    public static void main(String[] args){

        infrean0803 T = new infrean0803();
        String[] id={"muzi", "frodo", "apeach", "neo"};
        String[] report={"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi","apeach muzi"};

        System.out.println(Arrays.toString(T.solution(id, report, 2)));


    }


    }
