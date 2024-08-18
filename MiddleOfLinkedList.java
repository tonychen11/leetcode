class Solution {
    public ListNode middleNode(ListNode head) {
        //slow and fast pointer
        ListNode slow =  head;
        ListNode fast =  head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
