class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        boolean flag = true;
        Queue <TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0; i<level; i++){
                TreeNode currentNode = q.poll();
                temp.add(currentNode.val);

                if(currentNode.left != null){
                    q.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    q.offer(currentNode.right);
                }
            }
            if(!flag){
                Collections.reverse(temp);
            }
            result.add(temp);
            flag = !flag;
        }
        return result;
    }
}