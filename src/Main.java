



import java.util.Scanner;


public class Main {
    public static String solution(String str) {
        String answer = "";
        String temp = "";
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                temp+=str.charAt(i);
            }

        }


        int count = 0;
        for(int i = 0; i<temp.length(); i++){
            if(temp.charAt(i)!='0'){
                break;
            }
            else{
                count++;
            }
        }

        if(temp.startsWith("0")){
            for(int i = count; i<temp.length(); i++){
            answer+=temp.charAt(i);
            }
            return answer;
        }
        else {
            return temp;
        }


        }



    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


        String a = kb.nextLine();
        System.out.println(solution(a));


        }
    }

