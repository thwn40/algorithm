package InfreanAlgorithm;

import java.util.*;



public  class infrean0601 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }

        int temp =0;
        int min=0;

        for (int i = 0; i < n; i++) {
            int minj = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minj] > arr[j]) {
                    minj = j;
                }

            }
            temp = arr[i];
            arr[i] = arr[minj];
            arr[minj] = temp;
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }

    }




    public static void main(String[] args) {
        int a = kb.nextInt();


        solution(a);





    }

}