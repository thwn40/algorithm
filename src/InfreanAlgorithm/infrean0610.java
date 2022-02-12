package InfreanAlgorithm;


import java.util.Arrays;
import java.util.Scanner;

public  class infrean0610 {
    static Scanner kb = new Scanner(System.in);
    public static int count(int[] arr, int dist){
        int cnt =1, ep=arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i]-ep>=dist){
                cnt++;
                ep=arr[i];
            }
        }

        return cnt;
    }



    public static void solution(int n, int k) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr);
        int st = 1, en = arr[n-1];
        int answer =0;

        while(st<=en){
            int mid = (st+en)/2;
            if(count(arr,mid)>=k) {
                answer = mid;
                st=mid+1;
            }

            else{

            }
            en = mid-1;

        }



//        Arrays.stream(student).forEach(e -> System.out.print(e+" "));


    }


    public static void main(String[] args) {
        int a = kb.nextInt();
        int b = kb.nextInt();


        solution(a,b);


    }

}
