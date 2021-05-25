class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
		for(int i=0;i<m/2;i++){
            for(int j=i;j<n-i-1;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-j-1][i];
                matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
                matrix[j][n-i-1]=temp;
                
            }
        }
    }
}