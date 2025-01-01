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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // count the number of nodes present in linked list

        ListNode temp = head;
        ListNode move = head;

        int count = 1;

        if ( head == null ) {
            return head;
        }

        while ( move!=null && move.next!=null ) {
            count++;
            move = move.next;
        }

        int del = count - n;
        int num = 1;

        if (del == 0) {
            return head.next;
        }

        while ( temp != null && temp.next != null ) {

            if ( num == del ) {
                temp.next = temp.next.next;
                break;
            }
            else {
                temp = temp.next;
                num++;
            }
        }
        

        return head;

    }
}