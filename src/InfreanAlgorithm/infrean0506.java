package InfreanAlgorithm;

import java.util.*;




public  class infrean0506 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int n, int k) {
        Stack<Character> bar = new Stack<>();
        Queue<Integer> p = new LinkedList<>();
        for (int i = 1; i < n+1; i++) {
            p.add(i);
        }
        while(!p.isEmpty()){
            for (int i = 0; i < k-1; i++) {
                p.add(p.remove());
            }
            if(p.size()==1){
                System.out.println(p.poll());
            }
            else{
                p.remove();
            }




        }




    }



    public static void main(String[] args) {

        int n = kb.nextInt();
        int k = kb.nextInt();

        solution(n,k);



    }
}