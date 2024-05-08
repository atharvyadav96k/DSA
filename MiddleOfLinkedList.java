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
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int n = 0;
        if (head == null) {
            return head;
        }
        while (current != null) {
            current = current.next;
            n++;
        }
        current = head;
        int mid = n / 2;
        n = 0;
        while (current != null) {
            if (n >= mid) {
                return current;
            }
            current = current.next;
            n++;
        }
        return null;
    }
}