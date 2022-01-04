package InfreanAlgorithm;
import java.util.Scanner;


public class infrean0109{
    public static int solution(String str) {
        String answer = "";
        String temp = "";
        //        int answer = 0;
//        for(char x : str.toCharArray()){
//            if(x>=48 && x<=57)
//                answer = answer*10+(x-48);
//        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                temp += str.charAt(i);
            }
        }
        return Integer.parseInt(temp);

//        int count = 0;
//        for(int i = 0; i<temp.length(); i++){
//            if(temp.charAt(i)!='0'){
//                break;
//            }
//            else{
//                count++;
//            }
//        }
//
//        if(temp.startsWith("0")){
//            for(int i = count; i<temp.length(); i++){
//                answer+=temp.charAt(i);
//            }
//            return answer;
//        }
//        else {
//            return temp;
//        }
//
//       }
        }




    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


        String a = kb.nextLine();
        System.out.println(solution(a));


    }
}