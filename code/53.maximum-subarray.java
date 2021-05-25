class Solution {
    public int maxSubArray(int[] nums) {
            
        if(nums.length<=1){
            return nums[0];
        }
        
        int maxSum=Integer.MIN_VALUE;int currMax=0;
        for(int i=0;i<nums.length;i++){
             currMax+=nums[i];
            maxSum=Math.max(maxSum,currMax);
            if(currMax<0){
                currMax=0;
            }
        }
        return maxSum;
    }
}