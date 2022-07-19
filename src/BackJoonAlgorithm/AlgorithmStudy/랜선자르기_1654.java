package BackJoonAlgorithm.AlgorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 랜선자르기_1654 {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            arr.add(Integer.valueOf(br.readLine()));
        }
        Collections.sort(arr);
        Integer current = arr.get(1);
        int sum = 0 ;

        while(true) {

            System.out.println("current = " + current);

            for (int i = 0; i < K; i++) {
                sum+=arr.get(i) / current;
            }
            if(sum>M){
                current = (current+(current*2))/2;
            }
            if(sum<=M){
                current = current / 2;
            }

            System.out.println("sum = " + sum);
            sum =0;

            Thread.sleep(1000);

        }
    }
}
