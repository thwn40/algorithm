


import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void solution(String str) {
        char[] s = str.toCharArray();
        ArrayList<Character> answer = new ArrayList<Character>();
        for (char x : s) {
            if (!answer.contains(x)) {
                answer.add(x);
                System.out.print(x);

            }


        }
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


        String a = kb.nextLine();
        solution(a);

        }
    }

