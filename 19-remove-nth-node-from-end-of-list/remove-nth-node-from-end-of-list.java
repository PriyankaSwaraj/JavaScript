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
        if(head.next==null)
        {
            return null;
        }
     int size=0;
     ListNode temp=head;
     while(temp!=null)
     {
        temp=temp.next;
        size++;
     }
     int i=1,n1=size-n;
    if(n1==0)
    {
        return head.next;
    }
     ListNode curr=head;
     while(i<n1)
     {
        curr=curr.next;
        i++;
     }
     curr.next=curr.next.next;
     return head;
    }
}