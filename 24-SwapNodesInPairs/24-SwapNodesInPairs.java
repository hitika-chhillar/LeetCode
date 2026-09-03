// Last updated: 9/3/2026, 11:40:39 PM
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
    public ListNode swapPairs(ListNode head) {
      
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      ListNode prev = dummy;

      while(prev.next!=null && prev.next.next != null){
        ListNode first = prev.next;
        ListNode second = first.next;

        first.next = second.next;
        second.next = first;
        prev.next = second;

        prev = first;
      }
        return dummy.next;
       
    }
}