public class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int start = left - 1;
        int end = left;
        while (k-- > 0) {
            if (start < 0) {
                end++;
            } else if (end >= arr.length) {
                start--;
            } else if (Math.abs(arr[start] - x) <= Math.abs(arr[end] - x)) {
                start--;
            } else {
                end++;
            }
        }
        for (int i = start + 1; i < end; i++) {
            result.add(arr[i]);
        }
        
        return result;
    }
}