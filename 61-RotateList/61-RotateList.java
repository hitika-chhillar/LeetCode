// Last updated: 9/4/2026, 4:01:55 PM
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
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null || k==0){
           return head;
        }

        //Finding length of the last node in the linklist
          int length = 1;
          ListNode tail = head;
           while(tail.next!=null){
            tail = tail.next;
            length++;
           }

            // Avoid unnecessary rotations
            k = k % length;

            if(k == 0){
                return head;
            }

              // Make the list circular
                 tail.next = head;

             // Find new tail
                int steps = length - k;
                ListNode newtail = tail;

                for(int i =0; i<steps; i++){
                    newtail = newtail.next;
                }
              // New head hoga last ke baad

              ListNode newhead = newtail.next;

                // Break the circle
                newtail.next = null;
                
                return newhead;
        
    }
}