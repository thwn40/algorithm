package BackJoonAlgorithm.AlgorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
    int x = 0;
    int y = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 미로탐색_2178 {
    static int N;
    static int M;
    static boolean[][] maze = new boolean[N][M];
    static int[][] dis = new int[N][M];
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x,y));
        maze[x][y]=false;
        while(!q.isEmpty()){
            Point poll = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll.x+dx[i];
                int ny = poll.y+dy[i];
                if(nx>=1 && nx<=N && ny>=1 && ny<=M && maze[nx][ny]){
                    maze[nx][ny]=true;
                    q.offer(new Point(nx,ny));
                    dis[nx][ny]=dis[poll.x][poll.y]+1;


                }
            }
        }


    }

    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                if (s.charAt(j) == '1') maze[i][j] = true;
                else maze[i][j] = false;
            }
        }
        bfs(0,0);
        System.out.println(Arrays.deepToString(maze));
    }
}
