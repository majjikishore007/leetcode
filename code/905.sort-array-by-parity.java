class Solution {
    public int[] sortArrayByParity(int[] A) {
        int j=0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                int temp=A[j];
                A[j++]=A[i];
                A[i]=temp;
            }
        }
        return A;
    }
}