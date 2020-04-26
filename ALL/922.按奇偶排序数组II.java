class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for(int i = 0; i < A.length; i += 2){
            if((A[i] & 1) == 1){ //奇数
                while((A[j] & 1) == 1) j += 2;
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        return A;
    }
}