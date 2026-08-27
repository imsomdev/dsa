class Solution:
    def lexGreaterPermutation(self, s: str, target: str) -> str:
        count = Counter(s)
        res = []

        # Try matching target from left to right
        for i in range(len(target)):
            ch = target[i]

            # 1. Match target[i] if possible
            if count[ch] > 0:
                res.append(ch)
                count[ch] -= 1
                continue

            # 2. Otherwise, try smallest character > target[i]
            for code in range(ord(ch) + 1, ord('z') + 1):
                bigger = chr(code)

                if count[bigger] > 0:
                    res.append(bigger)
                    count[bigger] -= 1

                    # Already greater, so append remaining chars
                    # in smallest possible order
                    for c in "abcdefghijklmnopqrstuvwxyz":
                        res.extend([c] * count[c])

                    return "".join(res)

            # 3. Nothing greater available here → backtrack
            break

        # Either:
        # - we got stuck, or
        # - we matched target completely (equal is not allowed)

        for j in range(len(res) - 1, -1, -1):

            # Give back the character used at position j
            old = res.pop()
            count[old] += 1

            # Find smallest available character > target[j]
            for code in range(ord(target[j]) + 1, ord('z') + 1):
                bigger = chr(code)

                if count[bigger] > 0:
                    count[bigger] -= 1

                    answer = res + [bigger]

                    # Add remaining characters in sorted order
                    for c in "abcdefghijklmnopqrstuvwxyz":
                        answer.extend([c] * count[c])

                    return "".join(answer)

        return ""