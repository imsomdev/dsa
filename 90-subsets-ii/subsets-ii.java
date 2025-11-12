import java.util.*;

class Solution {
    private void solve(int[] nums, List<Integer> op, List<List<Integer>> result) {
        if (nums.length == 0) {
            result.add(new ArrayList<>(op));
            return;
        }
        int[] rest = Arrays.copyOfRange(nums, 1, nums.length);
        List<Integer> op1 = new ArrayList<>(op);
        List<Integer> op2 = new ArrayList<>(op); 
        op2.add(nums[0]);

        solve(rest, op1, result); 
        solve(rest, op2, result); 
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> result = new ArrayList<>();
        solve(nums, new ArrayList<>(), result);
        Set<List<Integer>> unique = new HashSet<>(result);
        return new ArrayList<>(unique);
    }
}
