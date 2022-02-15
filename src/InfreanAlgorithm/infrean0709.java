package InfreanAlgorithm;


import java.util.*;

class Node1{
    int data;
    Node lt, rt;
    public Node1(int val){
        data=val;
        lt=rt=null;
    }
}



public  class infrean0709 {
    Node root;
    int depth = 0;
    static Scanner kb = new Scanner(System.in);
    int answer =0;
    public void BFS(int L, Node root) {


        if(root.lt==null&&root.rt==null){
            System.out.println("depth"+L);

        }
        else{
            BFS(L+1,root.lt);
            BFS(L+1,root.rt);

        }


    }




    public static void main(String[] args) {

        infrean0709 tree = new infrean0709();
        tree.root= new Node(1);
        tree.root.lt= new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt= new Node(4);
        tree.root.lt.rt= new Node(5);
        tree.BFS(0,tree.root);









    }

}



