package binaryTree;

public class FndNthElementInBST {
    public static void nthElement(Node root,Index index,int position){
        if(root==null){
            return;

        }
        nthElement(root.left,index,position);
        if(index.index==position-1){
           index.element=root.key;
        }
        index.index=index.index+1;
        nthElement(root.right,index,position);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        int n = 3;
       Index index=new Index();
        nthElement(root,index, n);
        System.out.println(index.element);
    }
}
