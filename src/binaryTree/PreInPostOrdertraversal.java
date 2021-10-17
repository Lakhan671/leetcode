package binaryTree;

import linkedlist.BinaryTree;

public class PreInPostOrdertraversal {
    Node root;
    public static void postOrdertraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.key+" ");
        postOrdertraversal(root.left);
        postOrdertraversal(root.right);
    }
    static  int index=0;
    public static void CreatepostOrdertraversal(Node root,int[]arr){
        if(root==null){
            return;
        }
        System.out.print(root.key+" ");
        postOrdertraversal(root.left);
        postOrdertraversal(root.right);
    }

    public static void main(String[] args) {

        PreInPostOrdertraversal tree = new PreInPostOrdertraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        postOrdertraversal(tree.root);
    }
}
