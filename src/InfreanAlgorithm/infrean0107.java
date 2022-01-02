package InfreanAlgorithm;


import java.util.Scanner;


public class infrean0107 {
    public static String solution(String str) {
        String answer = "NO";

        for(int i = 0; i<str.length()/2; i++){
            if (Character.toLowerCase(str.charAt(i))==Character.toLowerCase(str.charAt(str.length()-i-1))){
                answer = "YES";
            }
            if(answer.equals("NO")){
                break;
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

