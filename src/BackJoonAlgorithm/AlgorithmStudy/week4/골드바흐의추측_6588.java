package BackJoonAlgorithm.AlgorithmStudy.week4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class 골드바흐의추측_6588 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuffer sb = new StringBuffer();
        boolean[] prime = new boolean[1000001];

        ArrayList<Integer> primeNumber = new ArrayList<>();

        prime[0]=true;
        prime[1]=true;


        for (int i = 2; i < Math.sqrt(1000001); i++) {
            if(!prime[i]){
                for (int j = i*i; j <1000001; j+=i) {
                    prime[j]=true;
                }
            }

        }

//        int index=0;
//        for (int i = 0; i < 1000001; i++) {
//            if(!prime[i]){
//                primeNumber[index]=i;
//                index++;
//            }
//        }

        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N==0){
                break;
            }

            int start = 0;
            int end = primeNumber.size()-1;
            boolean check = false;
            for (int i = 2; i <= N ; i++) {
                if(!prime[i]&&!prime[N-i]){
                    System.out.println(N + " = " + i + " + " + (N-i));
                    check = true;
                    break;
                }

                }
            if(!check){
                System.out.println("Goldbach's conjecture is wrong.");

            }
//            while(start <= end){
////                System.out.println("primeNumberstart = " + primeNumber[start]);
////                System.out.println("primeNumberend = " + primeNumber[end]);
//                if(primeNumber.get(start)+ primeNumber.get(end)==N){
//                    sb.append(N+" = "+ primeNumber.get(start)+" + "+ primeNumber.get(end)+"\n");
//                    check = true;
//                    break;
//                }
//                else if(primeNumber.get(start)+ primeNumber.get(end)>N){
//                    end--;
//                }
//                else {
//                    start++;
//                }
//            }

        }


        }

//        System.out.println(Arrays.toString(primeNumber));
//        System.out.println("index = " + index);




    }


