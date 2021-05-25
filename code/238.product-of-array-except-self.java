class Solution {
    public int[] productExceptSelf(int[] nums) {
        //
        //total product
        //left product
         int arr[]=new int [nums.length];
        if(nums.length<2){
            return arr;
        }
       
        int left=1;
        for(int i=0;i<nums.length;i++){
            arr[i]=left;
            left*=nums[i];
        }
        int right=1;
        for(int i=arr.length-1;i>=0;i--){
            arr[i]*=right;
            right*=nums[i];
        }
        
        return arr;
    }
}