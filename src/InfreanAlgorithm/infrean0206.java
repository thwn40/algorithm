package InfreanAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class infrean0206 {

        static Scanner kb = new Scanner(System.in);
        public static void solution(int num) {
            kb.nextLine();

            Integer[] array2 = new Integer[num];
            String[] temp = new String[num];

            StringBuilder st = new StringBuilder(kb.nextLine());
            for(int i =0; i<num; i++){
                temp[i]= (st.toString().split(" ")[i]);
            }


            for(int i = 0; i<num; i++){
                StringBuilder st1 = new StringBuilder(temp[i]);
                array2[i]=Integer.parseInt(st1.reverse().toString());

            }

            int max = array2[0]; // 배열 길이가 1일 경우를 대비해..
            for (int i = 1; i < array2.length; i++) {
                if (array2[i] > max) {
                    max = array2[i];
                }
            }



            Integer[] array = new Integer[max+1];
            for(int i=2; i<=max; i+=1) {
                array[i] = i;
            }

            for(int i = 2; i<=max; i++){
                if(array[i]==0) {
                    continue;
                }
                for (int j = 2*i; j<=max; j+=i) {
                    array[j] = 0;
                }


            }



            for (int i = 0; i < num; i++) {
                if(Arrays.asList(array).contains(array2[i])){
                    System.out.print(array2[i]+" ");
                }
            }






        }


        public static void main(String[] args) {

            int num = kb.nextInt();


            solution(num);

        }
    }