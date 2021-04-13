//206. Reverse Linked List
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
    public ListNode reverseList(ListNode head) {
     if(head==null)return null;
        ListNode prev= null;
        ListNode n;
        while(head!=null){
            n=head.next;
            head.next=prev;
            prev=head;
            head=n;
        }
        return prev;
    }
}