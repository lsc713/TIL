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
    int max;
    public int longestUnivaluePath(TreeNode root) {
        max =0;
        dfs(root);
        return max;
    }
    int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        int L=0,R=0;
        if(root.left != null && root.left.val == root.val){
            L=left+1;
        }
        if(root.right != null && root.right.val == root.val){
            R = right+1;
        }
        max = Math.max(max,L+R);
        return Math.max(L,R);
    }
}