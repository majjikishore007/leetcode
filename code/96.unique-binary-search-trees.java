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
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> list =new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp=root;
        	while(temp!=null || !stack.isEmpty()) {
        		while(temp!=null) {
        			stack.push(temp);
        			temp=temp.left;
        		}
        	    temp=stack.pop();
        		list.add(temp.val);
        		temp=temp.right;
        	}
        
        return list;
    }
}