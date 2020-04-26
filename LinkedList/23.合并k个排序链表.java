/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        Queue<ListNode> queue = new PriorityQueue<ListNode>(new         Comparator<ListNode>(){
            @Override
            public int compare(ListNode l1, ListNode l2){
                if(l1.val < l2.val) return -1;
                if(l1.val == l2.val) return 0;
                else return 1;
            }
        });
        //将所有链表加入优先队列
        for(ListNode list:lists){
            if(list != null){
                queue.add(list);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while(!queue.isEmpty()){
            ListNode tmp = queue.poll();
            p.next = tmp;
            p = p.next;
            if(tmp.next != null)queue.add(tmp.next);
        }
        return dummy.next;
    }
}