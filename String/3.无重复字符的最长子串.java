class Solution {
    public int lengthOfLongestSubstring(String s) {
        List <Character> subString = new ArrayList<>();
        int maxLength = 0;
        for(Character c: s.toCharArray()){
            //未重复
            if(!subString.contains(c)){
                subString.add(c);
                maxLength = Math.max(maxLength, subString.size());
            }
            //重复
            else{
                maxLength = Math.max(maxLength, subString.size());
                int index = subString.indexOf(c);
                //删去重复的以及之前的字符
                for(int i=0;i<=index;i++){
                    subString.remove(0);
                }
                subString.add(c);
            }
        }
        return maxLength;
    }
}