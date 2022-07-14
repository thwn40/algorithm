package BackJoonAlgorithm.AlgorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 연속합_1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[N];

        int[] dp = new int[N];

        System.out.println(Arrays.toString(dp));
        int idx = 0;
        while (st.hasMoreTokens()) {
            numbers[idx] = (Integer.parseInt(st.nextToken()));
            idx++;
        }
        dp[0] = numbers[0];
        dp[1] = numbers[1];
        int max=Integer.MIN_VALUE;

        for (int i = 1; i < N; i++) {
         dp[i]=Math.max(dp[i-1]+numbers[i],numbers[i]);
            System.out.println(Arrays.toString(dp));
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());


    }
}
