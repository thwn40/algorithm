package BackJoonAlgorithm.AlgorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;



public class ATM_11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
           arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int[] sum = new int[N];
        sum[0]=arr[0];
        int answer =arr[0];
        for (int i = 1; i < N; i++) {
            sum[i]+=sum[i-1]+arr[i];
            answer+=sum[i];
        }
        System.out.println(answer);
    }
}
