class Solution {
    public int maxSubArray(int[] nums) {
        return findMaxSum(nums, 0, nums.length - 1);
    }

    public int findMaxSum(int[] nums, int left, int right){
        if(left == right) return nums[left];
        int mid = (left + right)/2;
        return Math.max(Math.max(findMaxSum(nums, left, mid), findMaxSum(nums, mid+1, right)), findMaxCross(nums, left, mid, right));
    }

    public int findMaxCross(int[] nums, int left, int mid, int right){
        int sum = 0;
        int leftSum = Integer.MIN_VALUE, rightSum = Integer.MIN_VALUE;
        //从中间往左计算
        for(int i=mid; i>=left; i--){
            sum = sum + nums[i];
            if(sum > leftSum)
                leftSum = sum;
        }
        sum = 0;
        //从中间往右计算
        for(int i=mid+1; i<=right; i++){
            sum = sum + nums[i];
            if(sum > rightSum)
                rightSum = sum;
        }
        return leftSum + rightSum;
    }
}