/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
   public Node cloneGraph(Node node) {
		if (node == null) {
			return null;
		}
		Map<Node, Node> seen = new HashMap<Node, Node>();

		return cloneGraphHelper(node, seen);

	}

	public Node cloneGraphHelper(Node node, Map<Node, Node> seen) {
		if (seen.containsKey(node)) {
			return seen.get(node);
		}

		Node newnode = new Node(node.val);
		seen.put(node, newnode);
		for (Node n : node.neighbors) {
			newnode.neighbors.add(cloneGraphHelper(n, seen));
		}

		return newnode;

	}
}