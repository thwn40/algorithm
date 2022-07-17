package BackJoonAlgorithm.AlgorithmStudy;

import java.io.*;
import java.util.*;

public class AC_5430 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int n;


        Loop1 :
        for (int i = 0; i < T; i++) {
            Deque<Integer> deque = new LinkedList<>();
            char[] p = br.readLine().toCharArray();
            n = Integer.parseInt(br.readLine());
            StringBuffer arr = new StringBuffer(br.readLine());
            arr.deleteCharAt(0);
            arr.deleteCharAt(arr.length()-1);
            StringTokenizer st = new StringTokenizer(arr.toString(), ",");
            for (int j = 0; j < n; j++) {
                String tmp = st.nextToken();
                if(!tmp.isBlank())deque.offer(Integer.valueOf(tmp));
            }


            int totalR = 0;
            boolean trueStackFalseQueue = false;
        Loop2 :
            for (char c : p) {


                if (c=='R') {
                    totalR++;
                    trueStackFalseQueue = !trueStackFalseQueue;
                }
                if (c=='D'&&!deque.isEmpty()) {
                    if (trueStackFalseQueue) {
                        deque.pollLast();

                    } else {
                        deque.pollFirst();

                    }
                }
                else if(c=='D'&&deque.isEmpty()){
                    bw.write("error");
                    bw.newLine();

                    continue Loop1;
                }


            }

            if(totalR%2==1){
                bw.write("[");
                while(!deque.isEmpty()){
                    bw.write(String.valueOf(deque.pollLast()));
                    if(!deque.isEmpty()) bw.write(",");
                }
                bw.write("]\n");
            }
            else{
                bw.write(deque.toString().replace(" ", ""));
                bw.newLine();
            }



        }
        bw.flush();
        bw.close();

    }

}
