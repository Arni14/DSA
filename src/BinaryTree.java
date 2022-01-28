public class BinaryTree {

    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    private TreeNode root;
    private int size;

    public BinaryTree() {
        this.root = null;
        this.size = 0;
    }

    public void add(int value) {
        this.root = add(this.root, value);
    }

    //         8
    //     4       10
    //  3    5         11
    // add(13)
    //         8
    //     4       10
    //  3    5         11
    //                     13

    /**
     * This function takes in a tree node, makes a copy of it but with the modification
     * that "value" has been added.
     * @param r The current tree node
     * @param value The current value
     * @return A new tree node with the modification.
     */
    public TreeNode add(TreeNode r, int value) {
        // If our current root is Null, then we just want to set the root.
        if (r == null) {
            return new TreeNode(value, null, null);
        }
        // In the case that the tree is not null, we can either
        // have value < root value. Then, we recurse to the left subtree.
        if (value < r.value) {
            r.left = add(r.left, value);
        }
        else {
            r.right = add(r.right, value);
        }
        return r;
    }

    public void printMe() {
        print(this.root);
    }

    //       8
    //    7     9
    //  6     10  11
    public void print(TreeNode r) {
        if (r == null) {
            return;
        }
        // Call print on the left
        print(r.right);
        // Call print on the root
        System.out.println(r.value);
        // Call print on the right
        print(r.left);
    }
}
