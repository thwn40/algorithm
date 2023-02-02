package BackJoonAlgorithm.AlgorithmStudy.week1to20.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class 리모컨_1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        //채널 받기
        String s = br.readLine();
        int intn = Integer.parseInt(s);
        int[] N = Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();
        int M = Integer.parseInt(br.readLine());
        //고장난 버튼이 없을때
        if(M==0){
            System.out.println(s.length());
        }
        //잘되는 버튼들
        int[] buttons = IntStream.range(0, 10).toArray();

        //버튼들 고장내기
        int[] crashButtons = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int crashButton : crashButtons) {
            buttons[crashButton]=-1111;
        }

        //자리수 마다 최소값으로 갈수있는 버튼들 찾기
//        System.out.println(Arrays.toString(buttons));
        StringBuffer bf = new StringBuffer();
        int index = 0;
        for (int n: N) {
            if(index!=0&&n==0&&Integer.parseInt(String.valueOf(bf.charAt(0)))<N[0]){
                n=10;
                index++;
            }
//            if(n==0){
//                n=10;
//            }

            int[] mins = new int[10];
            int min = 1000;
            int minindex=n;
            for (int i = 0; i < buttons.length; i++) {
                mins[i]=Math.abs(n-buttons[i]);
                if(min>Math.abs(n-buttons[i])){
                    min = Math.abs(n-buttons[i]);
                    minindex=i;

                }

            }
            index++;
            bf.append(minindex);
//            System.out.println("mins"+Arrays.toString(mins));
//            System.out.println("minindex = " + minindex);

        }
        if(Math.abs(intn-100)<Math.abs(intn-Integer.parseInt(String.valueOf(bf)))){
            System.out.println(intn-100);
        }else if(Math.ceil(intn/Math.pow(10,s.length()))*Math.pow(10,s.length())<Math.abs(intn-Integer.parseInt(String.valueOf(bf)))){

        }

         else{
            System.out.println(bf);
            System.out.println(s.length()+Math.abs(intn-Integer.parseInt(String.valueOf(bf))));
        }

//        System.out.println(Arrays.toString(buttons));
/**
 *  2 3 4  6 7 8 9
 *  99
 */
    }
}
