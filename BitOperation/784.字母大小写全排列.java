class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        char[] str = S.toCharArray();
        change(res, str, 0);
        return res;
    }

    public void change(List<String> res, char[] str, int index){
        if(index == str.length){
            res.add(String.valueOf(str));
            return;
        }
        change(res, str, index + 1);
        if(str[index] < '0' || str[index] > '9'){
            str[index] ^= 1 << 5;//大写字母与小写字母相互转换
            change(res, str, index + 1);
        }
    }
}