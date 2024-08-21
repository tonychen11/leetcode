class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = head;

        while(dummy != null){
            while(dummy.next != null && dummy.val == dummy.next.val){
                dummy.next = dummy.next.next;
            }
            dummy = dummy.next;
        }

        return head;
    }
}
