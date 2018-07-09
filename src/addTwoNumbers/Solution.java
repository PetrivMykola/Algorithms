package addTwoNumbers;

import java.util.*;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * @author Mykola Petriv
 */
public class Solution {

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        List<ListNode> listNodes = new LinkedList<>();

        String firstDigits = new StringBuilder(findDigits(l1, new String(""))).reverse().toString();
        String secondDigits = new StringBuilder(findDigits(l2, new String(""))).reverse().toString();
        String sum = String.valueOf(Long.valueOf(firstDigits) + Long.valueOf(secondDigits));

        String resultOfReverse = new StringBuilder(sum).reverse().toString();

        for (int i = 0; i < resultOfReverse.length(); i++) {
            listNodes.add(new ListNode(Integer.valueOf(String.valueOf(resultOfReverse.charAt(i)))));
        }

        for (int i = 0; i < listNodes.size() - 1; i++) {
            listNodes.get(i).next = listNodes.get(i + 1);
            if (i == listNodes.size() - 1) break;
        }

        return ((LinkedList<ListNode>) listNodes).getFirst();
    }

    /**
     * Get {@link String} values of given nodes using recursion.
     */
    private static String findDigits(ListNode list, String result) {
        result = result.concat(String.valueOf(list.val));

        if (list.next != null) {
            result = findDigits(list.next, result);
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(3, null);
        ListNode node2 = new ListNode(4, node3);
        ListNode node1 = new ListNode(2, node2);

        ListNode node6 = new ListNode(4, null);
        ListNode node5 = new ListNode(6, node6);
        ListNode node4 = new ListNode(5, node5);

        Solution.addTwoNumbers(node1, node4);
    }
}
