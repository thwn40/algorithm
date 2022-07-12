package BackJoonAlgorithm.AlgorithmStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 파도반수열_9461 {


    static ArrayList<Long> Padoban(Long N){

        ArrayList<Long> Padoban = new ArrayList<>();
        Padoban.add(1L);
        Padoban.add(1L);
        Padoban.add(1L);
        for (int j = 2; j < N-1; j++) {
            Padoban.add(Padoban.get(j-2)+ Padoban.get(j-1));
        }

        return Padoban;

    }

    /**
     * 1 1 1 2 2 3 4 5 7 9
     *
     * @param args
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> answer = new ArrayList<>();
        int T = sc.nextInt();
        Long Temp = 0L;
        for (int i = 0; i < T; i++) {
            Long N = sc.nextLong();
            answer.add(Math.toIntExact(N));
            Temp = Math.max(Temp,N);
        }

       int[] a = new int[10];
        a[1]=4;
        ArrayList<Long> padoban = Padoban(Temp);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < T; i++) {
            System.out.println(padoban.get((answer.get(i)-1)));
        }


        }


    }
//4
//        60
//        11584946
//        70
//        192809420
//        80
//        3208946545
//        90
//        53406819691

