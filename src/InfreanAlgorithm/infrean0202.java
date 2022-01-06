package InfreanAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;


public class infrean0202 {
    public static void solution(int[] array) {
        int max = array[0];
        int count = 1;

        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max=max(max,array[i]);
                count++;
            }
        }
        System.out.println(count);




    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] array =new int[num];
        for (int i=0; i<num; i++
        ) {
            array[i]=kb.nextInt();

        }


        solution(array);

    }
}