class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(nums1.length);
        for(int n: nums1){
            Integer count = map.get(n);
            if(count == null) map.put(n, 1);
            else map.put(n, ++count);
        }
        List<Integer> list = new ArrayList<>();
        for(int n: nums2){
            Integer count = map.get(n);
            if(count != null && count != 0){
                map.put(n, --count);
                list.add(n);
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = list.get(i);
        return res;
    }
}