class Solution {
    public int countPrimeSetBits(int L, int R) {
        boolean[] flag = new boolean[33];//整数最多有32个1
        for(int i = 2; i < 33; i++)
            if(isPrime(i)) flag[i] = true;
        int res = 0;
        for(int i = L; i <= R; i++){
            int bits = Integer.bitCount(i);
            if(flag[bits]) res++;
        }
        return res;
    }

    //判断2-32的质数
    public boolean isPrime(int num){
        for(int j = (num == 2 ? 3 : 2); j <= Math.sqrt(num) + 1; j++)
            if(num % j == 0) return false;
        return true;
    }
}