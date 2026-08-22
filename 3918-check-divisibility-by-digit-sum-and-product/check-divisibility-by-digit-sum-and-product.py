class Solution:
    def checkDivisibility(self, n: int) -> bool:
        og = n
        prod = 1
        sm = 0

        while n > 0:
            rem = n % 10
            prod *= rem
            sm += rem
            n //= 10

        return og % (sm + prod) == 0