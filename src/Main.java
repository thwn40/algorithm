


import java.util.*;

class Main {
    static int n;
    static int[] ch;
    static ArrayList<Integer> arr;
    static int[] answer;
    static int sum =0;
    static int j=0;
    public void DFS(int L){
        if(L==n+1){
            String tmp="";
            sum=0;
            for(int i=1; i<=n; i++){
                if(ch[i]==1) {
                    tmp+=(i+" ");
                    sum+=arr.get(i);
                }
            }
            System.out.println(tmp);
            answer[j]=sum;
            j++;


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
        Main T = new Main();
        n=kb.nextInt();
        arr = new ArrayList<>();
        arr.add(-1);
        answer = new int[(int) Math.pow((double) 2,(double) n)];
        for (int i = 1; i < n+1; i++) {
            arr.add(kb.nextInt());
        }
        ch=new int[n+1];
        T.DFS(1);
      Set<Integer> a = Set.copyOf(arr);
      if(a.size());
    }
}
