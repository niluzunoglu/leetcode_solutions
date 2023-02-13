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
class RemoveDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode temp; 
        ListNode prev;

        if(head != null){
            temp = head.next;
            prev = head;
        }

        else{
            return head;
        }
        

        while(temp != null){
        
            if(prev.val == temp.val){
                temp = temp.next;
                prev.next = temp;
            }   
            
            else{
                prev = temp; 
                temp = temp.next;
            }


            if(temp == null){
                break;
            }

        }
        return head;
    }
}
