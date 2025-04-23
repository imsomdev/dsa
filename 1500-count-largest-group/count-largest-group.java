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
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i <= 36; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 1; i <= n; i++) {
            int sod = SOD(i);
            arr.get(sod).add(i);
        }

        int maxSize = 0;
        int count = 0;

        for (List<Integer> list : arr) {
            if (list.size() > maxSize) {
                maxSize = list.size();
                count = 1;
            } else if (list.size() == maxSize) {
                count++;
            }
        }

        return count;
    }
}
