





import java.util.*;




public  class Main {
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




    }



    public static void main(String[] args) {

       String a= kb.nextLine();
        System.out.println("a = " + a);
        solution(a);

    }
}



