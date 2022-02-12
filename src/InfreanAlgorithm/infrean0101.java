package InfreanAlgorithm;

import java.util.Scanner;

public class infrean0101 {
    public int solution(String str, char t) {
        int answer = 0;
        str=str.toUpperCase();
        t=Character.toUpperCase(t);
//        for (int i = 0; i < str.length(); i++) {
//            if ((str.charAt(i)) ==t) {
//                answer++;
//            }
//        }
        for(int i : str.toCharArray()){
            if (i ==t) {
                answer++;
            }
            //향상된 for문을 쓴 버젼

        }
            return answer;
        }
        public static void main(String[] args){
            infrean0101 T = new infrean0101();
            Scanner kb = new Scanner(System.in);
            String str = kb.next(); //문자열 읽기
            char c = kb.next().charAt(0);


            System.out.println(T.solution(str, c));

        }
    }

