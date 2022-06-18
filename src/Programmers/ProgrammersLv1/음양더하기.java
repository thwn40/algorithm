package Programmers.ProgrammersLv1;

public class 음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer+=signsNumber(signs[i],absolutes[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        음양더하기 s = new 음양더하기();
        s.solution(new int[]{4,7,12}, new boolean[]{true,false,true});

    }

    int signsNumber(boolean signs, int num){
        return signs ? +num : -num;

    }
}
