class Solution {
    public int getHeight(TreeNode node){
        if(node == null){
            return 0;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        int heightDiff = Math.abs(leftHeight - rightHeight);
        if(heightDiff > 1 || !isBalanced(root.left) || !isBalanced(root.right)){
            return false;
        }
        
        return true;
    }
}
