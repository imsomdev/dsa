class Solution:
    def findDisappearedNumbers(self, nums: list[int], lower: int, upper: int) -> list[list[int]]:
        res = []
        st = set(nums)
        t1 = None
        t2 = None

        for i in range(lower, upper + 1):
            if i not in st and not t1:
                t1 = i
            
            if i in st and t1 != None:
                t2 = i - 1
                res.append([t1, t2])
                t1 = None
                t2 = None
            
        

        if t2 == None and t1 != None:
            res.append([t1, i])

        if i == upper:
            return res

        if t1 == None:
            return []

        return res