class Solution {
    public static boolean isAnagram(String s, String t) {
		char[] arr = s.toCharArray();
		char[] brr = t.toCharArray();
		// int sum1 = 0;

		Arrays.sort(arr);
		Arrays.sort(brr);
		 String str1 = String.valueOf(arr);
		 String str2 = String.valueOf(brr);
		// System.out.println(str1+"....and ...."+str2);
		return str1.equals(str2) ? true : false;
	}
}