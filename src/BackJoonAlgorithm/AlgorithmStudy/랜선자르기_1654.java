package BackJoonAlgorithm.AlgorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 랜선자르기_1654 {

    public static void main(String[] args) throws IOException, InterruptedException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int K = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < K; i++) {
//            arr.add(Integer.valueOf(br.readLine()));
//        }
//        int temp = 201;
//        double sum1 = 0;
//        for (int i = 0; i < K; i++) {
//            double i1 = (arr.get(i) / temp );
//
//            sum1+=i1;
//            System.out.println(i1);
//        };
//        System.out.println(sum1);
//    }



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long K = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        ArrayList<Long> arr = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            arr.add(Long.parseLong(br.readLine()));
        }
        Collections.sort(arr);
        Long current = arr.get(arr.size()-1);
        long sum = 0;
        long rangeStart = 1;
        long rangeEnd = current;

        while (true) {

            sum = 0;
            for (int i = 0; i < K; i++) {

                sum += arr.get(i) / current;
            }
            if (sum >= M) {
                rangeStart = current;
            }
            if (sum < M) {
                rangeEnd = current;
            }
            current = (rangeStart + rangeEnd) / 2;

            if(  rangeStart==current||rangeEnd==current) break;
//
//            System.out.println("rangeStart = " + rangeStart);
//            System.out.println("current = " + current);
//            System.out.println("rangeEnd = " + rangeEnd);
//
//            System.out.println("sum = " + sum);


        }

        System.out.println(current);
    }
}
