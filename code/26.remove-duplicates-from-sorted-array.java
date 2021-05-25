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
   public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) {
			return null;
		}
		PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
			@Override
			public int compare(ListNode o1, ListNode o2) {
				if (o1.val < o2.val)
					return -1;
				else if (o1.val == o2.val)
					return 0;
				else
					return 1;
			}
		});

		// adding all the heads
		for (ListNode node : lists) {
			if (node != null) {
				pq.add(node);
			}
		}

		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		// making the sorted list
		while (!pq.isEmpty()) {
			ListNode n = pq.poll();
			tail.next = n;
			tail = n;
			if (n.next != null) {
				pq.add(n.next);
			}
		}
		return dummy.next;
	}
}