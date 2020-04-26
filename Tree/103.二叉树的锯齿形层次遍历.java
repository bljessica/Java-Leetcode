/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode> evenLevel = new Stack<>();
        Stack<TreeNode> oddLevel = new Stack<>();
        List<List<Integer>> res = new ArrayList<>();
        evenLevel.push(root);//第一层i=0
        for(int i = 0; !evenLevel.isEmpty() || !oddLevel.isEmpty(); i++){
            List<Integer> cur = new ArrayList<>();
            if((i & 1) == 0){//偶数层
                while(!evenLevel.isEmpty()){
                    TreeNode pop = evenLevel.pop();
                    if(pop != null){
                        cur.add(pop.val);
                        oddLevel.push(pop.left);
                        oddLevel.push(pop.right);
                        
                    }
                }
            }
            else{//奇数层
                while(!oddLevel.isEmpty()){
                    TreeNode pop = oddLevel.pop();
                    if(pop != null){
                        cur.add(pop.val);
                        evenLevel.push(pop.right);
                        evenLevel.push(pop.left);
                        
                    }
                }
            }
            if(!cur.isEmpty())
                res.add(cur);
        }
        return res;
    }
}