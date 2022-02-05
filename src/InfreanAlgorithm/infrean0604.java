package InfreanAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public  class infrean0604 {
    static Scanner kb = new Scanner(System.in);

    public static void solution(int n,int k) {
        int[] cache = new int[n];
        int[] p = new int[k];
        for (int i = 0; i < k; i++) {
            p[i]=kb.nextInt();
        }
        Arrays.fill(cache, 0);

        for (int i = 0; i < k; i++) {
            int temp1 = 0,temp=p[i], f =0,chkidx=0;
            boolean check = false;
            //일단 있는지 검사
            for (f = 0; f < n; f++) {

                if(p[i]==cache[f]){
                    chkidx=f;
                    check=true;
                }
            }


            if(check) {
                temp1 = cache[chkidx];
                for (int j = chkidx; j > 0; j--) {
                    cache[j]=cache[j-1];
                }
                cache[0]=temp1;
            }
            else{

                for (int j = n - 1; j > 0; j--) {
                    cache[j] = cache[j-1];
                }
                cache[0]=temp;


            }




        }


        Arrays.stream(cache).forEach(e -> System.out.print(e+" "));



    }


    public static void main(String[] args) {
        int a = kb.nextInt();
        int b = kb.nextInt();

        solution(a,b);


    }

}

