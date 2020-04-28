class Solution {
    public int[] singleNumbers(int[] nums) {
        if(nums==null || nums.length==0) return null;
        Arrays.sort(nums);
        int[] res = new int[2];
        int index = 0, i=0;
        while(i+1<nums.length){
            if(nums[i] != nums[i+1]){
                res[index] = nums[i];
                index++;
                i++;
            }
            else{
                i+=2;
            }
        }
        if(index==1)res[index] = nums[nums.length-1];
        return res;
    }
}