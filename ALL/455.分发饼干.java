class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //贪心算法，先对数组进行从小到大排序
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0, cookie = 0;
        while(child < g.length && cookie < s.length){
            if(s[cookie] >= g[child]) child++;
            cookie++;
        }
        return child;
    }
}