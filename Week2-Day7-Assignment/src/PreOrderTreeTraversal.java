public class PreOrderTreeTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(5);
        root.right.right.left = new TreeNode(3);
        root.right.right.right = new TreeNode(6);
        root.right.right.left.right = new TreeNode(4);

        /* Example Tree Input
                1
                 \
                  2
                   \
                    5
                   / \
                   3 6
                    \
                     4
         */
        System.out.println("PreOrder traversal is : ");
        preOrder(root);
    }
    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
