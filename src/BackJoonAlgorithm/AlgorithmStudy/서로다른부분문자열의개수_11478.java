package BackJoonAlgorithm.AlgorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 서로다른부분문자열의개수_11478 {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        HashSet<String> answer = new HashSet<>();
        int n=s.length();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i<=j)
                answer.add(s.substring(i,j));
            }

        }
        System.out.println(answer.size()-1);



    }
}
