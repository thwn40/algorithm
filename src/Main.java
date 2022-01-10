




import java.util.Arrays;

import java.util.Scanner;

import static java.lang.Math.max;


public  class Main {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int num) {
        int[][] arr = new int[num][num];
        for(int i = 0; i<num; i++){
            for(int j = 0; j<num; j++){
                arr[i][j]= kb.nextInt();
            }
        }

        int[] ans = new int[num];
        for (int i = 0; i < num; i++) {
            int count=0, temp = 0;
            for (int j = 0; j < num; j++) {
                for (int k = 0; k < num; k++) {
                    if(arr[i][j]==arr[j][k]){
                        count++;
                    }

                }
            }
            ans[i]=count;
            count=0;
        }
        System.out.println(Arrays.toString(ans));






    }


    public static void main(String[] args) {

        int num = kb.nextInt();


        solution(num);

        }
    }

