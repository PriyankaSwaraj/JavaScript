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
    ListNode temp=middle(head);
    ListNode second=reverse(temp);
    ListNode first=head;
    while(first!=temp)
    {
        if(second.val!=first.val)
        {
            return false;
        }
        first=first.next;
        second=second.next;
    }
    return true;    
    }
    public ListNode middle(ListNode head)
    {
       int size=0;
       ListNode temp=head;
       while(temp!=null)
       {
        temp=temp.next;
        size++;
       }
       size /=2;
       temp=head;
       while(size>0)
       {
         temp=temp.next;
         size--;
       }
       return temp;
    }
    public ListNode reverse(ListNode head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null)
        {
            ListNode nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        head.next=null;
        return prev;
    }
}