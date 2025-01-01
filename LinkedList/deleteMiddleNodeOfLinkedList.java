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
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode temp = head;
        int count = 0;

        while ( temp!=null ) {
            temp = temp.next;
            count++;
        } 

        int mid = count/2;
        ListNode remove = head;
        int num = 0;

        while( remove != null && remove.next != null ) {
            if( num == mid-1 ) {
                remove.next = remove.next.next;
                break;
            }
            remove = remove.next;
            num++; 
        }

        return head;

    }
}