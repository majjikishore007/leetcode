class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
      
		int min=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
				min=Math.max(count, min);
			}
			else count=0;
		}
		return min;

	
    }
}