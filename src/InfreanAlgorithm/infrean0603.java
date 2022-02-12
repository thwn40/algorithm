package InfreanAlgorithm;
import java.util.*;



public  class infrean0603 {
    static Scanner kb = new Scanner(System.in);

    public static void solution(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }

        int j=0;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            for (j = i-1; j >=0&&arr[j]>key; j--) {

                arr[j+1]=arr[j];
            }
            arr[j+1]=key;

        }
        Arrays.stream(arr).forEach(e -> System.out.print(e+" "));



    }


    public static void main(String[] args) {
        int a = kb.nextInt();

        solution(a);


    }

}
