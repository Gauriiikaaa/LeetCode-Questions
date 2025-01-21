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
    public boolean isPalindrome(ListNode head) {
         ListNode midd = mid(head);
         ListNode headSecond = reverseList(midd);
         ListNode rev = headSecond;
         while(head != null && headSecond != null)
         {
            if(head.val != headSecond.val)
            {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
         }
         reverseList(rev);
         return (head == null || headSecond == null);
    }
    public ListNode mid(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
     public ListNode reverseList(ListNode head) {
        if (head == null)
        return head;

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null)
        {
            present.next = prev;
            prev = present;
            present = next;
            if(next != null)
            next = next.next;

        }
        return prev;
    }
}