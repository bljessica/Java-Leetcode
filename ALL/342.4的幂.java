class Solution {
    public boolean isPowerOfFour(int num) {
        if(num == 1) return true;
        if(num < 4) return false;
        int numOfOne = 0;
        int index = 1;
        while(num != 0){
            if((num & 1) == 1){
                numOfOne++;
                if(numOfOne > 1) return false;
                if(((index & 1) == 0) || (index < 3)) return false;
            } 
            num = num >> 1;
            index++;
        }
        return true;
    }
}