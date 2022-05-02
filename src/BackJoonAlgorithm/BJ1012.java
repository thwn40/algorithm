package BackJoonAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
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
    static int x, y;
    static int now_x, now_y;
    static ArrayList<Integer> array = new ArrayList<>();


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int T= scan.nextInt();
        for (int t = 0; t < T; t++) {
            M = scan.nextInt();
            N = scan.nextInt();
            k = scan.nextInt();
            graph = new int[M][N];
            visitedDfs = new boolean[M][N];
            for (int i = 0; i <k; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                graph[a][b]=1;
            }

//            for (int i = 0; i < N; i++) {
//                System.out.println(Arrays.toString(graph[i]));
//
//            }

//        dfs(0,0);
            count = 0;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
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

    static public void dfs(int x, int y) {
        visitedDfs[x][y] = true;
//        System.out.println("i = "+ x +"j =" + y );

        for(int i=0; i<4; i++) {
            now_x = x + dirX[i];
            now_y = y + dirY[i];

            if(Range_check() && visitedDfs[now_x][now_y] == false && graph[now_x][now_y] == 1) {
                dfs(now_x, now_y);
            }

        }
    }

    static boolean Range_check() {
        return (now_y < N && now_y >= 0 && now_x < M && now_x >= 0);
    }

//        //좌
//        if (x > 0 && !visitedDfs[y][x - 1] && graph[y][x - 1] == 1) {
//
//            dfs(y, x - 1);
//        }
//        //우
//        if (x < M - 1 && !visitedDfs[y][x + 1] && graph[y][x + 1] == 1) {
//
//            dfs(y, x + 1);
//        }
//        //하
//        if (y > 0 && !visitedDfs[y - 1][x] && graph[y - 1][x] == 1) {
//
//            dfs(y - 1, x);
//        }
//        //상
//        if (y > N-1 && !visitedDfs[y + 1][x] && graph[y + 1][x] == 1) {
//
//            dfs(y + 1, x);
//
//        }
//    }
    }
    

