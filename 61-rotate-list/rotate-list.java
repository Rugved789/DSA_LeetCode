/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail = head;
        int len = 1;
        if(head==null || head.next==null || k==0){return head;}
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        tail.next=head;
        k=k%len;
        int lastnode = len-k;
        ListNode newTail = head;
        for(int i=1;i<lastnode;i++){
            newTail=newTail.next;
        }
        ListNode newHead=newTail.next;
        newTail.next=null;
        return newHead;
    }
}