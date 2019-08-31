// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public Boolean isListPalindrome(ListNode head) {
    if (head == null || head.next == null) return true;
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode fast = dummy, slow = dummy;
    Stack<ListNode> s = new Stack<>();
    boolean isOdd = false;
    while (fast.next != null && fast.next.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        s.push(slow);
        isOdd = fast.next != null && fast.next.next == null;
    }
    if (isOdd) slow = slow.next;
    while (slow.next != null) {
        slow = slow.next;
        if (s.isEmpty()) return false;
        if (s.peek().data != slow.data) return false;
        s.pop();
    }
    return s.isEmpty() ? true : false;
}
