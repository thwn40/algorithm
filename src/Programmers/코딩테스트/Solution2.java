package Programmers.코딩테스트;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution2 {
    public String solution(String p, int n) throws ParseException {
        String answer = "";
        System.out.println(p);
        String pureTimeString = p.substring(3, p.length());

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = formatter.parse(pureTimeString);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        System.out.println(new Date(cal.getTimeInMillis()));
        if(p.charAt(0)=='P'){
            cal.add(Calendar.HOUR, 12);
        }
        cal.add(Calendar.SECOND,n);
        date = new Date(cal.getTimeInMillis());
        answer= String.valueOf(date);
        System.out.println(answer.substring(11,19));
        return answer;
    }

    public static void main(String[] args) throws ParseException {
        Solution2 s2 = new Solution2();

        System.out.println(s2.solution("PM 11:59:59", 1));
        System.out.println();
        System.out.println(s2.solution("AM 01:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("AM 02:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("AM 03:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("AM 04:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("AM 05:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("AM 06:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("AM 07:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("AM 08:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("AM 09:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("AM 10:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("AM 11:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("AM 12:59:59", 600));
        System.out.println("오후 시간대");
        System.out.println(s2.solution("PM 01:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("PM 02:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("PM 03:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("PM 04:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("PM 05:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("PM 06:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("PM 07:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("PM 08:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("PM 09:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("PM 10:59:59", 600));
        System.out.println();
        System.out.println(s2.solution("PM 11:59:59", 600));



    }
}