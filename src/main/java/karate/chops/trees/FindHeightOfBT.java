package karate.chops.trees;

public class FindHeightOfBT {
    public static void main(String[] args) {
        System.out.println(findHeight(BinaryTree.createPerfectBinaryTree()));
        System.out.println(findHeight(BinaryTree.createLeftSkewedTree()));
    }

    private static int findHeight(BinaryTreeNode n) {
        if (n == null)
            return 0;
        return Math.max(findHeight(n.left), findHeight(n.right)) + 1;
    }
}