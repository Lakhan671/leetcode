package binaryTree;

public class LowestCommonAncestorOfABinaryTree {

    public static TreeNode lca(TreeNode root,int p,int q){
        if(root==null || root.val==p ||root.val==q  ){
         return root;
        }
        TreeNode left=lca(root.left,p,q);
        TreeNode right=lca(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
      return  left==null?right:left;
    }

    public static void main(String[] args) {
      TreeNode  root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        System.out.println(lca(root,3,8).val);
    }
}
