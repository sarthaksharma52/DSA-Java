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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        ListNode tp1 = head;
        int mid;
        int sx=0;
            mid = size/2;
            while(tp1!=null){
            if(sx==mid){
                return tp1;
            }
            tp1 = tp1.next;
            sx++;
            }
        
        return tp1;
    }
}


///////////////. optimised ////////////////////

// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;      // move slow one step
//             fast = fast.next.next; // move fast two steps
//         }

//         return slow; // slow is now at the middle
//     }
// }
