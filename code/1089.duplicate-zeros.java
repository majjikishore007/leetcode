class Solution {
     public void duplicateZeros(int[] arr) {
		 int count=0;
	        for(int i=0;i<arr.length;i++) {
	        	if(arr[i]==0) {
	        		count++;
	        	}
	        }
	        int i=arr.length-1,j=count+arr.length-1;
	        while(i!=j) {
	        	copy(arr,i,j--);
	        	if(arr[i]==0) {
	        		copy(arr,i,j--);
	        	}
	        	i--;
	        }
	        
	    }
	private void copy(int[] arr, int i, int j) {
		if(j<arr.length) {
			arr[j]=arr[i];
		}
		
	}
}