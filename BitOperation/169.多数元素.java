class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, major = nums[0];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == major) count++;
            else count--;
            if(count == 0 && i != nums.length-1) major = nums[i+1];
        }
        return major;
    }
}