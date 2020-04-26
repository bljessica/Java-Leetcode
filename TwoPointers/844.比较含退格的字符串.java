class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        StringBuilder s = new StringBuilder();
        StringBuilder t = new StringBuilder();
        for(char c: S.toCharArray()){
            switch(c){
                case '#': if(!s1.isEmpty()) s1.pop();break;
                default: s1.push(c);
            }
        }
        while(!s1.isEmpty()) s.append(s1.pop());
        for(char c: T.toCharArray()){
            switch(c){
                case '#': if(!s2.isEmpty()) s2.pop();break;
                default: s2.push(c);
            }
        }
        while(!s2.isEmpty()) t.append(s2.pop());
        return s.toString().equals(t.toString());
    }
}