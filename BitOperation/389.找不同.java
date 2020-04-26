class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length() == 0) 
            return t.charAt(0);
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        char res = s1[0];
        for(int i = 1; i < s1.length; i++)
            res ^= s1[i];
        for(int i = 0; i < s2.length; i++)
            res ^= s2[i];
        return res;
    }
}