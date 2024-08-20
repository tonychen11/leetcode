class Solution {
    public boolean isPalindrome(ListNode head) {        
        ListNode dummy = head;
        List<Integer> list = new ArrayList<>();

        while(dummy != null){
            list.add(dummy.val);
            dummy = dummy.next;
        }

        int listLength = list.size();

        for(int i = 0; i < listLength / 2; i++){
            if(list.get(i) != list.get(listLength - i - 1)){
                return false;
            }
        }

        return true;
    }

    public boolean isPalindromeOptimizedSpace(ListNode head) {        
        //find middle of linked list
        //reverse first half
        //compare first and second halves to see if they're the same

        if(head.next == null){
            return true;
        }

        ListNode dummy = new ListNode(0, head);
        ListNode slow = dummy;
        ListNode fast = dummy;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode firstHalf = dummy.next;
        ListNode secondHalf = slow.next;

        //when linked list is odd length
        if(fast.next != null){
            secondHalf = secondHalf.next;
        }

        slow.next = null;
        ListNode reverseSecondHalf = reverseLinkedList(secondHalf);

        while(reverseSecondHalf != null){
            if(firstHalf.val != reverseSecondHalf.val){
                return false;
            }
            firstHalf = firstHalf.next;
            reverseSecondHalf = reverseSecondHalf.next;
        }

        return true;
    }

    public ListNode reverseLinkedList(ListNode head){
        ListNode newHead = null;

        while(head != null){
            ListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }

        return newHead;
    }

}
