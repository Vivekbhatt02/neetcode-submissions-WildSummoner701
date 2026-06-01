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
    public void reorderList(ListNode head) {
        if(head == null){
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast  = fast.next.next;
        }

        ListNode current = slow;
        ListNode previous = null;

        while(current != null){
            ListNode temp = current.next;

            current.next = previous;
            previous = current;
            current = temp;
        }

        ListNode first = head;
        ListNode second = previous;

        while(second.next != null){
            ListNode temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }
    }
}
