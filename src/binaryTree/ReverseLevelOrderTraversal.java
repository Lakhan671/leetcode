package binaryTree;

public class ReverseLevelOrderTraversal {
    public int height(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void printSpiral(Node root){
        int h=height(root);
        for(int i=h;i>0;i--){
            printSpiral(root,i);


        }
    }
    public void printSpiral(Node root,int level){
        if(root==null){
            return;
        }
        if(level==1){
            System.out.print(root.key+" ");
        } else if(level>0) {

            printSpiral(root.left,  level - 1);
            printSpiral(root.right,  level - 1);
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        System.out.println("Spiral order traversal of Binary Tree is ");
        new ReverseLevelOrderTraversal().printSpiral(root);
    }

}
