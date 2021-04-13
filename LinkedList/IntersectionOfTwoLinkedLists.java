//160. Intersection of Two Linked Lists
//Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
//For example, the following two linked lists begin to intersect at node c1:

//BRUTE FORCE SOLUTION USING EXTRA SPACE
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hs = new HashSet<ListNode>();
        
        
        while(headA!=null){
            hs.add(headA);
            headA= headA.next;
        }
           while(headB!=null){
            if(!hs.contains(headB)){
                hs.add(headB);
                headB = headB.next;
            }else{
                return headB;
            }
        }
        return null;
    }
}


//OPTIMIZED SOLUTION