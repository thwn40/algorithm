


import InfreanAlgorithm.infrean0803;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import java.util.*;

class Main {

    public String solution(String m, String[] musicinfos) throws ParseException {
        String answer = "none";

        for (String musicinfo : musicinfos) {
            String[] split = musicinfo.split(",");
            SimpleDateFormat f = new SimpleDateFormat("HH:mm",Locale.KOREA);
            Date start = f.parse(split[0]);

            Date end = f.parse(split[1]);

            long min =((end.getTime()- start.getTime())/60000);

            int playtime = split[3].length();


            if(min>playtime){
                musicinfo=split[3].repeat((int) (min/playtime));
            }
            else if(min<playtime){
                musicinfo=split[3];
            }

            if(musicinfo.contains(m)){
                answer=split[2];
            }
        }


        return answer;
    }






    public static void main(String[] args) throws ParseException {
        Main main = new Main();
        String[] musicinfo = new String[]{"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
        System.out.println(main.solution("CC#BCC#BCC#BCC#B",musicinfo));




        }
    }
