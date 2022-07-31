import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {





    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int max = 1000000;
        int[] arr = new int[max+1];

        Arrays.fill(arr,1);


        //fn
        for (int i = 2; i < arr.length; i++) {
            for (int j = 1; j*i < arr.length; j++) {
                arr[i*j]+=i;
            }
        }

        int[] sum = new int[max+1];

        //gn
        for (int i = 1; i < sum.length; i++) {
            sum[i]=sum[i-1]+arr[i];
        }

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int answer = Integer.parseInt(br.readLine());
            System.out.println(sum[answer]);
        }



        }
    }

















//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        final int MAX = 1_000_000;
//
//        int[] arr = new int[MAX+1];
//        int[] sum = new int[MAX+1];
//        Arrays.fill(arr,1);
//        for (int i = 2; i < arr.length; i++) {
//            for (int j = 1; i*j < arr.length; j++) {
//                arr[i*j]+=i;
//            }
//        }
//
//        for (int i = 1; i <sum.length; i++) {
//            // 1부터 i 번째의 합 = 1부터 i-1번째의 합 +  i랑 똑같지 않을까요?
//            sum[i]= sum[i-1]+arr[i];
//        }
////        System.out.println(Arrays.toString(arr));
//
////        System.out.println(psum);
//
//        int N = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < N; i++) {
//            int answer = Integer.parseInt(br.readLine());
//            System.out.println(sum[answer]);
//        }

