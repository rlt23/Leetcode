//102. Binary Tree Level Order Traversal
//Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
//BFS APPROACH

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
    List<List<Integer>> ls;
    public List<List<Integer>> levelOrder(TreeNode root) {
        ls= new ArrayList<>();
        if(root == null)return ls;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size = que.size();
            List<Integer> level = new ArrayList<>();
            for(int i =0;i<size;i++){
                TreeNode temp = que.poll();
                level.add(temp.val);
                if(temp.left!=null)que.add(temp.left);
                if(temp.right!=null)que.add(temp.right);
            }
            ls.add(level);
            System.out.println(level);
        }
        return ls;
    }
}

//DFS APPROACH
