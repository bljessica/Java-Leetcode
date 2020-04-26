class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for(String type: ops){
            if(type.equals("C"))
                stack.pop();
            else if(type.equals("D")){
                int tmp = stack.peek();
                stack.push(tmp * 2);
            }
            else if(type.equals("+")){
                int t1 = stack.pop();
                int t2 = stack.pop();
                stack.push(t2);
                stack.push(t1);
                stack.push(t1 + t2); 
            }
            else{
                stack.push(Integer.parseInt(type));
            }
        }
        int res = 0;
        while(!stack.isEmpty()){
            res += stack.pop();
        }
        return res;
    }
}