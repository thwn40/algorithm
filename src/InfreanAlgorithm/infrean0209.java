package InfreanAlgorithm;

import java.util.Arrays;

import java.util.Scanner;

import static java.lang.Math.max;


public  class infrean0209 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int num) {
        int[][] arr = new int[num][num];
        for(int i = 0; i<num; i++){
            for(int j = 0; j<num; j++){
                arr[i][j]= kb.nextInt();
            }
        }


        //각 행의합
        int rmax = 0, temp = 0;
        for(int i =0; i<num; i++){
            temp= Arrays.stream(arr[i]).sum();
            rmax = max(temp,rmax);
        }
        //각 열의합
        int cmax = 0,sum=0;

        for(int i =0; i<num; i++){
            for(int j = 0; j<num; j++){
                sum+=arr[j][i];
            }
            temp= sum;
            cmax = max(temp,cmax);
            sum=0;

        }

        //두 대각선의합
        int crs1=0,crs2=0,crsmax=0;
        for(int i =0; i<num; i++){
            crs1+=arr[i][i];
            crs2+=arr[num-i-1][i];
        }
        crsmax=max(crs1,crs2);



        System.out.println(max(max(rmax,cmax),max(cmax,crsmax)));



    }


    public static void main(String[] args) {

        int num = kb.nextInt();


        solution(num);

    }
}

