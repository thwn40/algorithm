package BackJoonAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class BJ1012 {
    /*
    백준 2667번 단지번호 붙이기
    유형 : dfs
     */

    static int count;
    static int M, N, k;
    static int[][] graph;
    static boolean[][] visitedDfs;
    static int dirX[] = {0, 0, -1, 1};
    static int dirY[] = {-1, 1, 0, 0};
    static int xx, yy;
    static ArrayList<Integer> array = new ArrayList<>();


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int T= scan.nextInt();
        for (int t = 0; t < T; t++) {
            M = scan.nextInt();
            N = scan.nextInt();
            k = scan.nextInt();
            graph = new int[N][M];
            visitedDfs = new boolean[N][M];
            for (int i = 0; i <k; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                graph[b][a]=1;
            }

//            for (int i = 0; i < N; i++) {
//                System.out.println(Arrays.toString(graph[i]));
//
//            }

//        dfs(0,0);
            count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(graph[i][j]==1&&!visitedDfs[i][j]){
                        count++;

                        dfs(i,j);

                    }
                }


            }
            System.out.print(count);
            System.out.println();


        }

    }

    static public void dfs(int y, int x) {
        visitedDfs[y][x] = true;
//        System.out.println("i = "+ x +"j =" + y );
//
//        for(int i=0; i<4; i++) {
//            now_x = x + dirX[i];
//            now_y = y + dirY[i];
//
//            if(Range_check() && visitedDfs[now_y][now_x] == false && graph[now_y][now_x] == 1) {
//                dfs(now_y, now_x);
//            }
//
//        }
//    }
//
//    static boolean Range_check() {
//        return (now_y < N && now_y >= 0 && now_x < M && now_x >= 0);
//    }
        xx = x;
        yy = y;

        //좌
        if (xx > 0 && !visitedDfs[yy][xx - 1] && graph[yy][xx - 1] == 1) {

            dfs(yy, xx - 1);
        }
        //우
        if (xx < M - 1 && !visitedDfs[yy][xx + 1] && graph[yy][xx + 1] == 1) {

            dfs(yy, xx + 1);
        }
        //하
        if (yy > 0 && !visitedDfs[yy - 1][xx] && graph[yy - 1][xx] == 1) {

            dfs(yy - 1, xx);
        }
        //상
        if (yy < N-1 && !visitedDfs[yy + 1][xx] && graph[yy + 1][xx] == 1) {

            dfs(yy + 1, xx);

        }
    }
    }
    

