class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int totalSum = (n*n) * ((n*n) + 1) / 2;
        int currentSum = 0;
        int repeatedNumber = -1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                if (!set.contains(num)) {
                    currentSum += num;
                    set.add(num);
                } else {
                    repeatedNumber = num;
                }
            }
        }
        int missingNumber = totalSum - currentSum;
        return new int[] { repeatedNumber, missingNumber };
    }
}
