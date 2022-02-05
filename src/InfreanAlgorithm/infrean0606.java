package InfreanAlgorithm;



import java.util.*;


import java.util.Arrays;
import java.util.Scanner;

public  class infrean0606 {
    static Scanner kb = new Scanner(System.in);

    public static void solution(int n) {
        int[] student = new int[n];
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            student[i]=kb.nextInt();
        }
        arr=student.clone();
        Arrays.sort(student);

        for (int i = 0; i < n; i++) {
            if(student[i]!=arr[i]){
                System.out.print(i+1+" ");
            }
        }




//        Arrays.stream(student).forEach(e -> System.out.print(e+" "));



    }


    public static void main(String[] args) {
        int a = kb.nextInt();


        solution(a);


    }

}

