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
    public TreeNode bstToGst(TreeNode root) {
        int sum=0;
        getSum(root,sum);
      return root;  
    }
    public int getSum(TreeNode root,int  sum){
        if(root==null){
            return sum;
        }
        sum=getSum(root.right,sum);
        root.val+=sum;
        sum=root.val;
         
        return  getSum(root.left,sum);
    }
}