package InfreanAlgorithm;

import java.util.Scanner;

public class infrean0201 {
    public static void solution(int[] array) {



        System.out.print(array[0]+" ");
        for (int i = 1; i < array.length; i++) {
            if(array[i-1]<array[i]){
                System.out.print(array[i]+" ");
            }
        }




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
