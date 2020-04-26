class Solution {
    public boolean isValid(String s) {
        if((s.length() & 1) == 1) return false;  
        Stack <Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            switch (c){
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if(stack.isEmpty()){
                        return false;
                    }
                    if (stack.pop() != '(')
                        return false;
                    break;
                case ']':
                    if(stack.isEmpty()){
                        return false;
                    }
                    if (stack.pop() != '[')
                        return false;
                    break;
                case '}':
                    if(stack.isEmpty()){
                        return false;
                    }
                    if (stack.pop() != '{')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}