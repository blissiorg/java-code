public class ELYASTIHW3<T extends Comparable<? super T>> extends BST<T> {

    // Method to count and return the number of nodes in the binary tree
    public int countNodes() {
        return countNodes(root);
    }

    // Helper method to recursively count the number of nodes
    private int countNodes(BSTNode<T> node) {
        if (node == null) {
            return 0;
        }
        // Count the current node and recursively count the nodes in the left and right subtrees
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    // Method to count and return the number of leaves in the binary tree
    public int countLeaves() {
        return countLeaves(root);
    }

    // Helper method to recursively count the number of leaves
    private int countLeaves(BSTNode<T> node) {
        if (node == null) {
            return 0;
        }
        // If the current node has no children, it is a leaf node
        if (node.left == null && node.right == null) {
            return 1;
        }
        // Recursively count the leaves in the left and right subtrees
        return countLeaves(node.left) + countLeaves(node.right);
    }

    // Method to count and return the number of right children in the binary tree
    public int countRightChildren() {
        return countRightChildren(root);
    }

    // Helper method to recursively count the number of right children
    private int countRightChildren(BSTNode<T> node) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        // If the current node has a right child, increment the count
        if (node.right != null) {
            count++;
        }
        // Recursively count the right children in the left and right subtrees
        count += countRightChildren(node.left) + countRightChildren(node.right);
        return count;
    }

    // Method to find and return the height of the tree
    public int findHeight() {
        return findHeight(root);
    }

    // Helper method to recursively find the height of the tree
    private int findHeight(BSTNode<T> node) {
        if (node == null) {
            return -1;
        }
        // Recursively find the height of the left and right subtrees
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        // Return the maximum height plus 1
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Method to delete all leaves from the binary tree
    public void deleteLeaves() {
        root = deleteLeaves(root);
    }

    // Helper method to recursively delete all leaves
    private BSTNode<T> deleteLeaves(BSTNode<T> node) {
        if (node == null) {
            return null;
        }
        // If the current node is a leaf, return null to delete it
        if (node.left == null && node.right == null) {
            return null;
        }
        // Recursively delete the leaves in the left and right subtrees
        node.left = deleteLeaves(node.left);
        node.right = deleteLeaves(node.right);
        return node;
    }
}