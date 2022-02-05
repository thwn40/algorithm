package InfreanAlgorithm;
import java.util.*;


import java.util.Arrays;
import java.util.Scanner;

public  class infrean0607 {
    static Scanner kb = new Scanner(System.in);


    public static void solution(int n) {
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = kb.nextInt();
            arr[i][1] = kb.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1]-o2[1];
                }else{
                    return o1[0]-o2[0];
                }
            }
        });
        for (int[] ints : arr) {
            System.out.println(ints[0]+" "+ ints[1]);
        }


//        Arrays.stream(student).forEach(e -> System.out.print(e+" "));


    }


    public static void main(String[] args) {
        int a = kb.nextInt();


        solution(a);


    }

}