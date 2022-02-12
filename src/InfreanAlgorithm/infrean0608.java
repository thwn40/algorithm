package InfreanAlgorithm;
import java.util.*;


import java.util.*;


import java.util.Arrays;
import java.util.Scanner;

public  class infrean0608 {
    static Scanner kb = new Scanner(System.in);


    public static void solution(int n, int k) {
        int[] arr = new int[n];
        int key = k, st = 0, en = n-1;
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }
        Arrays.sort(arr);
        while(st<=en){
            int mid = (st+en)/2;
            if(key==arr[mid]){
                System.out.println(mid+1);
                break;
            }
            else if(arr[mid]<key){
                st=mid+1;
            }
            else if(key < arr[mid]){
                en = mid-1;
            }

        }




//        Arrays.stream(student).forEach(e -> System.out.print(e+" "));


    }


    public static void main(String[] args) {
        int a = kb.nextInt();
        int b = kb.nextInt();


        solution(a,b);


    }

}