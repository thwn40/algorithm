package InfreanAlgorithm;
import java.util.Scanner;

public  class infrean0704 {
    static Scanner kb = new Scanner(System.in);

    static int[] fibo;
    public static int solution(int n) {
        if(fibo[n]>0) return fibo[n];
        if(n<=1) {
            return fibo[n]=1;
        }
        else{
            return fibo[n]=solution(n-1)+solution(n-2);
        }





    }
    public static void main(String[] args) {
        int n = kb.nextInt();

        System.out.println("1");
        fibo = new int[n+1];
        solution(n);
        for (int i = 1; i < n; i++) {
            System.out.println(fibo[i]+" ");
        }


    }

}

