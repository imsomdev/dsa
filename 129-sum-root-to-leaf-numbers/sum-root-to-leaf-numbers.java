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
    public int findSum(TreeNode node, int pathSum){
        if(node == null){
            return 0;
        }
        pathSum = 10 * pathSum + node.val;
        if(node.left == null && node.right == null){
            return pathSum;
        }
        int leftSum = findSum(node.left, pathSum);
        int rightSum = findSum(node.right, pathSum);
        return leftSum + rightSum;
    }
    public int sumNumbers(TreeNode root) {
        return findSum(root, 0);
    }
}