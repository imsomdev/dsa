class Solution {
    public int getHeight(TreeNode node){
        if(node == null){
            return 0;
        }
        int lH = getHeight(node.left);
        int rH = getHeight(node.right);
        if(lH == -1 || rH == -1 || Math.abs(lH - rH) > 1){
            return -1;
        }
        return 1 + Math.max(lH, rH);
    }
    
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }
}
