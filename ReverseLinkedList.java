class Solution {
    public ListNode reverseList(ListNode head) {
        //null         1-2-3-4-5
        //1-null       2-3-4-5
        //2-1-null     3-4-5
        //3-2-1-null   4-5
        //4-3-2-1-null 5

        ListNode newHead = null;

        while(head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }

        return newHead;
    }
}
