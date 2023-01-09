import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;

public class Solution {
    enum asdf {
        A, B, C
    }

    public int[] solution(long[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, 1);
        int idx = -1;
        for (long number : numbers) {
            idx++;
            String binary = Long.toBinaryString(number);
            int index = 1;
            for (char c : binary.toCharArray()) {
                //루트가 0이면 안된다.
                if (index % 3 != 0) {
                    if (c == '0') {

                        answer[idx] = 0;
                        break;
                    }
                }

                index++;
            }


        }

        return answer;
    }

    public static void main(String[] args) {
        EnumMap<asdf, Integer> map = new EnumMap<asdf, Integer>(asdf.class);
        Arrays.stream(asdf.values()).forEach(System.out::println);
        Solution solution = new Solution();
        solution.solution(new long[]{63, 111, 95});

    }
}

