class Solution:
    def punishmentNumber(self, n: int) -> int:
        def can_partition(s: str, target: int, index: int, current_sum: int) -> bool:
            if index == len(s):
                return current_sum == target
            for i in range(index, len(s)):
                substring = s[index:i + 1]
                num = int(substring)
                if can_partition(s, target, i + 1, current_sum + num):
                    return True
            return False
        result = 0
        for i in range(1, n + 1):
            square = i * i
            square_str = str(square)
            if can_partition(square_str, i, 0, 0):
                result += square
        return result
