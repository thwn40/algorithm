package InfreanAlgorithm;

import java.util.*;

import java.util.*;

class infrean0714 {
    static int n;
    static int[] ch;
    static ArrayList<Integer> arr,answer;
    static int sum =0;
    static int j=0;
    static int sum1=1;
    boolean ans = false;
    static Set<Integer> a;
    public void DFS(int L){
        if(L==n+1){
            String tmp="";
            sum=0;
            for(int i=1; i<=n; i++){
                if(ch[i]==1) {
                    tmp+=(arr.get(i)+" ");
                    sum+=arr.get(i);
                }
            }
//            System.out.println(tmp);
            if(sum==sum1/2){
//                System.out.println("xs");
                ans=true;
            }



        }
        else{
            ch[L]=1;
            DFS(L+1);
            ch[L]=0;
            DFS(L+1);
        }

    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        infrean0714 T = new infrean0714();
        n=kb.nextInt();
        arr = new ArrayList<>();
        arr.add(-1);
        answer = new ArrayList<>();
        for (int i = 1; i < n+1; i++) {
            arr.add(kb.nextInt());
        }

        for (Integer i : arr) {
            sum1=sum1+i;
        }
        ch=new int[n+1];
        T.DFS(1);
        a = new HashSet<>(answer);
//        for (Integer integer : a) {
//            System.out.print(integer+" ");
//        }
//        System.out.println();
//        for (Integer integer : answer) {
//            System.out.print(integer+" ");
//        }

        if(T.ans&&(sum1%2==0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}