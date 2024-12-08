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
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        
        ListNode mid = slow;
        ListNode prev = null;
        while(mid!=null){
            ListNode nextNode = mid.next;
            mid.next = prev;
            prev = mid;
            mid = nextNode;
        }


        ListNode first = head;
        ListNode second = prev;
        ListNode temp1 = first.next;
        ListNode temp2 = second.next;
        while (second != null && second.next != null) {

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;

            temp1 = first.next;
            temp2 = second.next;
        }
    }
}