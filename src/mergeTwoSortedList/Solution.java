package mergeTwoSortedList;

public class Solution {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;

        if (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                result = l1;
                result.next = mergeTwoLists(l1.next, l2);
            } else {
                result = l2;
                result.next = mergeTwoLists(l1, l2.next);
            }

        } else if (l1 != null) {
            result = l1;
        } else if (l2 != null) {
            result = l2;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        node2.next = node1;
        ListNode node3 = new ListNode(1);
        node3.next = node2;

        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(3);
        node5.next = node4;
        ListNode node6 = new ListNode(1);
        node6.next = node5;

        ListNode result = Solution.mergeTwoLists(node3, node6);
    }

}
