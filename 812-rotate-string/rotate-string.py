class Solution(object):
    def rotateString(self, s, goal):
        if len(s) != len(goal):
            return False
        
        if sorted(s) != sorted(goal):
            return False

        return goal in s + s
                    
    