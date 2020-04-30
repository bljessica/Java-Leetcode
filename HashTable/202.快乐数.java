class Solution {
    public boolean isHappy(int n) {
        Set<Integer> got = new HashSet<>();
        while(n != 1 && !got.contains(n)){
            got.add(n);
            n = getSumOfSquares(n);
        }
        if(n != 1) return false;
        return true;
    }

    public int getSumOfSquares(int n){
        int sumOfSquares = 0;
        while(n != 0){
            int tmp = n%10;
            sumOfSquares += tmp*tmp;
            n /= 10;
        }
        return sumOfSquares;
    }
}