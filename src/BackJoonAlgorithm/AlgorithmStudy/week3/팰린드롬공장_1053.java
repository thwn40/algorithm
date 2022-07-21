package BackJoonAlgorithm.AlgorithmStudy.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬공장_1053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuffer sb1 = new StringBuffer(s);
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();

        if(sb.equals(sb1)){
            System.out.println(0);
        }
    }
}
