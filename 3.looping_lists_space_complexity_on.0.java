// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public Boolean isCyclic(ListNode head) {
    HashSet<ListNode> seen = new HashSet<>();
    ListNode curr = head;
    while (curr != null) {
        if (seen.contains(curr)) return true;
        seen.add(curr);
        curr = curr.next;
    }
    return false;
}
