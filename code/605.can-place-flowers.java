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
    int max = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		getDiameter(root);
		return max;
	}

	public int getDiameter(TreeNode root) {
		// base case
		if (root == null) {
			return 0;
		}
		int left = getDiameter(root.left);
		int right = getDiameter(root.right);
		max = Math.max(max, left + right);
		return Math.max( left, right) + 1;

	}
}