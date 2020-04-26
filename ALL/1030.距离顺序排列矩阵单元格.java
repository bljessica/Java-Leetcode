class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] res = new int[R*C][2];
        int index = 0;
        for(int i = 0; i<R; i++)
            for(int j = 0; j<C; j++){
                int[] xy = {i, j};
                res[index++] = xy;
            }
        Arrays.sort(res, new Comparator<int[]>(){
            @Override
            public int compare(int[] s1, int[] s2){
                int dist1 = Math.abs(s1[0] - r0) + Math.abs(s1[1] - c0);
                int dist2 = Math.abs(s2[0] - r0) + Math.abs(s2[1] - c0);
                return dist1 - dist2;
            }
        });
        return res;
    }
}