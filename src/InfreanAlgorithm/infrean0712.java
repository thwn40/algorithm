package InfreanAlgorithm;

import java.util.*;




public  class infrean0712 {

    static Scanner kb = new Scanner(System.in);
    static int[] check;
    static ArrayList<ArrayList<Integer>> graph;
    static int n, m, answer=0;
    public void DFS(int v) {
        if(v==n) answer++;
        else{
            for(int i=1; i<=n; i++){
                if(graph.get(v).contains(i) && check[i]==0){
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
        infrean0712 T = new infrean0712();
        check = new int[n+1];
        graph = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <=n; i++) {
            graph.add(new ArrayList<Integer>());

        }
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        check[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }

}

