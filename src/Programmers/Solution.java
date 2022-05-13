package Programmers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

    public class Solution {
        public static String solution(String m, String[] musicinfos) throws ParseException {
        /*
        일단 musicinfo에서 두개 시간을 뺀다.
         */
            int maxPlayTime = -1;
            String answer="(None)";
            ArrayList<String> arr = new ArrayList<>();
            SimpleDateFormat format = new SimpleDateFormat("HH:mm");

            m=newMelody(m);

            long playtime =0;
            for (String musicinfo : musicinfos) {
                String[] split = musicinfo.split(",");
                String title = split[2];
                Date start = format.parse(split[0]);
                Date end = format.parse(split[1]);
                playtime = (end.getTime()- start.getTime())/60000;
                if(playtime<0){
                    playtime=playtime*-1;
                }


                split[3]=newMelody(split[3]);


                String melodyinfo = split[3];

                if(playtime>split[3].length()){
                    melodyinfo = split[3].repeat((int) (playtime/split[3].length()))+split[3].substring(0, (int) (playtime%split[3].length()))+","+split[2];
                }
                else{
                    String substring = split[3].substring(0, (int) playtime);
                    melodyinfo = substring;
                }

                if(melodyinfo.contains(m)&&playtime>maxPlayTime){
                    answer=title;
                    maxPlayTime=(int)playtime;
                }
            }

            return answer;
        }





    public static void main(String[] args) throws ParseException {
        Solution solution = new Solution();
        String m = "C#CB";
        String[] musicinfo = new String[]{"13:50,14:00,FOO,CCC#CB", "04:00,04:08,BAR,ABC"};
        System.out.println(solution(m,musicinfo));
    }

        public static String newMelody(String string){
            string=string.replace(String.valueOf("C#"), "c");
            string=string.replace(String.valueOf("D#"), "d");
            string=string.replace(String.valueOf("F#"), "f");
            string=string.replace(String.valueOf("G#"), "g");
            string=string.replace(String.valueOf("A#"), "a");

            return string;
        }
}
