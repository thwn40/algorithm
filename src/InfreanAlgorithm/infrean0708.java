package InfreanAlgorithm;


import java.util.*;




public  class infrean0708 {
    static Scanner kb = new Scanner(System.in);

    public int BFS(int s,int cow) {
        int[] dis = {1,-1,5};
        int[] ch = new int[10001];
        Queue<Integer> Q = new LinkedList<>();
        int jump=0;
        ch[s]=1;
        Q.offer(s);
        while(!Q.isEmpty()){
            int len=Q.size();
            for (int i = 0; i < len; i++) {
                int x= Q.poll();
                for (int j = 0; j < 3; j++) {
                    int dist=x+dis[j];
                    if(dist==cow) return jump+1;
                    if(dist>=1&& dist<=10000 &&ch[dist]==0){
                        ch[dist]=1;
                        Q.offer(dist);
                    }
                }
            }
            jump++;
        }







        return jump;
    }



    public static void main(String[] args) {
        int s = kb.nextInt();
        int cow = kb.nextInt();
        infrean0708 tree = new infrean0708();
        System.out.println(tree.BFS(s,cow));









    }

}


