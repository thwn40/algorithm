package ProgrammersLv1;

import java.util.Arrays;

public class 없는숫자더하기 {
    static public int solution(int[] numbers) {

        int sum = Arrays.stream(numbers).sum();
        return 45-sum;
    }
    public static void main(String[] args) {
        없는숫자더하기.solution(new int[]{1,2,3,4,6,7,8,0});

    }
}
