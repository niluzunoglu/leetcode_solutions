/*  
Solution of -> https://leetcode.com/problems/insertion-sort-list/
*/ 

class InsertionSort {

    public ListNode insertionSortList(ListNode head) {

        ListNode temp = head.next;
        int nodeData;

        while(temp != null){

            ListNode traverse = head;

            while(traverse != temp){
                if(traverse.val > temp.val){
                    nodeData = traverse.val;
                    traverse.val = temp.val;
                    temp.val = nodeData;
                }

                traverse = traverse.next;
            }

            temp = temp.next;
        }

        return head;
    }
}
