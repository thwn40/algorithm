package InfreanAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class infrean0811미로최단거리통로 {

    static class Point{
        int x,y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

    }
    static int answer = 0;
    static int[][] arr = new int[7][7];
    static int[] dx = new int[]{-1,0,1,0};
    static int[] dy = new int[]{0,-1,0,1};
    static boolean[][] visited = new boolean[7][7];
    static int[][] dis = new int[7][7];
    public void dfs(int x, int y, int[][] arr){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0,0));
        int L=0;
        while(!q.isEmpty()) {

            L++;
            for (int j = 0; j < q.size(); j++) {
                Point p = q.poll();
                System.out.println("x값"+(p.x+1)+"y값"+(p.y+1));
                if(p.x == 6 && p.y == 6) {
                    answer = L;
                    return;
                }
                for (int i = 0; i < 4; i++) {
                    int nx = p.x + dx[i];
                    int ny = p.y + dy[i];
                    if ((nx >= 0) && (nx <= 6) && (ny >= 0) && (ny <= 6) && (arr[nx][ny] == 0)) {
                        if (!visited[nx][ny]) {
                            visited[nx][ny] = true;
                            q.offer(new Point(nx, ny));
                            dis[nx][ny]=dis[p.x][p.y]+1;

                        }

                    }
            }



        }

        }
    }



    public static void main(String[] args) {
        infrean0811미로최단거리통로 t= new infrean0811미로최단거리통로();
        Scanner kb = new Scanner(System.in);
        for (int[] ints : arr) {
            int i =0;
            for (int anInt : ints) {
                ints[i]=kb.nextInt();
                i++;
            }
        }
        visited[0][0]=true;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        t.dfs(0,0,arr);

        System.out.println(answer);


        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(dis[i][j]);
            }
            System.out.println();
        }
    }
}

