class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        items = set()
        res = 0
        count = 0
        start = 0

        for c in s:
            # if c in items:
            #     while True:
            #         if c == s[start]:
            #             items.remove(s[start])
            #             start += 1
            #             count -= 1
            #             break
            #         items.remove(s[start])
            #         start += 1
            #         count -= 1
            #the above one also correct
            
            while c in items:
                items.remove(s[start])
                start += 1
                count -= 1

            items.add(c)
            count += 1
            res = max(res, count)
            print(count)
        return res