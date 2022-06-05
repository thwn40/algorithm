package ProgrammersLv1.코딩테스트;

import java.util.*;

public class aceproject2 {


    static char[] s;
    static boolean[] visited;
    static HashSet<String> temp = new LinkedHashSet<>();
    public void dfs(int index){
        if(index==s.length){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length; i++) {
                if(visited[i]){
                    sb.append(s[i]);
                }

            }
            temp.add(sb.toString());
            return;
        }


        visited[index]=true;
        dfs(index+1);
        visited[index]=false;
        dfs(index+1);


    }





    public String solution(String b) {
        s = b.toCharArray();
        visited = new boolean[s.length];
        dfs(0);
        ArrayList<String> list = new ArrayList<>(temp);
        Collections.sort(list,Collections.reverseOrder());


        return list.get(0);
    }

    public static void main(String[] args) {


        aceproject2 a = new aceproject2();
        System.out.println(a.solution("baba"));



    }


}
