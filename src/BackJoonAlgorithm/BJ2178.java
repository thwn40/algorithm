package BackJoonAlgorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class BJ2178 {
    static int N;
    static int M;
    static int n,m;
    static int[][] graph;
    static int[][] visited;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        scan.nextLine();
        graph = new int[N][M];
        visited = new int[N][M];
        visited[0][0] = 1;

        for (int i = 0; i < N; i++) {
            String s = scan.nextLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }
        for (int[] ints : graph) {
            System.out.println(Arrays.toString(ints));
        }
        bfs();
    }

    public static void bfs() {
        int count = 0;
        int[] xArr = {-1, 0, 1, 0};
        int[] yArr = {0, 1, 0, -1};
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0, 0));
        visited[0][0] = 1;
        while (!q.isEmpty()) {

            Point poll = q.poll();
            n = poll.x;
            m = poll.y;
                // 상하좌우 4방향 노드에 대한 작업
                for (int i = 0; i < 4; i++) {

                    int x = n + xArr[i];
                    int y = m + yArr[i];
                    if (checkLocation(x, y)) {

                        // 큐에 인접 노드 추가
                        q.add(new Point(x, y));
                        System.out.println("n = "+x+" m = "+y);
                        visited[x][y]=visited[x][y]+1;
                        // 추가한 노드까지의 거리 = 현재 노드까지의 거리 + 1
                    }
                }
            }
            System.out.println(visited[n][m]);



        //좌
//            if (m > 0 && !visited[n][m - 1]&&graph[n][m - 1]==1) {
//                q.add(new Point(n, m-1));
//                System.out.println("n= "+n+" m= "+(m-1));
//                count++;
//                visited[n][m-1]=true;
//            }
//            //우
//            if (m < M - 1 && !visited[n][m + 1]&&graph[n][m + 1]==1) {
//                q.add(new Point(n, m+1));
//                System.out.println("n= "+n+" m= "+(m+1));
//                count++;
//                visited[n][m+1]=true;
//            }
//            //상
//            if (n > 0 && !visited[n - 1][m]&&graph[n-1][m]==1) {
//                q.add(new Point(n-1, m));
//                System.out.println("n= "+(n-1)+" m= "+m);
//                count++;
//                visited[n-1][m]=true;
//            }
//            //하
//            if (n < N - 1 && !visited[n + 1][m]&&graph[n+1][m]==1) {
//                q.add(new Point(n+1, m));
//                System.out.println("n= "+(n+1)+" m= "+m);
//                count++;
//                visited[n+1][m]=true;
//            }

    }
    public static boolean checkLocation(int row, int col){
        // 노드가 범위 밖인 경우
        if(row < 0 || row > N-1 || col < 0 || col > M-1) return false;
        // 이미 방문한 노드인 경우
        if(visited[row][col] != 0 || graph[row][col] == 0) return false;
        return true;
    }
}


