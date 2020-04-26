class Solution {
    public boolean hasAlternatingBits(int n) {
        //交替的101必定与它右移一位的010异或为111
        int tmp = n ^ (n >> 1);
        return (tmp & (tmp + 1)) == 0;
    }
}