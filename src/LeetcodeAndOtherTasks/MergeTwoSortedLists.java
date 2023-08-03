package LeetcodeAndOtherTasks;

import java.util.Arrays;
import java.util.LinkedList;

class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return null;
    }

    public static void main(String[] args) {
    LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 4));
    LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 3, 4));
    }
}

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}