package InfreanAlgorithm;


import java.util.*;

import java.util.*;

class infrean0802 {
    static Scanner kb = new Scanner(System.in);
    static int sum = 0;
    static int c =kb.nextInt();
    static int n =kb.nextInt();
    static int answer = 0;
    boolean flag =false;
    public void dfs(int a,int sum,ArrayList<Integer> arr) {
        if(sum>c) return;
        if(a==n){
            if(sum<c){
                answer = Math.max(answer,sum);
            }
        }

        else{
            dfs(a+1,sum+arr.get(a),arr);
            dfs(a+1,sum,arr);
        }

    }



    public static void main(String[] args){

        infrean0802 T = new infrean0802();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(kb.nextInt());
        }
        T.dfs(0,sum,arr);
        System.out.println(answer);


    }
}
