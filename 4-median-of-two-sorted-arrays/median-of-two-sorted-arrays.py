class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        if len(nums1) > len(nums2):  # Ensure nums1 is the smaller array
            nums1, nums2 = nums2, nums1

        n1, n2 = len(nums1), len(nums2)
        lo, hi = 0, n1

        while lo <= hi:
            cut1 = (lo + hi) // 2
            cut2 = (n1 + n2 + 1) // 2 - cut1

            left1 = float('-inf') if cut1 == 0 else nums1[cut1 - 1]
            right1 = float('inf') if cut1 == n1 else nums1[cut1]
            left2 = float('-inf') if cut2 == 0 else nums2[cut2 - 1]
            right2 = float('inf') if cut2 == n2 else nums2[cut2]

            if left1 <= right2 and left2 <= right1:
                if (n1 + n2) % 2 == 0:
                    return (max(left1, left2) + min(right1, right2)) / 2.0
                else:
                    return float(max(left1, left2))
            elif left1 > right2:
                hi = cut1 - 1
            else:
                lo = cut1 + 1
        