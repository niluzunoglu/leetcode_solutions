/**

Solution of https://leetcode.com/problems/middle-of-the-linked-list/
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MiddleOfLinkedList {

    private int getLength(ListNode head, int count){

        if(head == null){
            return count;
        }

        return getLength(head.next, 1+count);
    }

    public ListNode middleNode(ListNode head) {

      int length = getLength(head,0);

      int middle = (length%2==0)? (length/2) : (length-1)/2;
      int count = 0;  

      while(count<middle){
        count += 1;
        head = head.next;
      }
      return head;
    }
}
