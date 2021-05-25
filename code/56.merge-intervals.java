class Solution {
    
    public int[][] merge(int[][] intervals) {
		List<int[]> list =new ArrayList<>();
		if(intervals.length<1) {
			return intervals;
		}
        //sorting the array
		Arrays.sort(intervals,(i1,i2)-> Integer.compare(i1[0], i2[0]));
		int curr[]=intervals[0];
		list.add(curr);
		for (int[] interval : intervals) {
			if(interval[0]<=curr[1]) {
				curr[1]=Math.max(interval[1], curr[1]);
				
			}else {
				
				curr=interval;
                list.add(curr);
			}
		}
//		int [][]ans=(int[][]) list.toArray();
		return  list.toArray(new int [list.size()][]);
    }
}