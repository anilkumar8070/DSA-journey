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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        if(root==null){
            return lst;
        }
        Pot(lst,root);
        return lst;

    }

    public void Pot(List<Integer> lst, TreeNode node){
        if(node==null){
            return;
        }        
        Pot(lst,node.left);
        Pot(lst,node.right);
        lst.add(node.val);
    }
}