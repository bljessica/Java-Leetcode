class Solution {
    int[] days, costs;
    Integer[] money;
    int[] duration = {1, 7, 30};
    public int mincostTickets(int[] days, int[] costs) {
        this.days = days;
        this.costs = costs;
        money = new Integer[days.length];
        return dp(0);
    }

    /**从days数组下标为i的元素对应的日期到最后一天的消费金额*/
    public int dp(int i){
        if(i >= days.length) return 0;
        if(money[i] != null) return money[i];
        money[i] = Integer.MAX_VALUE;
        int j = i;
        for(int k=0; k<duration.length;k++){
            while(j<days.length && (days[j]-days[i]) < duration[k])
                j++;
            money[i] = Math.min(money[i], dp(j) + costs[k]);
        }
        return money[i];
    }
}