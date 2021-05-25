class Solution {
    public static  int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i]=getMax(arr,i);
        }
        arr[arr.length-1]=-1;
        return arr;
    }
    public static int getMax(int arr[],int x){
        int max=0;
        for(int i=x+1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}