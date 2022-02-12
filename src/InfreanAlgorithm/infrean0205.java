package InfreanAlgorithm;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;

public class infrean0205 {
    public static void solution(int num) {
        int[] array = new int[num+1];
        int count=0;
        for(int i=2; i<=num; i+=1) {
            array[i] = i;
        }

        for(int i = 2; i<=num; i++){
            if(array[i]==0) {
                continue;
            }
            for (int j = 2*i; j<=num; j+=i) {
                array[j] = 0;
            }

            if(array[i]==i){
                count++;
            }
        }


        System.out.println(count);





    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();


        solution(num);

    }
}