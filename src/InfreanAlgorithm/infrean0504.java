package InfreanAlgorithm;
import java.util.*;
import java.util.regex.Pattern;


public  class infrean0504 {
    static Scanner kb = new Scanner(System.in);
    public static void solution(String a) {
        Stack<Integer> stack = new Stack<>();
        String str="^[0-9]*$";


        int answer = 0;
        for (int i = 0; i < a.length(); i++) {
            int n1=0;
            int n2=0;
            if(Pattern.matches(str,a.substring(i,i+1))){
                stack.push(Integer.parseInt(a.substring(i,i+1)));
            }
            else if(a.charAt(i)=='+'){
                n1=stack.pop();
                n2=stack.pop();
                stack.push(n2+n1);
            }

            else if(a.charAt(i)=='*'){
                n1=stack.pop();
                n2=stack.pop();
                stack.push(n2*n1);
            }
            else if(a.charAt(i)=='/'){
                n1=stack.pop();
                n2=stack.pop();
                stack.push(n2/n1);
            }
            else if(a.charAt(i)=='-'){
                n1=stack.pop();
                n2=stack.pop();
                stack.push(n2-n1);
            }


        }
        System.out.println(stack.pop());




    }



    public static void main(String[] args) {
        String a= kb.nextLine();



        solution(a);

    }
}