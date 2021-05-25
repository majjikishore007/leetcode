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
    public  int countNodes(TreeNode root) {
        if(root==null) {
        	return 0;
        }
        else {
        	int count1=countNodes(root.left);
        	int count2=countNodes(root.right);
        	 return count1+count2+1;
        }
    }
}