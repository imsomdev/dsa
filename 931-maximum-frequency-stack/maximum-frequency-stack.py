class FreqStack:

    def __init__(self):
        self.st = {}
        self.stfreq = {}
        self.maxfreq = 0

    def push(self, val: int) -> None:
        freq = self.stfreq.get(val, 0) + 1
        self.stfreq[val] = freq

        if freq not in self.st:
            self.st[freq] = []

        self.st[freq].append(val)
        self.maxfreq = max(self.maxfreq, freq)

    def pop(self) -> int:
        val = self.st[self.maxfreq].pop()

        self.stfreq[val] -= 1

        if not self.st[self.maxfreq]:
            self.maxfreq -= 1

        return val       


# Your FreqStack object will be instantiated and called as such:
# obj = FreqStack()
# obj.push(val)
# param_2 = obj.pop()