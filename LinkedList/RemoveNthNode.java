//19. Remove Nth Node From End of List
//Given the head of a linked list, remove the nth node from the end of the list and return its head.
//Follow up: Could you do this in one pass?
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]

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
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count =0;
        while(count<=n){
            fast = fast.next;
            count++;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}