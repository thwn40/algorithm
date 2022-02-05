import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;
class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data=val;
        lt=rt=null;
    }
}

public  class Main {

    public static void DFS(Node root){
        if(root==null){
            return;
        }
        else{
            DFS(root.lt);
            DFS(root.rt);
            System.out.print(root.data+" ");




        }


    }
    static Scanner kb = new Scanner(System.in);


    public static void main(String[] args) {
        Node root=new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
        root.rt=new Node(3);
        root.rt.lt=new Node(6);
        root.rt.rt=new Node(7);
        DFS(root);














    }

}

