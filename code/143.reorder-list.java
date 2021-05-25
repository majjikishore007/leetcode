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
class Solution {
    public ListNode reverseList(ListNode head) {
		ListNode prev = null, curr = head, Next = null;
		while (curr != null) {
			Next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = Next;
		}
		head = prev;
		return head;
	}

	public void reorderList(ListNode head) {
		if (head == null) {
			return;
		}
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode tail = slow.next;
		slow.next = null;
		ListNode header = reverseList(tail);
		ListNode curr = head;
		while (header != null) {
			ListNode Next = curr.next;
			ListNode revNext = header.next;
			curr.next = header;
			header.next = Next;
			header = revNext;
			curr = Next;
		}

	}
}