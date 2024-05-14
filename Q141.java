/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */ 
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        if (slow == null) {
            return false;
        }
        boolean next = false;
        ListNode fast = head.next;
        while(fast != slow) {
            if (fast == null) {
                return false;
            }
            if (next) {
                slow = slow.next;
            }
            fast = fast.next;
            next = !next;
        }
        return true;
    }
}