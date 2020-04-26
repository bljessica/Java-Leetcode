class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String s: str){
            if(!stack.isEmpty() && s.equals(".."))
                stack.pop();
            else if(!s.equals("..") && !s.equals(".") && !s.equals(""))
                stack.push(s);
        }
        if(stack.isEmpty())
            return "/";
        return "/" + stack.stream().collect(Collectors.joining("/"));
    }
}