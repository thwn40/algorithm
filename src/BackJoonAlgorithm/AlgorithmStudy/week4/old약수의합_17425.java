package BackJoonAlgorithm.AlgorithmStudy.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class old약수의합_17425 {

    public static void main(String[] args) throws IOException {

        long beforeTime = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] Ts = new int[T];
        for (int i = 0; i < T; i++) {
            Ts[i] = Integer.parseInt(br.readLine());
        }

        int tMax = Arrays.stream(Ts).max().orElse(-1);
        boolean[] primeNumber = new boolean[tMax + 1];
        Arrays.fill(primeNumber, true);
        primeNumber[0] = false;
        primeNumber[1] = false;
        for (int i = 2; i <= tMax; i++) {
            if (!primeNumber[i]) continue;

            for (int j = 2 * i; j <= tMax; j += i) {
                primeNumber[j] = false;
            }


        }
        int[] yakSuSum = new int[tMax+1];
        long[] psum = new long[tMax+1];
        for (int i = 0; i < T; i++) {
            System.out.println(psum[Ts[i]]);
            if(psum[Ts[i]]!=0){
                continue;
            }
            for (int k = 1; k <= Ts[i]; k++) {
                if(yakSuSum[k]!=0){
                    continue;
                }
                else{
                    int sqrt = (int) Math.sqrt(k);
                    for (int j = 1; j <= sqrt; j++) {
                        if(primeNumber[k]){
                            yakSuSum[k]=k+1;
                            break;
                        }
                        if(k%j==0){
                            yakSuSum[k]+=j;
                            if(k/j!=j){
                                yakSuSum[k]+=k/j;
                            }
                        }
                    }
                }
                psum[k]= psum[k-1]+yakSuSum[k];
            }
//            System.out.println(Arrays.toString(yakSuSum));

//
//
//            System.out.println();
//            System.out.println(psum[Ts[i]]);
//            System.out.println(yakSu.stream().reduce(0, Integer::sum));
//            System.out.println(yakSuSum[]);
        }

        for (int t : Ts) {
            System.out.println(psum[t]);
        }
//        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
//        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
//        System.out.println("시간차이(m) : "+secDiffTime);
    }
}

