package InfreanAlgorithm;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class infrean0803 {


        public int[] solution(String[] id_list, String[] report, int k) {
            Map<String,String> map = new HashMap<>();
            int[] answer = {0,0,0,0};
            int[] mail = {0,0,0,0};

            report = Arrays.stream(report).distinct().toArray(String[]::new);
            for (String s : report) {
                String[] reporter = s.split(" ");
                for (int i =0; i<id_list.length; i++) {
                    if(id_list[i].equals(reporter[1])){
                        map.put(reporter[1],reporter[0]);
                    }
                }
            }
            System.out.println(map);

            return answer;
        }

    public static void main(String[] args){

        infrean0803 T = new infrean0803();
        String[] id={"muzi", "frodo", "apeach", "neo"};
        String[] report={"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi","apeach muzi"};

        System.out.println(Arrays.toString(T.solution(id, report, 2)));


    }


    }
