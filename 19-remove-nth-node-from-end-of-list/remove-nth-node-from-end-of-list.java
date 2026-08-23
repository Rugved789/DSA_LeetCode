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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 1;
        ListNode tail = head;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        int lastNode = len-n;
         if (lastNode == 0) {
            return head.next;
        }
        ListNode temp = head;
        for(int i=1;i<lastNode;i++){
            temp=temp.next;
        }  
        temp.next=temp.next.next;
        return head;
    }
}