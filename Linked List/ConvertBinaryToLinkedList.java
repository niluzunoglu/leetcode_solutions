/**

Solution of https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class ConvertBinaryToLinkedList {

    private int getLength(ListNode head, int count){

        if(head == null){
            return count;
        }

        return getLength (head.next, 1+count);
    }


    public int getDecimalValue(ListNode head) {
        
        int number = 0, pow = 1;

        int length = getLength(head,0);

        if(length == 1){return head.val;}

        while(head.next != null){

            number += head.val * Math.pow(2,length-pow);
            pow += 1;
            head = head.next;

            if(head.next == null){
                number += head.val * Math.pow(2,length-pow);
                break;
            }
        } 

        return number;
    }
}
