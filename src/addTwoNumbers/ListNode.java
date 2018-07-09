package addTwoNumbers;

public class ListNode {

    int val;
    ListNode next;

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ListNode (int val) {
        this.val = val;
    }

    ListNode() {}

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
