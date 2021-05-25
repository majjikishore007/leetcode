class Solution {
    public List<Integer> spiralOrder(int[][] sp) {
        List<Integer> list = new ArrayList<Integer>();
		int rowend = sp.length - 1, colend = sp[0].length - 1;
		int rowSt = 0, colSt = 0;
		while (rowSt <= rowend && colSt <= colend) {
			// 1 row
			for (int i = colSt; i <= colend; i++) {
				list.add(sp[rowSt][i]);
			}
			// last colum
			rowSt++;
			for (int i = rowSt; i <= rowend; i++) {
				list.add(sp[i][colend]);
			}
			colend--;
			// last row
			if (rowSt <= rowend) {
				for (int i = colend; i >= colSt; i--) {
					list.add(sp[rowend][i]);
				}
				rowend--;
			}

			if (colSt <= colend) {
				for (int i = rowend; i >= rowSt; i--) {
					list.add(sp[i][colSt]);
				}
				colSt++;
			}

		}
		return list;
    }
}