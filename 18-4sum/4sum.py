class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        nums.sort()
        res = []
        n = len(nums)

        for j in range(n - 3):

            if j > 0 and nums[j] == nums[j - 1]:
                continue

            for i in range(j + 1, n - 2):

                if i > j + 1 and nums[i] == nums[i - 1]:
                    continue

                l = i + 1
                r = n - 1
                temp = target - nums[j] - nums[i]

                while l < r:
                    total = nums[l] + nums[r]

                    if total == temp:
                        res.append([nums[j], nums[i], nums[l], nums[r]])
                        l += 1
                        r -= 1

                        while l < r and nums[l] == nums[l - 1]:
                            l += 1

                        while l < r and nums[r] == nums[r + 1]:
                            r -= 1

                    elif total < temp:
                        l += 1
                    else:
                        r -= 1

        return res