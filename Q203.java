/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val){
            head = head.next;
        }
        if (head == null){
            return null;
        }
        ListNode firstPointer = head;
        ListNode secondPointer = head.next;
        while (secondPointer != null){
            if (secondPointer.val != val){
                firstPointer.next = secondPointer;
                firstPointer = secondPointer;
            }
            secondPointer = secondPointer.next;
        }
        firstPointer.next = null;
        return head;
    }
}