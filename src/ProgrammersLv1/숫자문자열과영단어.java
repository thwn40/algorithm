package ProgrammersLv1;

public class 숫자문자열과영단어 {
    public int solution(String s) {

        s = s.replaceAll("zero","0")
                .replaceAll("one", "1")
                .replaceAll("two", "2")
                .replaceAll("three", "3")
                .replaceAll("four", "4")
                .replaceAll("five", "5")
                .replaceAll("six", "6")
                .replaceAll("seven", "7")
                .replaceAll("eight", "8")
                .replaceAll("nine", "9");

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        숫자문자열과영단어 s = new 숫자문자열과영단어();
        System.out.println(s.solution("one4seveneight"));
        System.out.println(s.solution("23four5six7"));
        System.out.println( s.solution("2three45sixseven"));
        System.out.println( s.solution("three"));
       ;

    }
}
