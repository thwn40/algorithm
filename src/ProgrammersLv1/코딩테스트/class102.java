package ProgrammersLv1.코딩테스트;

public class class102 {
    public int solution(String S) {
        // write your code in Java SE 8
        String[] split = S.split("\\.|\\?|!");
        int answer = 0;

        for (String s : split) {
            answer =Math.max(0,s.stripLeading().split(" ").length);
        }
        return answer;
    }

    public static void main(String[] args) {
        class102 a = new class102();
        System.out.println(a.solution("We test coders! Give us a try?"));
    }
}
