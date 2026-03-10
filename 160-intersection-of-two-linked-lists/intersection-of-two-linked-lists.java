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
     int len1=size(headA);
     int len2=size(headB);
     ListNode temp1=headA;
     ListNode temp2=headB;
     while(len1>len2)
     {
       temp1=temp1.next;
       len1--;
     }
     while(len2>len1)
     {
        temp2=temp2.next;
        len2--;
     }
     while(temp1!=temp2)
     {
        temp1=temp1.next;
        temp2=temp2.next;
     }
     return temp1;
    }
    public int size(ListNode head)
    {
        ListNode temp=head;
        int s=0;
        while(temp!=null)
        {
            s++;
            temp=temp.next;
        }
        return s;
    }
}