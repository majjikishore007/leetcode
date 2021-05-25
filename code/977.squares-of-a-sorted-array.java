class Solution {
   public static int[] sortedSquares(int[] A) {
		System.out.println("starting");
		for (int i = 0; i < A.length; i++) {
			A[i] = A[i] * A[i];
		}
		
		int start = 0, end = A.length;
		mergeSort(A, start, end-1);
		// for (int i = 0; i < A.length; i++) {
		// 	System.out.print(A[i] + " ");
		// }
		return A;
	}
   public static void merge(int Arr[], int start, int mid, int end) {
//		System.out.println("merge");

		int temp[] = new int[end - start + 1];

		int i = start, j = mid + 1, k = 0;

		while (i <= mid && j <= end) {
			if (Arr[i] <= Arr[j]) {
				temp[k] = Arr[i];
				k += 1;
				i += 1;
			} else {
				temp[k] = Arr[j];
				k += 1;
				j += 1;
			}
		}

		while (i <= mid) {
			temp[k] = Arr[i];
			k += 1;
			i += 1;
		}

		while (j <= end) {
			temp[k] = Arr[j];
			k += 1;
			j += 1;
		}

		for (i = start; i <= end; i += 1) {
			Arr[i] = temp[i - start];
		}
	}

	public static void mergeSort(int Arr[], int start, int end) {
//		System.out.println("mergeSort");
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(Arr, start, mid);
			mergeSort(Arr, mid + 1, end);
			merge(Arr, start, mid, end);
		}
	}
}