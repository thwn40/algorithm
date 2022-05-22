package InfreanAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토 {


    static class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static int[][] tomato;
    static int[] dx = new int[]{-1,0,1,0};
    static int[] dy = new int[]{0,-1,0,1};
    static int[][] visited;
    static int n,m,answer=0;
    static ArrayList<Point> goodtomato = new ArrayList<>();
    static Queue<Point> q = new LinkedList<>();
    public void bfs(int x, int y, int[][] tomato){


        for (Point pt : goodtomato) {
            q.offer(pt);
        }

        while(!q.isEmpty()){
            for (int i = 0; i < q.size(); i++) {
                Point p = q.poll();
//                System.out.print(p.x +","+p.y);
//                System.out.println();

                for (int j = 0; j < 4; j++) {
                    int nx = p.x+dx[j];
                    int ny = p.y+dy[j];
                        if((nx >= 0) && (nx <= n-1) && (ny >= 0) && (ny <= m-1) && (tomato[nx][ny]==0)){
                            tomato[nx][ny]=1;
                            q.offer(new Point(nx,ny));
                            visited[nx][ny]=visited[p.x][p.y]+1;


                            }
                    }

                }
            }
        }




    public static void main(String[] args) {
        토마토 t = new 토마토();
        Scanner kb = new Scanner(System.in);
        m = kb.nextInt();
        n = kb.nextInt();

        tomato = new int[n][m];
        visited = new int[n][m];
        boolean run = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tomato[i][j]=kb.nextInt();
                if(tomato[i][j]==1){
                    goodtomato.add(new Point(i,j));
                }
                else {
                    run=true;
                }
            }
        }


//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(tomato[i][j]);
//            }
//            System.out.println();
//        }
        if(run){
            t.bfs(0,0,tomato);
        }
        else{
            answer=-1;
        }
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer=Math.max(answer,visited[i][j]);
                if(tomato[i][j]==0){
                   temp=-1;
                }
            }
        }

        if(temp==-1){
            answer=-1;
        }
        System.out.println(answer);
    }

}
