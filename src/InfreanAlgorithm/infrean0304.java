package InfreanAlgorithm;



import java.util.*;




public  class infrean0304 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int n, int m, int[] a) {

        int answer = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += a[rt];

            if (sum == m) {
                answer++;
            }

            while (sum >= m) {
                sum -= a[lt++];
                if (sum == m) {
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
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=kb.nextInt();
        }





        solution(n1,n2,arr1);

    }
}
