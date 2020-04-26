class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for(int i = 0;i < nums1.length; i++){
            int tmp = nums1[i];
            int flag = -1;
            boolean exist = false;
            for(int j = 0; j < nums2.length; j++){
                if(nums2[j] == tmp){
                    flag = j;
                    continue;
                }
                if(flag >= 0 && nums2[j] > tmp){
                    res[i] = nums2[j];
                    exist = true;
                    break;
                }
            }
            if(!exist)
                res[i] = -1;
        }
        return res;
    }
}