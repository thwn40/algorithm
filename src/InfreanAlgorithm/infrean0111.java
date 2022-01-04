package InfreanAlgorithm;

import java.util.Scanner;


public class infrean0111 {
    public static String solution(String str) {
        String answer = "";
        int count = 1;
        str+=" ";
        for(int i = 0; i<str.length()-1; i++){

            if(str.charAt(i)!=str.charAt(i+1)){

                answer+=str.charAt(i);

                if (count != 1) {
                    answer += count;
                    count=1;
                }
            }

            else{
                count++;

            }

        }


        return answer;
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


        String a = kb.nextLine();

        System.out.println(solution(a));



    }
}