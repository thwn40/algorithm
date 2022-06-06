package ProgrammersLv1;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            answer[i]=Arrays.stream(array).skip(commands[i][0] - 1).limit(commands[i][1] - commands[i][0] + 1).sorted().toArray()[commands[i][2]-1];
        }


        return answer;
    }

    public static void main(String[] args) {
        K번째수 s = new K번째수();
        System.out.println(Arrays.toString(s.solution(new int[]{1,5,2,6,3,7,4},new int[][]{{2,5,3},{4,4,1},{1,7,3}})));
        ;
    }
}

