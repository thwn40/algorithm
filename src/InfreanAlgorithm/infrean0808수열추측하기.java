package InfreanAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class infrean0808수열추측하기 {
    boolean flag = false;
    int[][] dy = new int[35][35];
    static int[] temp;
    static int m;

    public int DFS(int n, int r){
        if(n==r || r==0) return 1;

        if(dy[n][r]>0) return dy[n][r];
        else return dy[n][r]=DFS(n-1,r-1)+DFS(n-1,r);
    }


    public void dfs(int d, int n, boolean[] check,int[] arr,int sum){
        if(flag) return;
        if(d==n){
            if(sum==m){
                for (int i : temp) {
                    System.out.print(i + " ");
                    flag=true;
                }
            }

        }
        else{
            for (int i = 0; i < n; i++) {
                if(!check[i]){
                    check[i]=true;
                    temp[d]=i+1;
                    dfs(d+1,n,check,arr,sum+arr[d]*temp[d]);
                    check[i]=false;
                }

            }

        }

    }


    public static void main(String[] args) {
       infrean0808수열추측하기 m1 = new infrean0808수열추측하기();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        m = kb.nextInt();
        int[] arr= new int[n];
        temp = new int[n];
        boolean[] check = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i]=m1.DFS(n-1,i);
        }
        int sum= 0;
        m1.dfs(0,n,check,arr,sum);
        System.out.println(Arrays.toString(arr));

    }
}
