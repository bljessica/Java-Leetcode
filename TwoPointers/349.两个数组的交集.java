class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Set <Integer>set = new HashSet<>();
        for(int i = 0; i < nums1.length; i++)
            map.put(nums1[i], i);
        for(int i = 0; i < nums2.length; i++)
            if(map.containsKey(nums2[i]))
                set.add(nums2[i]);
        int[] res = new int[set.size()];
        Iterator iterator = set.iterator();
        int i = 0;
        while(iterator.hasNext()){
            res[i] = (int)iterator.next();
            i++;
        }
        return res;
    }
}