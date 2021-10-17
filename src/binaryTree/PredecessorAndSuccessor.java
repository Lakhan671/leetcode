package binaryTree;

import linkedlist.BinaryTree;

public class PredecessorAndSuccessor {
    static int[]pre=new int[2];
    static boolean  b=false;
    public static void predecessorAndSuccessor(Node root,int data){
         if(root==null){
             return;
         }
         predecessorAndSuccessor(root.left,data);
            if(b==true){
             pre[1]=root.key;
              b=false;
            }
             if(root.key==data){
                 b=true;
             }
             if(pre[1]==0 && root.key!=data){
                 pre[0]=root.key;
             }

         predecessorAndSuccessor(root.right,data);
    }
    static  Node getNode(int data)
    {
        // allocate node
        Node new_node =new Node();
        // put in the data;
        new_node.key = data;
        new_node.left = new_node.right = null;

        return new_node;
    }
    static int val=0;
    public static void inSuccessorOfAllNode(Node root){
        if(root==null){
            return;
        }
        inSuccessorOfAllNode(root.left);
         if(val==0){
             val=root.key;
         }else{
             System.out.println(" next of "+val+" is "+root.key);
             val=root.key;

         }
        inSuccessorOfAllNode(root.right);

    }
    public static void main(String[] args) {
        Node root = getNode(1);       //         1
        root.left = getNode(2);        //       /   \
        root.right = getNode(3);       //     2      3
        root.left.left = getNode(4);  //    /  \  /   \
        root.left.right = getNode(5); //   4   5  6   7
        root.right.left = getNode(6);
        root.right.right = getNode(7);
      //  predecessorAndSuccessor(root,7);
        for (int i:pre){
            System.out.println(i);
        }

        Node root2 =getNode(10);
        root2.left = new Node(8);
        root2.right = new Node(12);
        root2.left.left = new Node(3);
        inSuccessorOfAllNode(root2);
    }
}
