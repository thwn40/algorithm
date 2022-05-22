package InfreanAlgorithm;

import java.util.Scanner;

public class 조합의수 {

    int[][] dy = new int[35][35];

    public int DFS(int n, int r){
        if(n==r || r==0) return 1;
        if(dy[n][r]>0) return dy[n][r];
        else return dy[n][r]=DFS(n-1,r-1)+DFS(n-1,r);
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n =scan.nextInt(); //3
        int r=scan.nextInt(); //2


        조합의수 m1=new 조합의수();
        System.out.println( m1.DFS(n,r));

        // 출력
    }
}
