package InfreanAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;


public class infrean0902회의실배정 {
    static class room implements Comparable<room>{
        int st;
        int end;

        public room(int st, int end) {
            this.st = st;
            this.end = end;
        }


        @Override
        public int compareTo(room o) {
            if(o.st==this.st){return this.st-o.st;
            }else{
                return this.st-o.end;
            }


        }
    }
    public static void main(String[] args) {


        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        ArrayList<room> arr = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            arr.add(new room(kb.nextInt(), kb.nextInt()));
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
        }
    }
}
