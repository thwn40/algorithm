package InfreanAlgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 미로탐색 {
    static int answer = 0;
    static int[][] arr = new int[7][7];
    static int[] dx = new int[]{-1,0,1,0};
    static int[] dy = new int[]{0,-1,0,1};
    static boolean[][] visited = new boolean[7][7];
    public void dfs(int x, int y, int[][] arr){
        //상하좌우 4번 돌려준다
        if(x==6&&y==6){
            answer++;
        }

                for (int i = 0; i < 4; i++) {
                    int nx = x+dx[i];
                    int ny = y+dy[i];
                   if((nx >= 0) && (nx <= 6) && (ny >= 0) && (ny <= 6) && (arr[nx][ny]==0)){
                       if(!visited[nx][ny]){
                           visited[nx][ny]=true;
                           dfs(nx,ny,arr);
                           visited[nx][ny]=false;
                       }

                   }

        }
    }



    public static void main(String[] args) {
        미로탐색 t= new 미로탐색();
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

    }
}
