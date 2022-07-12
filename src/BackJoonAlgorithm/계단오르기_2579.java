package BackJoonAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 계단오르기_2579 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stair = new int[N+1];
        int[] dp = new int[101];

        for (int i = 1; i <= N; i++) {
            stair[i]= Integer.parseInt(br.readLine());
        }

        dp[1]=stair[1];
        dp[2]=stair[1]+stair[2];

        for (int i = 3; i <=N; i++) {
            dp[i]=Math.max(dp[i-3]+stair[i-1],dp[i-2])+stair[i];

        }

        System.out.println(dp[N]);







    }
}
