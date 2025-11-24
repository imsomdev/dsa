class Solution(object):
    def sod(self, num):
        res = 0
        while num != 0:
            rem = num % 10
            res += rem
            num = num // 10
        return res

    def sumAndMultiply(self, n):
        s = ""
        for c in str(n):
            if c != '0':
                s += c
        
        if s == "":
            return 0
        
        x = int(s)
        return x * self.sod(x)
