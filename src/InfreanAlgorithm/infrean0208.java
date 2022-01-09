package InfreanAlgorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;





public  class infrean0208 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int num) {
        int answer = 0, count=0;
        Integer[] pr = new Integer[num];
        Integer[] temp = new Integer[num];
        for(int i =0; i<num; i++){
            pr[i]=kb.nextInt();
            temp[i]=pr[i];

        }

        Arrays.sort(pr,Collections.reverseOrder());


        for(int i = 0; i<num; i++){
            System.out.print(Arrays.asList(pr).indexOf(temp[i])+1+" ");

        }

    }

    public static void main(String[] args) {


        int num = kb.nextInt();


        solution(num);

    }
}