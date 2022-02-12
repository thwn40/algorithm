package InfreanAlgorithm;

import java.util.Scanner;

public class infrean0102 {
    public String solution(String str) {
        StringBuffer sb = new StringBuffer();
 /*
            대문자는 아스키넘버 65~90
            소문자는 아스키넘버 97~122 둘의 차이는 32 소문자-32 = 대문자
             */
//            if (Character.isLowerCase(x)) {
//                sb.append(Character.toUpperCase(x));
//            }
//            else
//                sb.append(Character.toLowerCase(x));

        for(char i : str.toCharArray()){

            if (Character.isLowerCase(i)) {
                sb.append(Character.toUpperCase(i));
            }
            else
                sb.append(Character.toLowerCase(i));


        }
        return sb.toString();
    }

    public static void main(String[] args) {
        infrean0102 T = new infrean0102();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); //문자열 읽기


        System.out.println(T.solution(str));

    }
}
