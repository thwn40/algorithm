package BackJoonAlgorithm;

import java.io.*;
import java.util.*;

//DFS와 BFS
public class Main {

    static int N;
    static ArrayList<ArrayList<Integer>> graph;
    static BufferedWriter bw;
    static boolean[] visitedDfs;
    static boolean[] visitedBfs;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);


        int vertex =  scan.nextInt();
        int edge =  scan.nextInt();
        int start =  scan.nextInt();

        graph = new ArrayList<>();
        visitedDfs = new boolean[vertex + 1];
        visitedBfs = new boolean[vertex + 1];

        for (int i = 0; i <= vertex; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int j = 0; j < edge; j++) { //초기 연결하는 두 정점 값 세팅
            int a =  scan.nextInt();
            int b =  scan.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 0; i <= vertex; i++) {
            Collections.sort(graph.get(i));
        }

        dfs(start);
        System.out.println();
        bfs(start);

    }

    private static void bfs(int V) throws IOException { //Queue를 이용한 BFS

        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        visitedBfs[V] = true;
        System.out.print(V + " ");

        while (!queue.isEmpty()) {
            int value = queue.poll();

            for (int val : graph.get(value)) {
                if (visitedBfs[val] == false) {
                    queue.add(val);
                    System.out.print(val + " ");
                    visitedBfs[val] = true;
                }
            }
        }
    }

    private static void dfs(int V) throws IOException { //재귀를 이용한 DFS

        System.out.print(V + " ");
        visitedDfs[V] = true;

        for (int value : graph.get(V)) {
            if (visitedDfs[value] == false) {
                dfs(value);
            }
        }
    }


}