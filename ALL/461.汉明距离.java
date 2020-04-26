class Solution {
    public int hammingDistance(int x, int y) {
        int tmp = x ^ y;
        int num = 0;
        while(tmp != 0){
            if((tmp & 1) == 1) num++;
            tmp = tmp >> 1;
        }
        return num;
    }
}