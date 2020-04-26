class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] nums = new int[1001];
        int[] res = new int[arr1.length];
        //统计arr1中每个数的数量
        for(int i: arr1)
            nums[i]++;
        //遍历arr2
        int index = 0;
        for(int i: arr2){
            while(nums[i] > 0){//可能重复
                res[index++] = i;
                nums[i]--;
            }
        }
        //处理只在arr1中的元素
        for(int i = 0 ; i < nums.length; i++)
            while(nums[i] > 0){
                res[index++] = i;
                nums[i]--;
            }
        return res;
    }
}