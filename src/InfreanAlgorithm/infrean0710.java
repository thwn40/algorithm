package InfreanAlgorithm;







import java.util.*;

class Node3{
    int data;
    Node lt, rt;
    public Node3(int val){
        data=val;
        lt=rt=null;
    }
}



public  class infrean0710 {
    Node root;
    int depth = 0;
    static Scanner kb = new Scanner(System.in);
    int answer =0;
    int L=0;
    public void BFS(int L, Node root) {

        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        while(!Q.isEmpty()){
            int l = Q.size();

            for (int i = 0; i < l; i++) {
                Node temp = Q.poll();
                if(temp.lt!=null){
                    Q.offer(temp.lt);
                }if(temp.rt!=null){
                    Q.offer(temp.rt);
                }
                else{
                    System.out.println(L);
                    return;
                }

            }
            L++;
        }



    }




    public static void main(String[] args) {

        infrean0710 tree = new infrean0710();
        tree.root= new Node(1);
        tree.root.lt= new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt= new Node(4);
        tree.root.lt.rt= new Node(5);
        tree.BFS(0,tree.root);









    }

}



