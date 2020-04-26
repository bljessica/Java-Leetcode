/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int length = 0, res = 0; 
        ListNode p = head;
        while(p != null){
            length++;
            p = p.next;
        }
        p = head;
        while(p != null){
            if(p.val == 1)
                res += Math.pow(2, length - 1);
            p = p.next;
            length--;
        }
        return res;
    }
}