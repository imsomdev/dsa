import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        
        TreeNode current = root;
        while (current != null || !stk.isEmpty()) {
            while (current != null) {
                stk.push(current);
                current = current.left;
            }
            current = stk.pop();
            res.add(current.val);
            current = current.right;
        }
        
        return res;
    }
}
