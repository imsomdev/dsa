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
    int result = 0;

    public void getSum(TreeNode node, int k, List<Integer> path) {
        if (node == null) {
            return;
        }
        path.add(node.val);
        // System.out.println(path);
        long sum = 0;
        for (int i = path.size() - 1; i >= 0; i--) {
            sum += path.get(i);
            // System.out.println(sum);

            if (sum == k) {
                result++;
            }
        }
        getSum(node.left, k, new ArrayList<>(path));
        getSum(node.right, k, new ArrayList<>(path));
    }
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        getSum(root, targetSum, new ArrayList<>());
        return result;
    }
}