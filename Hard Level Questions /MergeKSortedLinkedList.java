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
class MergeKSortedLinkedList {
    public ListNode mergeKLists(ListNode[] lists) {
        
        boolean isEmpty = true;
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        
        // Add all lists elements to newArray
        for(int i=0;i<lists.length;i++){
            
            ListNode node = lists[i];
            
            if(node != null){ 
                
                isEmpty = false;
            
                while(node != null){
                    newArray.add(node.val);
                    node = node.next;
                }
            }
        }       
        
        if (isEmpty){
            return null;
        }
        
        // Sort all elements
        Collections.sort(newArray);
        
        // Insert elements in one linkedlist in ascending order
        ListNode orderedLinkedList = new ListNode(newArray.get(0));
        ListNode temp = orderedLinkedList;
        
        for(int i=1;i<newArray.size();i++){
            
            ListNode node = new ListNode(newArray.get(i));
            temp.next = node;
            temp = node;
        }
        
        return orderedLinkedList;
    }
}
