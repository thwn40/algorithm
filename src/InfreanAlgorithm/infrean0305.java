package InfreanAlgorithm;







import java.util.*;




public  class infrean0305 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int n) {

        int[] arr1 = new int[n];
        for (int i = 1; i < n; i++) {
            arr1[i]=i;
        }
        int answer = 0, sum = 0, lt = 0;
        for (int rt = 1; rt < n; rt++) {
            sum += arr1[rt];

            if (sum == n&&lt!=rt) {
                System.out.print(" rt = " + rt);
                System.out.print(" lt = " + lt);
                answer++;
            }

            while (sum >= n) {
                sum -= arr1[lt++];
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








        solution(n1);

    }
}

