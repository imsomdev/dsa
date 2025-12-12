class Solution(object):
    def countMentions(self, numberOfUsers, events):
        """
        :type numberOfUsers: int
        :type events: List[List[str]]
        :rtype: List[int]
        """
        # 1. Sort events. 
        # Primary key: Timestamp (int)
        # Secondary key: Event type. We want 'OFFLINE' to happen before 'MESSAGE'
        # if they have the same timestamp. Let's give OFFLINE priority 0 and MESSAGE priority 1.
        events.sort(key=lambda x: (int(x[1]), 0 if x[0] == "OFFLINE" else 1))
        
        res = [0] * numberOfUsers
        # Stores the timestamp when a user comes back online. 
        # Initialized to 0, meaning everyone is online at the start.
        come_back_time = [0] * numberOfUsers 
        
        for event in events:
            event_type = event[0]
            ts = int(event[1])
            content = event[2]
            
            if event_type == "OFFLINE":
                user_id = int(content)
                # User stays offline for 60 seconds. They are back at ts + 60.
                come_back_time[user_id] = ts + 60
                
            elif event_type == "MESSAGE":
                if content == "ALL":
                    # Increment count for everyone
                    for i in range(numberOfUsers):
                        res[i] += 1
                        
                elif content == "HERE":
                    # Increment count for online users only
                    for i in range(numberOfUsers):
                        # User is online if current timestamp is >= their come_back_time
                        if ts >= come_back_time[i]:
                            res[i] += 1
                            
                else:
                    # Parse specific IDs (e.g., "id0 id1")
                    # Specific mentions count regardless of online status
                    ids_str = content.split()
                    for id_s in ids_str:
                        # Slice off "id" and convert the rest to int
                        user_id = int(id_s[2:])
                        res[user_id] += 1
                        
        return res