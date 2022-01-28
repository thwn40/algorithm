package InfreanAlgorithm;







import java.util.*;




public  class infrean0407 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(String n, String k) {
        Queue<Character> ns = new LinkedList<>();
        Queue<Character> queue = new LinkedList<>();
        String answer = "";

        for (int i = 0; i < n.length(); i++) {
            ns.add(n.charAt(i));
        }

        for (int i = 0; i < k.length(); i++) {
            queue.add(k.charAt(i));
        }
        for (int i = 0; i < k.length(); i++) {
            Character temp = queue.poll();
            if (temp == ns.peek()) {
                ns.remove();
                answer+=temp;
            }
        }

        if(answer.equals(n)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }






    }



    public static void main(String[] args) {

        String n = kb.nextLine();
        String k = kb.nextLine();

        solution(n,k);



    }
}

