class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        ListNode ptr1 = l1;        // ✔ fixed
        ListNode ptr2 = l2;
        int carry = 0;             // ✔ added

        while (ptr1 != null || ptr2 != null) {   // ✔ fixed

            int val1 = (ptr1 != null) ? ptr1.val : 0; // ✔ fixed
            int val2 = (ptr2 != null) ? ptr2.val : 0; // ✔ fixed

            int sum = val1 + val2 + carry;
            int d = sum % 10;
            carry = sum / 10;

            ListNode temp = new ListNode(d);
            dummy.next = temp;
            dummy = dummy.next;

            ptr1 = (ptr1 != null) ? ptr1.next : null; // ✔ fixed
            ptr2 = (ptr2 != null) ? ptr2.next : null; // ✔ fixed
        }

        if (carry > 0) {            // ✔ fixed
            ListNode temp = new ListNode(carry);
            dummy.next = temp;
        }

        return ans.next;
    }
}