package InfreanAlgorithm;

import java.util.*;




public  class infrean0505 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(String a) {
        Stack<Character> bar = new Stack<>();

        int answer = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='('){
                bar.add('(');

            }
            else{
                if(a.charAt(i-1)=='('){
                    bar.pop();
                    answer+=bar.size();
                }
                else{
                    bar.pop();
                    answer+=1;
                }
            }
        }

        System.out.println(answer);

    }



    public static void main(String[] args) {

        String a = kb.nextLine();


        solution(a);



    }
}