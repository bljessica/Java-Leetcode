class Solution {
    public int search(int[] nums, int target) {
        if(nums==null || nums.length==0) return -1;
        int start = 0, end = nums.length-1;
        //二分查找
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]) return mid;
            //左边有序
            if(nums[start]<=nums[mid]){
                if(target >= nums[start] && target < nums[mid]) end = mid - 1;
                else start = mid + 1;
            }
            //右边有序
            else{
                if(target > nums[mid] && target <= nums[end]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}