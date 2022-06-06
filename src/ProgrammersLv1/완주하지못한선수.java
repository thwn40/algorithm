package ProgrammersLv1;

import java.util.*;
import java.util.stream.Collectors;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
       /**
        //1. 두 배열을 정렬한다.
        Arrays.sort(participant);
        Arrays.sort(completion);

        //2. 두 배열이 다를때까지 찾는다.
        int i = 0;
        for (; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                break;
            }
            //3. 여기까지 왔다면, 마지막 주자가 완주하지 못한 선수다.
        }
        return participant[i];
        **/




        HashMap<String, Integer> map = new HashMap<>();

        //해쉬맵을 만든다.
        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i],map.getOrDefault(participant[i],0)+1);
        }

        //해쉬맵을 뺀다.
        for (String s : completion) {
            if(map.get(s)!=null&&map.get(s)>1){
                map.put(s,map.getOrDefault(s,0)-1);
            }
            else{
                map.remove(s);
            }

        }
        //map 연습
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("[key]:" + entry.getKey() + ", [value]:"+entry.getValue());
        }

        for (String s : map.keySet()) {
            Integer integer = map.get(s);
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println("key"+ next.getKey()+ "value"+next.getValue());
        }

        Iterator<String> iterator1 = map.keySet().iterator();
        while(iterator1.hasNext()){
            String next = iterator1.next();
            Integer value = map.get(next);
            System.out.println("key = " + next+"value = "+ value);
        }

        map.entrySet().stream().forEach(a -> System.out.println(a.getKey()));


        //3. value가 0이 아닌 마지막 주자를 찾는다.
        return map.toString().split("=")[0].substring(1);
    }

    public static void main(String[] args) {
        완주하지못한선수 s = new 완주하지못한선수();
        System.out.println(s.solution(new String[]{"mislav", "stanko", "mislav", "ana","ana","ana"},new String[]{"stanko", "ana", "mislav","ana","ana"}));
        System.out.println();
        System.out.println(s.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println();
        System.out.println(s.solution(new String[]{"leo", "kiki", "eden"},new String[]{"eden", "kiki"}));
        System.out.println();
        System.out.println(s.solution(new String[]{"a", "b", "c"},new String[]{"a", "b"}));

    }
}
