package InfreanAlgorithm;
import java.util.Scanner;


public class infrean0104 {
    public static void solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());


    }
    public static String solution2(String str){
        String answer= "";
        for(int i = str.length()-1; i>=0; i--){
            answer+=str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);



            String s = kb.nextLine();
            for (char t :
                    solution2(s).toCharArray()) {
                System.out.println("t = " + t);



        }

    }
}
