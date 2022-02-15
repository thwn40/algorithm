package InfreanAlgorithm;



import java.util.*;




public  class infrean0711 {

    static Scanner kb = new Scanner(System.in);
    static int[] check;
    static int[][] graph;
    static int n, m, answer=0;
    public void DFS(int v) {
        if(v==n) answer++;
        else{
            for(int i=1; i<=n; i++){
                if(graph[v][i]==1 && check[i]==0){
                    check[i]=1;
                    DFS(i);
                    check[i]=0;
                }
            }
        }




    }




    public static void main(String[] args) {
        n =kb.nextInt();
        m =kb.nextInt();
        infrean0711 T = new infrean0711();
        check = new int[n+1];
        graph = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b]=1;
        }
        check[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }

}


