class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        	//corner case 
			if(intervals.length<1) {
				return 0;
			}
			Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[1], i2[1]));
			
			int count=0;
			int curr[]=intervals[0];
			for (int[] interval : intervals) {
				if(interval[0]<curr[1]) {
//					curr[1]=Math.max(interval[1], curr[1]);
					count+=1;
				}else {
					curr=interval;
				}
			}
			
		return count-1;	
    }
}