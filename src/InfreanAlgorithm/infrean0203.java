package InfreanAlgorithm;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;


public class infrean0203 {
    public static void solution(int[] array1 ,int[] array2) {


        for (int i = 0; i < array1.length; i++) {
            switch (array1[i]){
                case 1:
                    if(array2[i]==1){
                        System.out.println("D");
                        break;
                    }
                    else if(array2[i]==2){
                        System.out.println("B");
                        break;
                    }
                    else{
                        System.out.println("A");
                        break;
                    }
                case 2:
                    if(array2[i]==1){
                        System.out.println("A");
                        break;
                    }
                    else if(array2[i]==2){
                        System.out.println("D");
                        break;
                    }
                    else{
                        System.out.println("B");
                        break;
                    }
                case 3:
                    if(array2[i]==1){
                        System.out.println("B");
                        break;
                    }
                    else if(array2[i]==2){
                        System.out.println("A");
                        break;
                    }
                    else{
                        System.out.println("D");
                        break;
                    }

            }
        }




    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] player1 =new int[num];
        int[] player2 =new int[num];
        for (int i=0; i<num; i++
        ) {
            player1[i]=kb.nextInt();

        }
        for (int i=0; i<num; i++
        ) {
            player2[i]=kb.nextInt();

        }


        solution(player1,player2);

    }
}

