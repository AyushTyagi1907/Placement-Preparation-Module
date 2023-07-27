class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        if (node == null) return;
        Node temp;

        // calling mirror function recursively for left and right subtrees.
        mirror(node.left);
        mirror(node.right);

        // swapping the left and right subtree.
        temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
