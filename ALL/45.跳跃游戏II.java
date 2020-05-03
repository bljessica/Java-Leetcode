class Solution {
    public int jump(int[] nums) {
        int jumpNum = 0;
        int index = 0;
        while(index < nums.length - 1){
            int maxStep = nums[index];
            int nextPosition = index;
            int nextIndex = index;
            //找到可以跳最远的位置:nums[i]+j+nums[j]最大
            for(int j=0; j<=maxStep; j++){
                if((index+j) >= nums.length-1){
                    nextIndex = nums.length-1;
                    break;
                }
                if(index+j+nums[index+j] >= nextPosition){
                    nextPosition = index+j+nums[j+index];
                    nextIndex = index + j;
                }
            }
            index = nextIndex;
            jumpNum++;
        }
        return jumpNum;
    }
}