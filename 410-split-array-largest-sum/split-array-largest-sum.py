class Solution:
    def splitArray(self, nums: list[int], k: int) -> int:
        def is_possible(target):
            count = 1
            current_sum = 0

            for num in nums:
                if current_sum + num <= target:
                    current_sum += num
                else:
                    count += 1
                    current_sum = num

                    if count > k:
                        return False

            return True

        left = max(nums)
        right = sum(nums)

        while left <= right:
            mid = left + (right - left) // 2

            if is_possible(mid):
                right = mid - 1
            else:
                left = mid + 1

        return left