

class Solution {

    private void solve(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        solve(nums, index + 1, current, result);
        current.add(nums[index]);
        solve(nums, index + 1, current, result);
        current.remove(current.size() - 1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> allSubsets = new ArrayList<>();
        solve(nums, 0, new ArrayList<>(), allSubsets);
        Set<List<Integer>> unique = new HashSet<>();
        for (List<Integer> subset : allSubsets) {
            unique.add(new ArrayList<>(subset));
        }

        return new ArrayList<>(unique);
    }
}
