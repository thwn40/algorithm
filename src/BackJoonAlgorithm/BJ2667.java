package BackJoonAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BJ2667 {
 /*
    백준 2667번 단지번호 붙이기
    유형 : dfs
     */

    static int N;
    static int vertex;
    static int[][] graph;
    static boolean[][] visitedDfs;
    static ArrayList<Integer> array = new ArrayList<>();


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        vertex = scan.nextInt();
        scan.nextLine();
        graph = new int[vertex][vertex];

//        for (int i = 0; i < vertex; i++) {
//            graph.add(new ArrayList<>());
//        }

        for (int i = 0; i < vertex; i++) {
            String a = scan.nextLine();
            for (int j = 0; j < vertex; j++) {
                char c = a.charAt(j);
                graph[i][j] = Integer.parseInt(String.valueOf(c));
            }
        }
//
//        for (int[] integers : graph) {
//            System.out.println(Arrays.toString(integers));
//        }

        //배열안에 있을 조건
        //연결이 되어있다 숫자 1이 있다
        //방문 조건

        visitedDfs = new boolean[vertex][vertex];

        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                if (graph[i][j] == 1 && !visitedDfs[i][j]) {
                    N = 1;
                    dfs(i, j);
                    array.add(N);
                }
            }
        }
        System.out.println(array.size());
        Collections.sort(array);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));

        }

        System.out.println("----------------");
        for (int i = 0; i < vertex; i++) {
            Arrays.fill(visitedDfs[i],false);
        }

        dfs(0,1);
    }


    static public void dfs(int x, int y) {
        visitedDfs[x][y] = true;
        System.out.println("x = "+ x +"y =" + y );

        //좌
        if (y > 0 && !visitedDfs[x][y - 1] && graph[x][y - 1] == 1) {
            N++;
            dfs(x, y - 1);
        }
        //우
        if (y < vertex - 1 && !visitedDfs[x][y + 1] && graph[x][y + 1] == 1) {
            N++;
            dfs(x, y + 1);
        }
        if (x > 0 && !visitedDfs[x - 1][y] && graph[x - 1][y] == 1) {
            N++;
            dfs(x - 1, y);
        }
        if (x < vertex - 1 && !visitedDfs[x + 1][y] && graph[x + 1][y] == 1) {
            N++;
            dfs(x + 1, y);

        }
    }
}