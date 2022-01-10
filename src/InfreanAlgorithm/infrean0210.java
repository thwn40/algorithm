package InfreanAlgorithm;






import java.util.Arrays;

import java.util.Scanner;

import static java.lang.Math.max;


public  class infrean0210 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int num) {
        int[][] arr = new int[num+2][num+2];
        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=num; j++){
                arr[i][j]= kb.nextInt();
            }
        }

        int count =0;
        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=num; j++){
                if(arr[i][j]>arr[i-1][j]&&arr[i][j]>arr[i+1][j]
                        &&arr[i][j]>arr[i][j-1]&&arr[i][j]>arr[i][j+1]){
                    count++;
                }
            }

        }
        System.out.println(count);


    }


    public static void main(String[] args) {

        int num = kb.nextInt();


        solution(num);

    }
}


