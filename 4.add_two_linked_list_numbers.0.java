// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static ListNode sumTwoLinkedLists(ListNode input1, ListNode input2) {
    if (input1 == null && input2 == null) return null;
    if (input1 != null && input2 == null) return input1;
    if (input1 == null && input2 != null) return input2;
    int carry = 0;
    int sum = 0;
    ListNode dummy = new ListNode(-1);
    ListNode curr = dummy;
    while (input1 != null && input2 != null) {
        sum = input1.data + input2.data + carry;
        curr.next = new ListNode(sum%10);
        carry = sum/10;
        input1 = input1.next;
        input2 = input2.next;
        curr = curr.next;
    }
    while (input1 != null) {
        sum = input1.data + carry;
        curr.next = new ListNode(sum%10);
        carry = sum/10;
        input1 = input1.next;
        curr = curr.next;
    }
    while (input2 != null) {
        sum = input2.data + carry;
        curr.next = new ListNode(sum%10);
        carry = sum/10;
        input2 = input2.next;
        curr = curr.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummy.next;
}
