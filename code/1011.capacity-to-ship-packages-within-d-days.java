class Solution {
    public int shipWithinDays(int[] arr, int D) {
        // code here
        int low=0,high=0;
        for(int w : arr){
            low=Math.max(low,w);
            high+=w;
        }
        while(low < high){
            int mid=(low + high)/2;
            int dayaC=1,currW=0;
            for(int w:arr){
                if(currW +w>mid){
                    dayaC+=1;
                    currW=0;
                }
                currW+=w;
            }
            if(dayaC>D){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
}