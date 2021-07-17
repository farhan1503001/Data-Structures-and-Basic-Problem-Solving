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
        head1=insert_node(head1,3);
        head1=insert_node(head1,5);
        head1=insert_node(head1,6);
        display_list(head1);
        
        ListNode head2=null;
        head2=insert_node(head2,1);
        head2=insert_node(head2,2);
        head2=insert_node(head2,10);
        display_list(head2);
        ListNode new_head=merge(head1, head2);
        display_list(new_head);
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
