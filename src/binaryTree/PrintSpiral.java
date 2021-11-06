package binaryTree;

public class PrintSpiral {
    public int height(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void printSpiral(Node root){
        int h=height(root);
        boolean lr=false;
        for(int i=1;i<=h;i++){
             printSpiral(root,lr,i);
            System.out.println();
             lr=!lr;

        }
    }
    public void printSpiral(Node root,boolean lr,int level){
           if(root==null){
               return;
           }
        if(level==1){
            System.out.print(root.key+" ");
        } else if(level>0){
         if(lr){
             printSpiral(root.left,lr,level-1);
             printSpiral(root.right,lr,level-1);
         }else{
             printSpiral(root.right,lr,level-1);
             printSpiral(root.left,lr,level-1);
         }
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
        new PrintSpiral().printSpiral(root);
    }
}
