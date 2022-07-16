package BackJoonAlgorithm.AlgorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class document implements Comparable<document>{
    int documentName = 0;
    int priority = 0;


    public document(int documentName, int priority) {
        this.documentName = documentName;
        this.priority = priority;


    }

    @Override
    public int compareTo(document dc) {
        if(this.priority < dc.priority){
            return -1;
        }
        else if(this.priority == dc.priority){
            return 0;
        }
        else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return "{" +
                "dc=" + documentName +
                ",pr=" + priority +
                '}';
    }
}


public class 프린터큐_1966 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int M;
        int idx;
        PriorityQueue<document> printer = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        Queue<document> q = new LinkedList<>();
        int[] answers = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            idx = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int temp = Integer.parseInt(st.nextToken());
                q.offer(new document(j,temp));
                printer.offer(new document(j,temp));
            }

            int answer = 0;
            while(!q.isEmpty()){
                document peek = printer.peek();
                document poll = q.poll();
                if(peek.priority!=poll.priority){
                    q.offer(poll);
                }
                else{
                    answer++;
                    printer.poll();
                }
                if(poll.documentName==idx){
                    answers[i]=answer;
                }



            }


        }


        for (int i = 0; i < N; i++) {
            System.out.println(answers[i]);

        }

}
}
