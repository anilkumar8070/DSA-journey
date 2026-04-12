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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return -1;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        smallest(root,k,queue);
    
        for(int i = 0 ; i < k-1 ; i++){
            queue.poll();
        }

        return queue.poll().val;
    }

    public void smallest(TreeNode node,int k,Queue queue){
        
        if(node==null){
            return;
        }
        smallest(node.left,k,queue);
        queue.offer(node);
        smallest(node.right,k,queue);
    }
}