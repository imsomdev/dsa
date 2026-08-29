class Solution:
    def lastSubstring(self, s: str) -> str:
        i = 0
        j = 1
        n = len(s)

        while j < n:
            if s[j] > s[i]:
                i = j
                j = i + 1

            elif s[j] == s[i]:
                k = 0

                while j + k < n and s[j + k] == s[i + k]:
                    k += 1

                if j + k == n:
                    break

                elif s[j + k] > s[i + k]:
                    i = max(i + k + 1, j)
                    j = i + 1

                else:
                    j = j + k + 1

            else:
                j += 1

        return s[i:]