// Last updated: 9/4/2026, 3:21:03 PM
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
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head==null || k==1){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupprev = dummy;

        while(true){

         // Find kth node from groupPrev
         ListNode kth = groupprev;
         for(int i=0; i<k; i++){
            kth = kth.next;

            if(kth == null){
              return dummy.next; //return kr diya
            }
         }

         ListNode groupnext = kth.next;
           // Reverse current group
           ListNode prev = groupnext;
           ListNode curr = groupprev.next;

           while(curr != groupnext){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
           }

            // Connect reversed group
            ListNode temp = groupprev.next;
            groupprev.next = kth;
            groupprev = temp;

        }
         
    }
}