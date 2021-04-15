//199. Binary Tree Right Side View
//Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

//BFS approach

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        if(root == null)return ls;
        Queue<TreeNode>que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size = que.size();
            for(int i =0;i<size;i++){
                TreeNode curr = que.poll();
                if(i == size-1)ls.add(curr.val);
                if(curr.left!= null)que.add(curr.left);
                if(curr.right!= null)que.add(curr.right);
            }
        }
          return ls;
    }
  
}

//DFS Approach

class Solution {
    List<Integer> result;
    public List<Integer> rightSideView(TreeNode root) {
        result = new ArrayList<>();
        if(root == null)return result;
        dfs(root,0);
        return result;
    }
    private void dfs(TreeNode root, int level){
        if(root == null)return;
        if(level == result.size()){
            result.add(root.val);
        }
        dfs(root.right, level+1);
        dfs(root.left, level+1);
    }
}