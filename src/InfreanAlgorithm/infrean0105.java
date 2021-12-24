package InfreanAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;


public class infrean0105 {
    public static void solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());


    }
    public static String solution3(String str) {

            char[] s = str.toCharArray();
            int lt = 0, rt = str.length() - 1;
            while (lt < rt) {
                if(!Character.isLetter(s[lt])){
                    lt++;

            }
                else if(!Character.isLetter(s[rt])){
                    rt--;
                }
                else{
                    char tmp = s[lt];
                    s[lt] = s[rt];
                    s[rt] = tmp;
                    lt++;
                    rt--;
                }

        }
        String tmp = String.valueOf(s);
        return tmp;
    }

    public static String[] solution2(String str) {
        String[] answer = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if ((64 < str.charAt(i) && str.charAt(i) < 91) || (96 < str.charAt(i) && str.charAt(i) < 123)) {

                answer[str.length() - i - 1] = String.valueOf(str.charAt(i));
            } else {
                answer[i] = String.valueOf(str.charAt(i));
            }


            //a#b!GE*T@S
            //S

        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


        String s = kb.nextLine();
        System.out.println(solution3(s));


    }
}
