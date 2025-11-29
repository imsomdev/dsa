class Solution {
    public int missingMultiple(int[] nums, int k) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) set.add(num);

    int i = 1;
    while (true) {
        int candidate = k * i;
        if (!set.contains(candidate)) return candidate;
        i++;
    }
}

}