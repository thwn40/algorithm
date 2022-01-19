





import java.util.*;




public  class Main {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int a, int b) {
int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i]=kb.nextInt();
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            ans.add(arr[i]);
        }
        Set<Integer> temp = new HashSet<>(ans);
        System.out.print(Set.copyOf(ans).size()+" ");

        int lt = b;

        for (int rt = 0; rt < a-b; rt++) {
            ans.remove(0);
            ans.add(arr[lt++]);


            System.out.print(Set.copyOf(ans).size()+" ");

            
        }

    }





    public static void main(String[] args) {

        int a = kb.nextInt();
        int b = kb.nextInt();





        solution(a,b);

    }
}



