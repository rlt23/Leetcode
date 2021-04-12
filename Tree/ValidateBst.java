//98. Validate Binary Search Tree
//Given the root of a binary tree, determine if it is a valid binary search tree (BST).
//A valid BST is defined as follows:

//The left subtree of a node contains only nodes with keys less than the node's key.
//The right subtree of a node contains only nodes with keys greater than the node's key.
//Both the left and right subtrees must also be binary search trees.

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
    public boolean isValidBST(TreeNode root) {
        if(root == null)return true;
        TreeNode prev = null;
        Stack<TreeNode> st = new Stack<>();
        while(root!=null || !st.isEmpty()){
            while(root!=null){
                st.push(root);
                root = root.left;
            }
            root = st.pop();
            if(prev!=null && prev.val>=root.val)return false;
            prev = root;
            root = root.right;
        }
        return true;
    }
}

class Solution {
    TreeNode prev;
    boolean isValid;
    public boolean isValidBST(TreeNode root) {
       // prev = null;
        if(root == null)return true;
        isValid = true;
        helper(root);
        
        return isValid;
    }
    private void helper(TreeNode root){
        if(root == null){
            return;
        }
        helper(root.left);
        if(prev != null && prev.val >= root.val){
            isValid = false;
            return;
        }
        prev = root;
        helper(root.right);
    }
}