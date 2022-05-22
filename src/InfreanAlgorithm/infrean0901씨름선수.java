package InfreanAlgorithm;

import java.util.*;

public class infrean0901씨름선수 {

    static class Body implements Comparable<Body>{
        int h;
        int w;

        Body(int h, int w){
            this.h = h;
            this.w = w;
        }
        @Override
        public int compareTo(Body o) {
            return o.h-this.h;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        ArrayList<Body> arr= new ArrayList<>();


        for (int i = 0; i < n; i++) {
                arr.add(new Body(kb.nextInt(),kb.nextInt()));

        }
        Collections.sort(arr);
        int count=0;
//        for (int i = 0; i < n; i++) {
//            int tmplength=arr[i][0];
//            int tmpweight=arr[i][1];
//            for (int j = 0; j < n; j++) {
//                    if(tmplength<arr[j][0]&&tmpweight<arr[j][1]){
//                      count--;
//                      break;
//
//                }
//            }
//        }
        int max=0;
        for (Body body : arr) {
            if(body.w>max){
                max=body.w;
                count++;
            }
            
        }

        System.out.println(count);

    }
}
