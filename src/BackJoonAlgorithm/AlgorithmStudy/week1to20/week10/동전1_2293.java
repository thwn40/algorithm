package BackJoonAlgorithm.AlgorithmStudy.week1to20.week10;

import java.util.Arrays;
import java.util.Scanner;

public class 동전1_2293 {
    static int[] arr;
    static int m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        dfs(4,new int[4],0,0,0);
    }
    static void dfs(int r, int[] temp,int current, int start,int sum) {
        if(r==current){

            System.out.println(sum);
            int answer = Arrays.stream(temp).sum();
            if(answer==m){
                System.out.print(Arrays.toString(temp)+" ");
            }
        }
        else{
            for (int i = start; i < arr.length; i++) {
                temp[current] = arr[i];
                dfs(r, temp, current+1, start,sum);
            }
        }

    }
}
