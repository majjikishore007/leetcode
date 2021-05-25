class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<int[]>();
		if (intervals.length == 0 && newInterval.length == 0) {
			return list.toArray(new int[list.size()][]);
		}
		if (newInterval.length == 0) {
			return intervals;
		}
		if (intervals.length < 1) {

			list.add(newInterval);
			return list.toArray(new int[list.size()][]);
		}
		for (int[] interval : intervals) {
			// checking to add to rigth
			if (newInterval[0] > interval[1]) {
				list.add(interval);
			} else if (newInterval[1] < interval[0]) {
				list.add(newInterval);
				newInterval = interval;
			} else {
				newInterval[1] = Math.max(newInterval[1], interval[1]);
				newInterval[0] = Math.min(newInterval[0], interval[0]);
			}
		}
		list.add(newInterval);
		return list.toArray(new int[list.size()][]);
    }
}