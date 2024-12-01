class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode();
        ListNode dummy = sum;
        boolean carryForward = false;

        while(l1 != null || l2 != null || carryForward){
            int currSum = 0;
            if(carryForward && l1 == null && l2 == null){
                currSum = 1;
            }
            else if(l1 == null){
                currSum = carryForward ? l2.val + 1 : l2.val;
            }
            else if(l2 == null){
                currSum = carryForward ? l1.val + 1 : l1.val;
            }
            else if(l1 != null && l2 != null){
                currSum = carryForward ? l1.val + l2.val + 1 : l1.val + l2.val;
            }

            carryForward = false;
            if(currSum > 9){
                carryForward = true;
                currSum = currSum % 10;
            }
            ListNode currentNode = new ListNode(currSum);
            dummy.next = currentNode;
            dummy = dummy.next;

            if(l1 != null) l1 = l1.next;      
            if(l2 != null) l2 = l2.next;          
        }

        return sum.next;
    }
}
