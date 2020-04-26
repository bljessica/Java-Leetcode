class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] money = new int[11];
        for(int bill: bills){
            if(bill == 5) money[5]++;
            if(bill == 10){
                money[5]--;
                money[10] ++;
                if(money[5] < 0) return false;
            }
            if(bill == 20){
                if(money[10] > 0){
                    money[10]--;
                    money[5]--;
                    if(money[5] < 0) return false;
                }
                else{
                    money[5] -= 3;
                    if(money[5] < 0) return false;
                }
            }
        }
        return true;
    }
}