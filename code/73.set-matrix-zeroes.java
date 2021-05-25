class Solution {
    public void setZeroes(int[][] matrix) {
		ArrayList<Integer> col = new ArrayList<Integer>();
		ArrayList<Integer> row = new ArrayList<Integer>();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
                	System.out.println(i+" and   "+j);
				if (matrix[i][j] == 0) {
					row.add(i);
					col.add(j);
				}
			}
		}
        	System.out.println(row+"  "+col);
		for (int i = 0; i < row.size(); i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[row.get(i)][j] = 0;
			}
		}

		for (int i = 0; i < col.size(); i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[j][col.get(i)] = 0;
			}
		}

	}
}