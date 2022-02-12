package InfreanAlgorithm;

import java.util.*;



public  class infrean0602 {
    static Scanner kb = new Scanner(System.in);

    public static void solution(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <n; j++) {
                if(arr[j]<arr[j-1]){

                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        Arrays.stream(arr).forEach(e -> System.out.print(e+" "));



    }


    public static void main(String[] args) {
        int a = kb.nextInt();

        solution(a);


    }

}