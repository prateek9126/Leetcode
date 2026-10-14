/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.*;

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }

        for (int i = 0; i + k <= arr.size(); i += k) {
            int a = i, b = i + k - 1;

            while (a < b) {
                int c = arr.get(a);
                arr.set(a, arr.get(b));
                arr.set(b, c);
                a++;
                b--;
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for (int x : arr) {
            tail.next = new ListNode(x);
            tail = tail.next;
        }

        return dummy.next;
    }
}
