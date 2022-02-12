package InfreanAlgorithm;



import java.util.Arrays;
import java.util.Scanner;

public  class infrean0609 {
    static Scanner kb = new Scanner(System.in);
    public static int count(int[] arr, int capacity){
        int cnt =1, sum =0;
        for(int x : arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            }
            else sum+=x;
        }

        return cnt;
    }


    public static void solution(int n, int k) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while(lt<=rt){
            int mid =(lt+rt)/2; //dvd 하나의 용량
            if(count(arr,mid)<=k){
                answer = mid;
                rt = mid-1;
            }
            else lt = mid +1;
        }
        System.out.println(answer);
        //        Arrays.stream(student).forEach(e -> System.out.print(e+" "));


    }


    public static void main(String[] args) {
        int a = kb.nextInt();
        int b = kb.nextInt();


        solution(a,b);


    }

}

