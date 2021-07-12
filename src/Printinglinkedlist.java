import java.util.*;
class SinglyLinkedListNode {
    int data=0;
    SinglyLinkedListNode next=null;
    public SinglyLinkedListNode()
    {
    	this.data=0;
    }
    public SinglyLinkedListNode(int data) {
		// TODO Auto-generated constructor stub
   	 this.data=data;
	}
}
public class Printinglinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int line=sc.nextInt();
          SinglyLinkedListNode head=null;
          SinglyLinkedListNode prev = null;
          for(int i=0;i<line;i++)
          {   
        	  int data=sc.nextInt();
        	  SinglyLinkedListNode newnode=new SinglyLinkedListNode(data);
        	  if(i==0) {
        		  head=newnode;
        		  prev=newnode;
        		  prev.next=null;
        	  }
        	  prev.next=newnode;
        	  prev=newnode;
          }
          display_list(head);
          add_tail_node(head,50);
          display_list(head);
          SinglyLinkedListNode nhead=add_head_node(head, 500);
          display_list(nhead);
          int post=0;
          SinglyLinkedListNode n_head=insert_position(nhead,post,50);
          display_list(n_head);
          //display_list(n_head);
          sc.close();
	}
	public static void display_list(SinglyLinkedListNode head)
	{
		SinglyLinkedListNode curr=head;
		System.out.println();
        while(curr!=null)
        {
      	  System.out.print(curr.data +" ");
      	  curr=curr.next;
        }
	}
	public static void add_tail_node(SinglyLinkedListNode head,int data)
	{
		SinglyLinkedListNode curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new SinglyLinkedListNode(data);
		curr=curr.next;
		curr.next=null;
	}
	public static SinglyLinkedListNode add_head_node(SinglyLinkedListNode head,int data)
	{
		SinglyLinkedListNode curr=new SinglyLinkedListNode(data);
		curr.next=head;
		head=curr;
		return head;
	}
	public static SinglyLinkedListNode insert_position(SinglyLinkedListNode head,int position,int data)
	{
		SinglyLinkedListNode curr=head;
		if(head==null)
		{
			SinglyLinkedListNode newnode=new SinglyLinkedListNode(data);
            return newnode;
		}
		else if(position==0)
		{
			SinglyLinkedListNode header=new SinglyLinkedListNode(data);
            header.next=head;
            return header;
		}
		else {
			for(int i=0;i<position-1;i++)
			{
				curr=curr.next;
			}
			 
			System.out.println();
			System.out.print(curr.data);
			SinglyLinkedListNode temp=curr.next;
			
			curr.next=new SinglyLinkedListNode(data);
			curr=curr.next;
			curr.next=temp;
			return head;
		}
		
	}

}
