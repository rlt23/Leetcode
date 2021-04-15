//993. Cousins in Binary Tree
//In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
//Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
//We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
//Return true if and only if the nodes corresponding to the values x and y are cousins.

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
 
 //BFS APPROACH
 
class Solution {
    boolean isFound_x;
    boolean isFound_y;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null)return false;
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0;i<size;i++){
                TreeNode curr = q.poll();
                if(curr.val == x)isFound_x = true;
                if(curr.val == y)isFound_y = true;
                if(curr.left!=null && curr.right!=null){
                    if(curr.left.val == x && curr.right.val == y)return false;
                    if(curr.left.val == y && curr.right.val == x)return false;
                }
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
            if(isFound_x && isFound_y)return true;
            if(isFound_x || isFound_y)return false;
        }
        return false;
    }
}

//DFS APPROACH
