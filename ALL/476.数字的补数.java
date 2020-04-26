class Solution {
    public int findComplement(int num) {
        int tmp = 0;
        int t = num;
        while(num != 0){ //把num的所有位数置1给tmp
            num = num >> 1;
            tmp = (tmp << 1) + 1;
        }
        return t ^ tmp;
    }
}