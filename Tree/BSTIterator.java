//173. Binary Search Tree Iterator
//Implement the BSTIterator class that represents an iterator over the in-order traversal of a binary search tree (BST):
//BSTIterator(TreeNode root) Initializes an object of the BSTIterator class. The root of the BST is given as part of the constructor. The pointer should be initialized to a non-existent number smaller than any element in the BST.
//boolean hasNext() Returns true if there exists a number in the traversal to the right of the pointer, otherwise returns false.
//int next() Moves the pointer to the right, then returns the number at the pointer.
//Notice that by initializing the pointer to a non-existent smallest number, the first call to next() will return the smallest element in the BST.

//You may assume that next() calls will always be valid. That is, there will be at least a next number in the in-order traversal when next() is called.

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
class BSTIterator {
    Stack<TreeNode> st;
    public BSTIterator(TreeNode root) {
        st = new Stack<>();
        dfs(root);
    }
    
    public int next() {
        TreeNode result = st.pop();
        dfs(result.right);
        return result.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
    private void dfs(TreeNode root){
       // while(!st.isEmpty() || root !=null){
            while(root!=null){
                st.push(root);
                root = root.left;
            }
        }
    }

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */