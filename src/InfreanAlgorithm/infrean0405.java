package InfreanAlgorithm;






import java.util.*;




public  class infrean0405 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(int a, int b) {

        Set<Integer> ans = new TreeSet<Integer>(Collections.reverseOrder());
        int[] num = new int[a];
        for (int i = 0; i < a; i++) {
            num[i]=kb.nextInt();
        }
        for (int i = 0; i < a; i++) {
            for (int j = i+1; j < a; j++) {
                for (int k = j+1; k < a; k++) {
                    ans.add(num[i]+num[j]+num[k]);
                }
            }
        }

        if (ans.toArray().length<3||a<b){
            System.out.println("-1");

        }
        else{
            System.out.println(ans.toArray()[b-1]);

        }



    }



    public static void main(String[] args) {

        int a = kb.nextInt();
        int b = kb.nextInt();





        solution(a,b);

    }
}



