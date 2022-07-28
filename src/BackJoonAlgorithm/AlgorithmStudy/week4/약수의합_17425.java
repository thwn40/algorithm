package BackJoonAlgorithm.AlgorithmStudy.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 약수의합_17425 {
    public static void main(String[] args) throws IOException {
        long N;
        long answer = 0; // 1000000까지 입력할 것을 고려
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long T = Integer.parseInt(br.readLine());
        long[] Tlist = new long[(int)T];
        for (int i = 0; i < T; i++) {
             Tlist[i]= Integer.parseInt(br.readLine());
        }

        long[] arr = new long[1000001];
        long[] psum = new long[1000001];
        for (int i = 0; i < T; i++) {

            N = Tlist[i];
            for (long j = 1; j <= 1000001; j++) {
                arr[(int) N] += j * (N / j);
            }

        }



    }
}

