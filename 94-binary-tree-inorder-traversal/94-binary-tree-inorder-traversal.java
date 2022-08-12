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
    public static void help(TreeNode root,LinkedList<Integer> ans){
        if(root==null){
            return ;
        }
        help(root.left,ans);
        ans.add(root.val);
        help(root.right,ans);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> ans=new LinkedList<>();
        help(root,ans);
        return ans;
    }
}