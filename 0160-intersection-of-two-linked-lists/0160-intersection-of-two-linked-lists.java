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
        int lenA  = 0; 
        int lenB = 0;
        ListNode tailA = headA;
        ListNode tailB = headB;
        while(tailA != null)
        {
            lenA ++;
            tailA = tailA.next;
        }
        while(tailB != null)
        {
            lenB ++;
            tailB = tailB.next;
        }
        tailA = headA;
        tailB = headB;
        if(lenA > lenB)
        {
            int step = lenA - lenB;
            for(int i = 1 ; i <= step; i++)
            {
               tailA = tailA .next;
            }
        }
        else{
            int step = lenB - lenA;
            for(int i = 1 ; i<= step; i++)
            {
                tailB =  tailB.next;
            }
        }
        while(tailA !=  tailB )
        {
            tailA = tailA.next;
             tailB =  tailB.next;
        }
        return tailA;
    }
}