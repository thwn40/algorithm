package InfreanAlgorithm;
import java.util.*;




public  class infrean0501 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(String a) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < a.length(); i++) {

            if(a.charAt(i)=='('){
                stack.push(a.charAt(i));
            }
            else{
                if(stack.empty()){
                    stack.push(a.charAt(i));
                    break;
                }
                else{
                    stack.pop();
                }

            }


        }

        if(!stack.empty()){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }





    }



    public static void main(String[] args) {

        String a= kb.nextLine();





        solution(a);

    }
}