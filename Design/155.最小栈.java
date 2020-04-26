class MinStack {
    Stack<Integer> data, helper;

    /** initialize your data structure here. */
    public MinStack() {
        data = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        data.push(x);
        if(helper.isEmpty() || helper.peek() >= x)
            helper.push(x);
    }
    
    public void pop() {
        if(!data.isEmpty()){
            int top = data.pop();
            if(top == helper.peek()){
                if(helper.peek() == top)
                    helper.pop();
            }
        }
        // throw new RuntimeException("栈为空");
    }
    
    public int top() {
        if(!data.isEmpty())
            return data.peek();
        throw new RuntimeException("栈为空");
    }
    
    public int getMin() {
        if(!helper.isEmpty())
            return helper.peek();
        throw new RuntimeException("栈为空");
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */