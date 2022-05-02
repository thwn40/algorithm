package BackJoonAlgorithm;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BJ2606 {
    /*
    백준 2606번 dfs
     */

    static int N;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visitedDfs;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vertex = scan.nextInt();
        int edge = scan.nextInt();

        graph = new ArrayList<>();

        for (int i = 0; i <= vertex; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 0; i <= vertex; i++) {
            Collections.sort(graph.get(i));
        }

        visitedDfs = new boolean[vertex+1];
        N=0;
        dfs(1);
        System.out.println(N-1);

        }


    static public void dfs(int start){
        visitedDfs[start]=true;
        N++;
        for (Integer integers : graph.get(start)) {
            if(visitedDfs[integers]==false){
                dfs(integers);
            }
        }
    }

    }


