class Solution {
    public int trap(int[] height) {
        if(height.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        int sum = 0;//总水量
        int current = 0;//指针
        while(current < height.length){
            while(!stack.isEmpty() && height[current] > height[stack.peek()]){
                int h = height[stack.peek()];
                stack.pop();
                if(stack.isEmpty()) 
                    break;
                int distance = current - stack.peek() - 1;//两堵墙之间的距离
                int min = Math.min(height[current], height[stack.peek()]);
                sum += distance * (min - h);
                
            }
            stack.push(current);
            current ++; 
        }
        return sum;
    }
}