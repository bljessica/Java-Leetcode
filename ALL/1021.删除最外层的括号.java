class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder s = new StringBuilder();
        int level = 0;
        for(char c: S.toCharArray()){
            if(c == '(') level++;
            if(level > 1) s.append(c);
            if(c == ')') level --;
        }
        return s.toString();
    }
}