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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode f = list1;
        ListNode s = list2;
        ListNode head = new ListNode();
        ListNode temp = head;
        while(f != null && s != null)
        {
            if(f.val < s.val)
            {
                ListNode a = new ListNode(f.val);
                temp.next = a;
                temp = a;
                f = f.next;
            }
            else{
                ListNode a = new ListNode(s.val);
                temp.next  = a;
                temp = a;
                s = s.next;

            }
        }
        if(f == null)
        {
            temp.next = s;
        }
        else{
            temp.next = f;
        }
        return head.next;
    }
}