package Programmers.코딩테스트;

import java.util.*;

public class Main2 {
    static int[] arr = new int[6];
public int solution(int[] arr){
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
    Arrays.sort(arr2,Collections.reverseOrder());
    int sum=0;
    int count=0;

    for (int i = 0; i < arr.length; i++) {
        Integer temp;
        if(stack.size()==0){
            temp=0;
        }
        else{
            temp=stack.elementAt(stack.size()-1);
        }

        Integer push = stack.push(arr2[i]);
        System.out.println("push"+push);
        if(temp==push&&(stack.size()>1)){
            int pop=stack.pop();
            stack2.push(pop);
            int pop2=stack.pop();


            sum+=pop;
            count++;
            System.out.println("sum"+sum);
        }


    }
    System.out.println("count = " + count);
    System.out.println("stack = " + stack.size());
    System.out.println("stack = " + stack.size());


    System.out.println(sum);
    for (int i = 0; i < count-stack.size(); i++) {
        sum-=stack2.pop();
    }

    System.out.println(sum);
    int answer = -1;
    return sum;
}

    public static void main(String[] args) {
    Main2 main = new Main2();
    Scanner kb = new Scanner(System.in);
    for (int i = 0; i < 6; i++) {
            arr[i]=kb.nextInt();
        }
    main.solution(arr);
    }

}

