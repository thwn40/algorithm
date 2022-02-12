package InfreanAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;


public class infrean0106 {
    public static void solution(String str) {
        char[] s = str.toCharArray();
        ArrayList<Character> answer = new ArrayList<Character>();
        int i =0;
        for (char x : s) {
//            if (!answer.contains(x)) {
//                answer.add(x);
//                System.out.print(x);
//
//            }

            if(str.indexOf(str.charAt(i))==i){
                answer.add(x);
                System.out.print(x);
                i++;
            }


        }
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


        String a = kb.nextLine();
        solution(a);

    }
}

