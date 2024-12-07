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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
      ListNode start = head;
      ListNode end = head;
      int length=1;
      while(end.next!=null){
        length++;
        end = end.next;
      }  
        int[] arr = new int[length];
        int i=0;
        while(start != null){
            arr[i] = start.val;
            start = start.next;
            i++;
        }
        int n=arr.length-1;
        int s=0;
        int e=n;
        while(s<=e){
            if(arr[s]!=arr[e]){
                return false;            
            }
            s++;
            e--; 
        }
        return true;
    }
}