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
 import java.util.*;
class Solution {
    Queue<TreeNode> q = new LinkedList<>();
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return null;
        q.add(root);
        return bfs(root);
    }
    TreeNode bfs(TreeNode root){
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if(node.left!=null)q.add(node.left);
            if(node.right!=null)q.add(node.right);
        }
        return root;
    }
}