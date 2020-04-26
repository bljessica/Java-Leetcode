class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for(char c: S.toCharArray()){
            if(stack.isEmpty() || c != stack.peek())
                stack.push(c);
            else
                stack.pop();
        }
        StringBuilder sb = new StringBuilder();
        for(char c: stack)
            sb.append(c);
        return sb.toString();
    }
}