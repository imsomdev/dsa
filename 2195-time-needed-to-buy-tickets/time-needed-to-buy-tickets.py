class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
      time = 0
      for i, t in enumerate(tickets):
        if i <= k:
          time += min(tickets[k], tickets[i])
        else:
          time += min(tickets[k] - 1, tickets[i])
      return time