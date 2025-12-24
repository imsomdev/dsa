class Solution(object):
    def minimumBoxes(self, apple, capacity):
        """
        :type apple: List[int]
        :type capacity: List[int]
        :rtype: int
        """
        capacity.sort(reverse=True)
        total_apple = 0
        res = 0
        for n in apple:
            total_apple += n
        for e in capacity:
            if total_apple <= 0:
                return res
            total_apple -= e
            res += 1
        return res