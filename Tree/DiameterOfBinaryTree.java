//543. Diameter of Binary Tree

//Given the root of a binary tree, return the length of the diameter of the tree.
//The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
//The length of a path between two nodes is represented by the number of edges between them.
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int result;
    public int diameterOfBinaryTree(TreeNode root) {
        result =0;
        if(root == null)return 0;
        helper(root);
        return result;
    }
    private int helper(TreeNode root){
        if(root == null)return 0;
        int val1 = helper(root.left);
        int val2 = helper(root.right);
        result = Math.max(result,val1+val2);
        return Math.max(val1,val2)+1;
    }
}