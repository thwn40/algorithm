package InfreanAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class infrean0807 {

    static int n,m;
    static int[] ans,arr;
    static boolean[] visited;
    static int count=0;
    static int dy[][];
    public void dfs2(int depth,int start){




        if(depth==m){
//            for (int an : ans) {
//                System.out.print(an+ " ");
//            }
//            System.out.println();

            count++;
        }

        else{
            for (int i = start; i <n; i++) {
                    ans[depth]=arr[i];
                    dfs2(depth+1,i+1);

            }
        }


    }
    public static void main(String[] args) {

        infrean0807 t = new infrean0807();
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt()-1;
        m=scan.nextInt()-1;

        ans = new int[m];
        arr= new int[n];

        for (int i = 0; i <n; i++) {
            arr[i]=i;
        }

        t.dfs2(0,0);
        m=m+1;
        ans= new int[m];
        t.dfs2(0,0);
        System.out.println(count);


    }


}