class Solution {
    public static int[] findRedundantConnection(int[][] edges) {
		int m = edges.length;
		Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
		for (int i = 1; i <= m; i++) {
			map.put(i, new HashSet<Integer>());
		}
		System.out.println(map);
		for (int[] edge : edges) {
			int u = edge[0];
			int v = edge[1];
			if (dfs(u, v, map, new HashSet<Integer>())) {
				return edge;
			}
			map.get(v).add(u);
			map.get(u).add(v);
		}
		return new int[] { -1, -1 };

	}

	private static boolean dfs(int u, int v, Map<Integer, Set<Integer>> map, HashSet<Integer> seen) {
		if (u == v) {
			return true;
		}
		seen.add(u);
		for (int i : map.get(u)) {
			if (!seen.contains(i)) {
				if (dfs(i, v, map, seen))
					return true;
			}
		}
		return false;
	}
}