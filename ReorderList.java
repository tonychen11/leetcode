class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rightHalf = slow.next;
        slow.next = null;               

        rightHalf = reverseLinkedList(rightHalf);

        ListNode leftHalf = head;
        ListNode leftNext;
        ListNode rightNext;

        while(rightHalf != null){
            leftNext = leftHalf.next;
            rightNext = rightHalf.next;

            leftHalf.next = rightHalf;
            rightHalf.next = leftNext;

            leftHalf = leftNext;
            rightHalf= rightNext;
        }
    }

    public ListNode reverseLinkedList(ListNode head){
        ListNode tail = null; 
        ListNode headNext;
      
        while(head != null){
            headNext = head.next;
            head.next = tail;
            tail = head;
            head = headNext;
        }
      
        return tail;
    }
}
