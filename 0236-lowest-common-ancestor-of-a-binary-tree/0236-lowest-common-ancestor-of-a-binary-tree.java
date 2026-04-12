/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }

        TreeNode node = root;
        if(node.val == p.val || node.val == q.val){
            return node;
        }
        TreeNode left = lowestCommonAncestor(node.left,p,q);
        TreeNode right = lowestCommonAncestor(node.right,p,q);

        if(left!=null && right!=null){
            return node;
        }
        
        if(left == null){
            return right;
        }else{
            return left;
        }

    }
}