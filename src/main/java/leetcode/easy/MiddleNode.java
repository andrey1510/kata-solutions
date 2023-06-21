package leetcode.easy;

//https://leetcode.com/problems/middle-of-the-linked-list/

import java.util.ArrayList;
import java.util.List;

public class MiddleNode {

    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        int length = 0;
        while (head != null) {
            list.add(head);
            head = head.next;
            length++;
        }
        return list.get(length/2);
    }


    public ListNode middleNode2(ListNode head) {
        ListNode pointer1 = head;
        ListNode pointer2 = head;

        while (pointer2 != null && pointer2.next != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;
        }
        return pointer1;
    }

}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}