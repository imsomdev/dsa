class Solution {
    public ListNode doubleIt(ListNode head) {
        
        // Reversing the LinkedLists
        head = reverseList(head);
        
        int carry = 0;
        
        ListNode temp = head;
        ListNode prev = null;
        
        while (temp != null) {
            
            int sum = (temp.val * 2);
            
            int num = sum % 10;
            
            temp.val = num + carry;
            
            carry = sum / 10;
            
            prev = temp;
            temp = temp.next;
            
        }
        
        
        if (carry > 0) {
            
            ListNode nn = new ListNode(carry);
            
            prev.next = nn;
        }
        
        // Again Reversing the LinkedLists
        head = reverseList(head);
           
        
        return head;
    }
    
    public ListNode reverseList (ListNode head) {
        
        ListNode curr = head;
        ListNode prev = null;
        
        ListNode temp;
        
        while (curr != null) {
            
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
    
}