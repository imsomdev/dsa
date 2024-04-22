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

    int traverse(TreeNode node, int maxValue) {
        if (node == null) {
            return 0;
        }
        int count = node.val >= maxValue ? 1 : 0;
        count += traverse(node.left, Math.max(maxValue, node.val));
        count += traverse(node.right, Math.max(maxValue, node.val));
        return count;
    }
    public int goodNodes(TreeNode root) {
        return traverse(root, root.val);
    }
}
