class MyQueue:

    def __init__(self):
        self.st1 = []
        self.st2 = []

    def push(self, x: int) -> None:
        self.st1.append(x)

    def pop(self) -> int:
        while len(self.st1) > 1:
            self.st2.append(self.st1.pop())
        pop_ele = self.st1.pop()

        while len(self.st2) != 0:
            self.st1.append(self.st2.pop())

        return pop_ele
    def peek(self) -> int:
        while len(self.st1) > 1:
            self.st2.append(self.st1.pop())

        top_ele = self.st1[-1]

        while len(self.st2) != 0:
            self.st1.append(self.st2.pop())

        return top_ele

    def empty(self) -> bool:
        return len(self.st1) == 0


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()