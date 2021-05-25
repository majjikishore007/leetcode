class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
       int arr[]=new int [n];
		ArrayList<Integer>l=new ArrayList<Integer>();
		for (List<Integer> list : edges) {
			int i=list.get(1);
			arr[i]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				l.add(i);
			}
		}
		return l; 
    }
}