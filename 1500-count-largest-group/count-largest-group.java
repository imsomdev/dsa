class Solution {

    private int SOD(int num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }

    public int countLargestGroup(int n) {
        int[] count = new int[46];
        for (int i = 1; i <= n; i++) {
            int sod = SOD(i);
            count[sod]++;
        }

        int maxSize = 0;
        int largestGroupsCount = 0;
        for (int i = 0; i <= 45; i++) {
            if (count[i] > maxSize) {
                maxSize = count[i];
                largestGroupsCount = 1;
            } else if (count[i] == maxSize) {
                largestGroupsCount++;
            }
        }

        return largestGroupsCount;
    }
}
