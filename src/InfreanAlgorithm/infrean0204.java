package InfreanAlgorithm;




import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;


public class infrean0204 {
    public static void solution(int num) {
        BigInteger f0 = new BigInteger("1");
        BigInteger f1 = new BigInteger("1");
        BigInteger fn = new BigInteger("0");


        for(int i = 0; i<num; i++){
            f0=f1;
            f1=fn;
            fn=f0.add(f1);
            System.out.print(fn+" ");

        }






    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();


        solution(num);

    }
}
