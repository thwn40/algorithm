package InfreanAlgorithm;
import java.util.Arrays;

import java.util.Scanner;

import static java.lang.Math.max;


public  class infrean0306 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int n1,int n2) {

        int[] arr1 = new int[n1];
        int count=0,num=0;
        for (int i = 1; i < n1; i++) {
            arr1[i]=kb.nextInt();

        }



        int answer = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < n1; rt++) {


            if (arr1[rt] == 0) {
                count++;
            }
            while(count>n2){
                if(arr1[lt]==0){
                    count--;
                }
                lt++;
            }
            answer=Math.max(answer,rt-lt+1);




        }


        System.out.println(answer);
    }





    public static void main(String[] args) {

        int n1 = kb.nextInt();
        int n2 = kb.nextInt();







        solution(n1,n2);

    }
}



