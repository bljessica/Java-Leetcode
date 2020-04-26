class Solution {
    public int minDeletionSize(String[] A) {
        if(A.length == 0) return 0;
        int min = 0;
        int l = A[0].length();//字符串长度
        int c = A.length;//列数
        for(int i = 0; i < l; i++){ //列
            for(int j = 1; j < c; j++){ //行
                if(A[j].charAt(i) < A[j - 1].charAt(i)){
                    min += 1;
                    break;
                }
            }
        }
        return min;
    }
}