package BackJoonAlgorithm.AlgorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RGB거리_1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] house = new int[N][3];

        int[][] dp = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            house[i][0]= Integer.parseInt(st.nextToken());
            house[i][1]= Integer.parseInt(st.nextToken());
            house[i][2]= Integer.parseInt(st.nextToken());
        }
        boolean[] rgb = new boolean[3];
        int min = Math.min(Math.min(house[0][0], house[0][1]), house[0][2]);

        for (int i = 0; i < 3; i++) {
            if(house[0][i]==min){
                rgb[i]=true;
            }
        }
//        for (int i = 1; i < N; i++) {
//
//            System.out.println(Arrays.toString(rgb));
//            int a = house[i][0];
//            int b = house[i][1];
//            int c = house[i][2];
//            int temp = 0;
//
//
//            if(rgb[0]){
//                rgb = new boolean[3];
//                System.out.println("rgb0");
//                if(b>c){
//                    temp=c;
//                    rgb[2]=true;
//                }
//                else{
//                    temp=b;
//                    rgb[1]=true;
//                }
//            }
//
//            else if(rgb[1]){
//                rgb = new boolean[3];
//                System.out.println("rgb1");
//                if(a>c){
//                    temp=c;
//                    rgb[2]=true;
//
//                }
//                else{
//                    temp=a;
//                    rgb[0]=true;
//
//                }
//            }
//            else if(rgb[2]){
//                rgb = new boolean[3];
//                System.out.println("rgb2");
//                if(a>c){
//                    temp=b;
//                    rgb[1]=true;
//
//                }
//                else{
//                    temp=a;
//                    rgb[0]=true;
//
//                }
//
//            }
//
//            dp[i]=temp;
//
        for (int i = 1; i < N; i++) {
            house[i][0] += Math.min(house[i-1][1],house[i-1][2]);
            house[i][1] += Math.min(house[i-1][0],house[i-1][2]);
            house[i][2] += Math.min(house[i-1][0],house[i-1][1]);


        }
        System.out.println(Math.min(Math.min(house[N-1][0],house[N-1][1]),house[N-1][2]));
//        System.out.println(Arrays.deepToString(house));
        }




    }

