package InfreanAlgorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class infrean0804 {

static int n,m,answer=Integer.MAX_VALUE;


    static int[] temp;

    static int max= Integer.MAX_VALUE;
    public void dfs(int depth,int sum,int[] arr){
        if(sum>m) return;
        if(depth>=answer) return;
        if(sum==m){
            for (int i : temp) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println( answer=Math.min(answer,depth));


        }
        else{
            for (int i = 0; i < n; i++) {
                temp[depth]=arr[i];
                dfs(depth+1,sum+arr[i],arr);
            }
        }
    }

    public void solution(){
        for (int i = 0; i < m; i++) {

        }

    }


    public static void main(String[] args){

        infrean0804 T = new infrean0804();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int []arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[n-i-1]=scan.nextInt();
        }
        m = scan.nextInt();
        temp = new int[m];

        T.dfs(0,0,arr);
//        for (int i =0; i < 16; i++) {
//            m=i;
//            T.dfs(0);
//            System.out.println(i+"번째 반복 끝");
//        }

    }

}
