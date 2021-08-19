class doublenode{
	public int value;
	public doublenode next;
	public doublenode prev;
	public doublenode(int value)
	{
		this.value=value;
		this.next=null;
		this.prev=null;
	}
}
public class Doublylinkedlist {
	doublenode first;
	doublenode last;
	public Doublylinkedlist()
	{
		this.first=null;
		this.last=null;
	}
	public boolean is_empty() {
		return this.first==null;
	}
	public void insert_first(int value)
	{
		doublenode newnode=new doublenode(value);
		if(is_empty())
		{
			this.first=newnode;
			this.last=newnode;
		}
		else {
			newnode.next=this.first;
			this.first.prev=newnode;
			this.first=newnode;
		}
	}
	public void insert_last(int value)
	{
		doublenode newnode=new doublenode(value);
		if(is_empty())
		{
			this.first=newnode;
			this.last=newnode;
		}
		else {
			this.last.next=newnode;
			newnode.prev=this.last;
			this.last=this.last.next;
		}
	}
	public void print_backward() {
		doublenode curr=this.last;
		while(curr!=null)
		{
			System.out.print(curr.value+"\t");
			curr=curr.prev;
		}
	}
	public void print_forward() {
		doublenode curr=this.first;
		System.out.println();
		while(curr!=null)
		{
			System.out.print(curr.value+"\t");
			curr=curr.next;
		}
	}
	public doublenode delete_first() {
		doublenode temp=this.first;
		if(this.first.next==null) //single element in list
		{
			this.last=null;
			this.first=null;
		}
		else {
			this.first.next.prev=null;//remove backlink from next element
			this.first=this.first.next;
		}
		return temp;
	}
	public doublenode delete_last() {
		doublenode temp=this.last;
		if(this.first.next==null)
		{
			this.first=null;
			this.last=null;
		}
		else {
			this.last.prev.next=null;
			this.last=this.last.prev;
		}
		return temp;
	}
	public boolean insertAfter(int key,int value) {
		doublenode curr=this.first;
		while(curr.value!=key)
		{
			curr=curr.next;
			if(curr==null)
			{
				return false;
			}
		}
		doublenode newnode=new doublenode(value);
		if(this.last==curr)
		{
			curr.next=null;
			this.last.next=newnode;
		}
		else {
			newnode.next=curr.next;
			curr.next.prev=newnode;
		}
		newnode.prev=curr;
		curr.next=newnode;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doublylinkedlist lister=new Doublylinkedlist();
		lister.insert_first(11);
		lister.insert_first(33);
		lister.insert_last(21);
		lister.insert_last(102);
		lister.insert_last(8);
		lister.print_backward();
		lister.print_forward();
	}

}
