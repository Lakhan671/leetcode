package binaryTree;

public class ConstBSTFromPreorder {
    private static Node node;
    // This will create the BST
    public static Node createNode(Node node, int data)
    {
        if (node == null)
            node = new Node(data);
        if (node.key > data)
            node.left = createNode(node.left, data);
        if (node.key < data)
            node.right = createNode(node.right, data);

        return node;
    }

    // A wrapper function of createNode
    public static void create(int data)
    {
        node = createNode(node, data);
    }
    // A function to print BST in inorder
    public static void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] nodeData = { 10, 5, 1, 7, 40, 50 };

        for (int i = 0; i < nodeData.length; i++) {
            create(nodeData[i]);
        }
        inorderRec(node);
    }
}
