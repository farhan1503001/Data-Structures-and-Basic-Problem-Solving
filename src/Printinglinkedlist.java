import java.util.Scanner;
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
	public static boolean compare_linkedlists(SinglyLinkedListNode head1,SinglyLinkedListNode head2)
	{
		SinglyLinkedListNode curr1=head1;
        SinglyLinkedListNode curr2=head2;
        boolean status=true;
        int len1=0,len2=0;
        while(curr1!=null)
        {
            curr1=curr1.next;
            len1++;
        }
        while(curr2!=null)
        {
            curr2=curr2.next;
            len2++;
        }
        if(len1!=len2)
        {
            return false;
        }
        else{
            curr1=head1;
            curr2=head2;
            while(curr1!=null||curr2!=null)
            {
                if(curr1.data!=curr2.data)
                {
                    status=false;
                    break;
                }
                curr1=curr1.next;
                curr2=curr2.next;
            }
            if(status)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
	}
	public static void print_reverse(SinglyLinkedListNode head)
	{
		if(head==null)
		{
			return;
		}
		print_reverse(head.next);
		System.out.print(head.data+" ");
	}
	public static SinglyLinkedListNode reverse_list(SinglyLinkedListNode head) {
		   if(head==null)
		   {
			   return null;
		   }
		   else if(head.next==null)
		   {
			   return head;
		   }
		   else {
			   SinglyLinkedListNode curr=head;
			   SinglyLinkedListNode prev=null;
			   System.out.println("Reverse Linked list test \n");
			   while(curr!=null)
			   {  
				   SinglyLinkedListNode temp=prev;
				   /*
				   if(temp!=null) {
					   System.out.print(temp.data+" ");
				   }
				   */
				   prev=curr;
				   //System.out.print(prev.data+" ");
				   curr=curr.next;
				   prev.next=temp;
			   }
			   System.out.println(prev.data);
			   System.out.println(prev.next.data);
			   return prev;
		   }
	}
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
          n_head=deleteposition(n_head,0);
          display_list(n_head);
          System.out.println();
          print_reverse(n_head);
          System.out.println("Reversed Linked List");
          SinglyLinkedListNode newhead=reverse_list(n_head);
          display_list(newhead);
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
	public static SinglyLinkedListNode deleteposition(SinglyLinkedListNode head,int position)
	{
		SinglyLinkedListNode curr=head;
		if(curr.next==null)
		{
			return null;
		}
		else if(position==0)
		{
			SinglyLinkedListNode temp=curr.next;
			curr.next=null;
			curr=temp;
			return curr;
		}
		else {
			for(int i=0;i<position-1;i++)
			{
				curr=curr.next;
			}
			SinglyLinkedListNode temp=curr.next.next;
			curr.next=null;
			curr.next=temp;
			return head;
		}
		
	}

}
