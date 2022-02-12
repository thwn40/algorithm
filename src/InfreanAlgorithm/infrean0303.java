package InfreanAlgorithm;
import java.util.*;

import static java.lang.Math.max;


public  class infrean0303 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int num1, int num2, int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] win = new int[num2];
        int sum=0;
        for (int i = 0; i < num2; i++) {
            win[i]=arr[i];

            sum+=win[i];
        }
        int temp = sum;
        for (int i = num2; i < num1; i++) {
            sum+=arr[i]-arr[i-num2];
            temp = max(sum,temp);
        }



        System.out.println(temp);





    }











    public static void main(String[] args) {

        int N = kb.nextInt();
        int K = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=kb.nextInt();
        }


        solution(N,K, arr);

    }
}