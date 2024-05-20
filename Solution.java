public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        ListNode dummyA = headA;
        ListNode dummyB = headB;
        while (dummyA != null) {
            dummyA = dummyA.next;
            lengthA++;
        }
        while (dummyB != null) {
            dummyB = dummyB.next;
            lengthB++;
        }
        dummyA = headA;
        dummyB = headB;
        for (int i = 1; i < lengthA; i++) {
            dummyA = dummyA.next;
        }
        for (int i = 1; i < lengthB; i++) {
            dummyB = dummyB.next;
        }
        if (dummyA != dummyB) {
            return null;
        }
        while (lengthA != 1 && lengthB != 1) {
            lengthA--;
            lengthB--;
            dummyA = headA;
            dummyB = headB;
            for (int i = 1; i < lengthA; i++) {
                dummyA = dummyA.next;
            }
            for (int i = 1; i < lengthB; i++) {
                dummyB = dummyB.next;
            }
            if (dummyA != dummyB) {
                return dummyA.next;
            }
        }
        if (lengthA == 1) {
            return dummyA;
        }
        return dummyB;
    }
}