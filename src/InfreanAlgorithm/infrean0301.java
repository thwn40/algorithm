package InfreanAlgorithm;


import java.util.Arrays;

import java.util.Scanner;

import static java.lang.Math.max;


public  class infrean0301 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int[] n1, int[] n2) {
        int[] arr3 = new int[n1.length+n2.length];

        for (int i = 0; i < n1.length; i++) {

            arr3[i] = n1[i];
        }
        for (int i = 0; i < n2.length; i++) {
            arr3[i+ n1.length]=n2[i];

        }




        Arrays.sort(arr3);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }


    }


    public static void main(String[] args) {

        int n1 = kb.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=kb.nextInt();
        }

        int n2 = kb.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=kb.nextInt();
        }



        solution(arr1, arr2);

    }
}

