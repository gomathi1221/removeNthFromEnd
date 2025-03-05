       
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode curr1=head;
        if(size(head)==n){
            head=head.next;
            return head;
        }
       int c=size(head)-n;
       for(int i=1;i<c;i++){
        curr1=curr1.next;
       }
       curr1.next=curr1.next.next;
       return head;


    }
  
   
    
    
    public int size(ListNode head){
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }

    
}