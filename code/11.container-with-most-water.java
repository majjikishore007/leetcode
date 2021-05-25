class Solution {
    public int maxArea(int[] height) {
        int low=0,high=height.length-1;
	       	int maxWater=0;
	       	// System.out.println(low+"  .. "+high+"..."+Math.min(height[low], height[high]));
	       	while(low<high) {
//	       		System.out.println("steps");
	       		int currWater=(high-low)*(Math.min(height[low], height[high]));
	       		maxWater=Math.max(currWater, maxWater);
	       		if(height[low]==height[high]) {
	       			low++;high--;
	       		}
	       		else if(height[low]<height[high]) {
	       			low++;
	       		}
	       		else {
	       			high--;
	       		}
	       	}
	       	return maxWater;
    }
}