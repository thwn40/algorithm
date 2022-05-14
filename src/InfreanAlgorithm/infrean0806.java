package InfreanAlgorithm;

import java.util.Scanner;

public class infrean0806 {

    static int n,m;
    static int[] ans,arr;
    static boolean[] visited;
    public void dfs(int depth){

        if(depth==3){
            for (int an : ans) {
                System.out.print(an + " ");
            }

            System.out.println();
        }
        else{
            for (int i = 0; i < n; i++) {
                if(!visited[i]){
                    visited[i]=true;
                    ans[depth]=arr[i];
                    dfs(depth+1);
                    visited[i]=false;
                }

            }
        }


    }
    public static void main(String[] args) {

        infrean0806 t = new infrean0806();
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        m=scan.nextInt();
        ans = new int[m];
        arr= new int[n];
        visited=new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }

        t.dfs(0);



        }


    }

