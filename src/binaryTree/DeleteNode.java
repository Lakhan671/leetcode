package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteNode {
    // A binary tree node has key, pointer to
// left child and a pointer to right child
    static class Node
    {
        int key;
        Node left, right;

        // Constructor
        Node(int key)
        {
            this.key = key;
            left = null;
            right = null;
        }
    }

    static Node root;
    static Node temp = root;

    // Inorder traversal of a binary tree
    static void inorder(Node temp)
    {
        if (temp == null)
            return;

        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    }


    // Function to delete given element
// in binary tree
   static Node lastNode=null,KeyNode=null;
    static void dRec(Node root,int key){

        if (root == null)
            return;
            if( root.right == null){
               lastNode=root;
            }
            if(root.left==null){
                lastNode=root;
            }
            if(root.key==key){
                KeyNode=root;
            }



        dRec(root.left,key);
        if (KeyNode!=null && KeyNode.key == key && root==null) {
            KeyNode.key = lastNode.key;
            lastNode=null;
        }
        dRec(root.right,key);
    }
    static void callRec(Node root,int k){
        dRec(root,k);

    }
    static void delete(Node root, int key)
    {
        if (root == null)
            return;

        if (root.left == null &&
                root.right == null)
        {
            if (root.key == key)
            {
                root=null;
                return;
            }
            else
                return;


        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp = null, keyNode = null;

        // Do level order traversal until
        // we find key and last node.
        while (!q.isEmpty())
        {
            temp = q.peek();
            q.remove();

            if (temp.key == key)
                keyNode = temp;

            if (temp.left != null)
                q.add(temp.left);

            if (temp.right != null)
                q.add(temp.right);
        }

        if (keyNode != null)
        {
            int x = temp.key;
            temp=null;
            keyNode.key = x;
        }
    }

    // Driver code
    public static void main(String args[])
    {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.left.right = new Node(12);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.print("Inorder traversal " +
                "before deletion:");
        inorder(root);

        int key = 12;
        // delete(root, key);
       callRec(root,12);
        if (KeyNode!=null && KeyNode.key == key) {
            KeyNode.key = lastNode.key;
            lastNode=null;
        }
        System.out.print("\nInorder traversal " +
                "after deletion:");
        inorder(root);
    }
}
