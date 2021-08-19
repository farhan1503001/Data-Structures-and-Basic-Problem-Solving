import java.util.Scanner;

class ListNode {
	int data=0;
    ListNode next=null;
    public ListNode()
    {
    	this.data=0;
    }
    public ListNode(int data) {
		// TODO Auto-generated constructor stub
   	 this.data=data;
   	 this.next=null;
	}
}
public class LinkedListNode{
	
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
        //int line=sc.nextInt();
        ListNode head1=null;
        head1=insert_node(head1,1);
        head1=insert_node(head1,2);
        head1=insert_node(head1,5);
        display_list(head1);
        
        ListNode head2=null;
        head2=insert_node(head2,3);
        head2=insert_node(head2,4);
        head2=insert_node(head2,10);
        display_list(head2);
        ListNode new_head=merger(head1, head2);
        display_list(new_head);
	}
	public static ListNode merger(ListNode head1,ListNode head2)
	{
		ListNode curr2=head2;
		ListNode curr1=head1;
		if(curr2.data<head1.data)
		{
			ListNode temp=new ListNode(curr2.data);
			temp.next=head1;
			head1=temp;
			curr1=head1;
		}
		while(curr2!=null)
		{
				ListNode curr=curr1;
			    ListNode prev=curr;;
				while(curr!=null && curr.data<=curr2.data)
				{
					prev=curr;
					curr=curr.next;
				}
				prev.next=new ListNode(curr2.data);
				prev.next.next=curr;
			
			curr2=curr2.next;
		}
		
		return head1;
	}
	public static ListNode merge(ListNode head1,ListNode head2)
	{
		if(head1==null) {
			return head2;
		}
		else if(head2==null)
		{
			return head1;
		}
		if(head1.data<head2.data)
		{
			head1.next=merge(head1.next,head2);
			return head1;
		}
		else {
			head2.next=merge(head1,head2.next);
			return head2;
		}
	}
	public static void display_list(ListNode head)
	{
		ListNode curr=head;
		System.out.println();
        while(curr!=null)
        {
      	  System.out.print(curr.data +" ");
      	  curr=curr.next;
        }
	}
	
	public static ListNode insert_node(ListNode head,int data) {
		if(head==null)
		{
			return new ListNode(data);
		}
		ListNode curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new ListNode(data);
		//curr=curr.next;
		//curr.next=null;
		return head;
		
	}
}
