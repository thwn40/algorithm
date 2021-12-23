package InfreanAlgorithm;

import java.util.Scanner;


public class infrean0105 {
    public static void solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());


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

        for (String t :
                solution2(s)) {
            System.out.print(t);


        }
    }
}
