package InfreanAlgorithm;

import java.util.Scanner;

public class infrean0807 {

    static int n,m;
    static int[] ans,arr;
    static boolean[] visited;
    public void dfs(int depth,int start){

        if(depth==m){
            for (int an : ans) {
                System.out.print(an + " ");
            }

            System.out.println();
        }
        else{
            for (int i = start; i < n; i++) {
                    ans[depth]=arr[i];
                    dfs(depth+1,start+1);

            }
        }


    }
    public static void main(String[] args) {

        infrean0807 t = new infrean0807();
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        m=scan.nextInt();
        ans = new int[m];
        arr= new int[n];
        visited=new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }

        t.dfs(0,0);



    }


}