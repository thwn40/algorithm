





import java.util.*;




public  class Main {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int n,int n2, int[] a) {


        int answer = 0, sum = 0, lt = 0;
        for (int rt = 1; rt < n; rt++) {


            if (sum == n) {
                System.out.print(" rt = " + rt);
                System.out.print(" lt = " + lt);
                answer++;
            }

            while (sum >= n) {
                sum -= a[lt++];
                if (sum == n&&lt!=rt) {
                    System.out.print(" rt = " + rt);
                    System.out.print(" lt = " + lt);
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }





    public static void main(String[] args) {

        int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i]=kb.nextInt();
        }







        solution(n1,n2,arr1);

        }
    }

