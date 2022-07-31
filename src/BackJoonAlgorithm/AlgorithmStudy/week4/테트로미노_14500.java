package BackJoonAlgorithm.AlgorithmStudy.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class 테트로미노_14500  {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] paper = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                paper[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(paper));
    }
}
