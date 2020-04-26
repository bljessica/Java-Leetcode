class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set = new HashSet<>();
        for(int[] o: obstacles)
            set.add(o[0] + "," + o[1]);
        int flag = 1;//方向初始为向北
        int x = 0, y = 0, max = 0;
        for(int command: commands){
            switch(command){
                case -2:
                    if(flag == 1) flag = 4;
                    else flag -= 1;
                    break;
                case -1: 
                    if(flag == 4) flag = 1;
                    else flag += 1;
                    break;
                default:
                    for(int i = 0; i < command; i++){
                        if(flag == 1){
                            y += 1;
                            if(set.contains(x + "," +y)) y -= 1;
                            max = Math.max(x * x + y * y, max);
                        }
                        else if(flag == 2){
                            x += 1;
                            if(set.contains(x + "," +y)) x -= 1;
                            max = Math.max(x * x + y * y, max);
                        }
                        else if(flag == 3){
                            y -= 1;
                            if(set.contains(x + "," +y)) y += 1;
                            max = Math.max(x * x + y * y, max);
                        }
                        else if(flag == 4){
                            x -= 1;
                            if(set.contains(x + "," +y)) x += 1;
                           max = Math.max(x * x + y * y, max);
                        }
                    }
            }
        }
        return max;
    }
}