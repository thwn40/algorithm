package InfreanAlgorithm;


import java.util.Scanner;


public class infrean0108 {
    public static String solution(String str) {
        String answer = "NO";
        String temp = "";
        for(int i=0; i<str.length(); i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                temp+=str.charAt(i);
            }

        }



        for(int i = 0; i<temp.length()/2; i++){

            if (Character.toLowerCase(temp.charAt(i))==Character.toLowerCase(temp.charAt(temp.length()-i-1))) {
                answer = "YES";
            }
            else{
                answer = "NO";
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

