package BackJoonAlgorithm.AlgorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 포도주시식_2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] wine = new int[N+1];
        int[] dp = new int[101];

        for (int i = 0; i < N; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }
        dp[0]=wine[0];
        dp[1]=wine[0]+wine[1];


        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i-2]+dp[i-3],dp[i-3]+dp[i-1])+wine[i];

        }
        System.out.println(Arrays.toString(dp));

        System.out.println(dp[N]);


    }
}
