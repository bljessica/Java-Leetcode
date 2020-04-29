/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        if(mountainArr==null || mountainArr.length()==0) return -1;
        return find(target, mountainArr, 0, mountainArr.length()-1);
    }

    public int find(int target, MountainArray mountainArr, int start, int end){
        if(start>end)return -1;
        int mid = (start+end)/2;
        int startNum = mountainArr.get(start);
        int midNum = mountainArr.get(mid);
        int endNum = mountainArr.get(end);
        if(target==startNum)return start;
        if(target==midNum) return mid;
        if(target==endNum)return end;
        //单升，单减，山峰三种类型
        //单升
        if(startNum<=midNum && midNum<=endNum){
            if(target<midNum) return find(target, mountainArr, start+1,mid-1);
            else return find(target, mountainArr, mid+1,end-1);
        }
        //单减
        if(startNum>=midNum && midNum>=endNum){
            if(target<midNum) return find(target, mountainArr, mid+1,end-1);
            else return find(target, mountainArr, start+1,mid-1);
        }
        //山峰型
        if(startNum<=midNum && midNum>=endNum){
            int left = find(target, mountainArr, start+1,mid-1);
            int right = find(target, mountainArr, mid+1,end-1);
            if(left==-1){
                if(right==-1) return -1;
                else return right;
            }
            else{
                if(right==-1)return left;
                else return Math.min(left, right);
            }
        }
        return -1;
    }
}