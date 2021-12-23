package InfreanAlgorithm;



import java.util.Scanner;
import java.util.StringTokenizer;

public class infrean0103 {
    public String solution(String str) {
        StringTokenizer st = new StringTokenizer(str, " ");
        int max = 0;
        String answer = "";
        String temp = "";
        while(st.hasMoreTokens()){
            temp=st.nextToken();

            if(max<temp.length()){
                max=temp.length();
                answer=temp;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        infrean0103 T = new infrean0103();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine(); //문자열 읽기



        System.out.println(T.solution(str));

    }
}
