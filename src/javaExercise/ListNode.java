package javaExercise;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode last=new ListNode(-1);
        ListNode newHead=last;
        ListNode cur1 = l1;
        ListNode cur2 = l2;

        if (l1 == null || l2 == null) {
            return null;
        }

        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                last.next = cur1;
                last=cur1;
                cur1 = cur1.next;
            } else {
                last.next = cur2;
                last=cur2;
                cur2 = cur2.next;
            }

            if (cur1 == null) {
                last.next = cur2;

            } else {
                last.next = cur1;
            }
        }
        return newHead.next;

    }
}






