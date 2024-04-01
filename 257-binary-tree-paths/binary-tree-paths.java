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
        public void getPath(TreeNode node, List<String> res, String temp) {
        if (node == null)
            return;
        if (node.left == null && node.right == null) {
            res.add(temp + node.val);
            return;
        }
        getPath(node.left, res, temp + node.val + "->");
        getPath(node.right, res, temp + node.val + "->");
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        getPath(root, res, "");
        return res;
    }
}