class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        ArrayList<Integer> resultList = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            // Skip duplicates in nums1
            while (i > 0 && i < nums1.length && nums1[i] == nums1[i - 1]) {
                i++;
            }

            // Skip duplicates in nums2
            while (j > 0 && j < nums2.length && nums2[j] == nums2[j - 1]) {
                j++;
            }

            // If the current elements are equal, add to result and move both pointers
            if (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
                resultList.add(nums1[i]);
                i++;
                j++;
            }
            // If current element in nums1 is less, move its pointer
            else if (i < nums1.length && j < nums2.length && nums1[i] < nums2[j]) {
                i++;
            }
            // If current element in nums2 is less, move its pointer
            else if (i < nums1.length && j < nums2.length) {
                j++;
            }
        }

        int[] result = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            result[k] = resultList.get(k);
        }

        return result;
    }
}
