/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int rem = 0;

        ListNode curr = null;
        ListNode head = null;

        while (l1 != null || l2 != null || rem != 0) {
            int sum = rem, val = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (sum > 9) {
                val = sum % 10;
                rem = sum / 10;
            } else {
                val = sum;
                rem = 0;
            }
            ListNode node = new ListNode(val);

            if (curr == null) {
                curr = node;
                head = curr;
            } else {
                curr.next = node;
                curr = curr.next;
            }

        }
        return head;
    }
}