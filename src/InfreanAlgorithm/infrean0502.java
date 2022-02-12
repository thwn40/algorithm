package InfreanAlgorithm;

import java.util.*;




public  class infrean0502 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(String a) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < a.length(); i++) {
            stack.push(a.charAt(i));

            if(a.charAt(i)==')'){
                while(true){
                    if (stack.peek()!='('){
                        stack.pop();

                    }else{
                        stack.pop();

                        break;
                    }

                }
            }
        }
        for (Character x :
                stack) {
            System.out.print(x);
        }




    }



    public static void main(String[] args) {

        String a= kb.nextLine();

        solution(a);

    }
}