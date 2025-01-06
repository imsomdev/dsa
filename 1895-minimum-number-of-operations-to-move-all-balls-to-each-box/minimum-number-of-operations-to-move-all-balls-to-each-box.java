class Solution {
    public int[] minOperations(String boxes) {
        HashSet<Integer> set = new HashSet<>();
        int n = boxes.length();
        for (int i = 0; i < n; i++) {
            if (boxes.charAt(i) == '1') {
                set.add(i);
            }
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int index : set) {
                sum += Math.abs(i - index);
            }
            arr[i] = sum;
        }
        
        return arr;
    }
}
