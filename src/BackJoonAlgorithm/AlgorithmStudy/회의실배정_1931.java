package BackJoonAlgorithm.AlgorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Meeting implements Comparable<Meeting> {
    int start = 0;
    int end = 0;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "{" +
                +start +
                "," + end +
                '}';
    }

    @Override
    public int compareTo(Meeting otherMeeting) {
        if (this.end == otherMeeting.end) return this.start - otherMeeting.start;
        else return this.end - otherMeeting.end;
    }

}



public class 회의실배정_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Meeting> meetings = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            meetings.add(new Meeting(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }

        Collections.sort(meetings);

        ArrayList<Meeting> meetingsRoom = new ArrayList<>();

        int end =0;
        for (Meeting meeting : meetings) {
            if(meeting.start>=end){
                meetingsRoom.add(meeting);
                end=meeting.end;
            }


        }

        System.out.println(meetingsRoom.size());
    }
}
