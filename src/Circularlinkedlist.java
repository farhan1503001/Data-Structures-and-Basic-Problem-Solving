class nodelist{
	public int value;
	public nodelist next;
	public nodelist(int value) {
		 this.value=value;
		 this.next=null;
	}
	
}
public class Circularlinkedlist {
	private nodelist first;
	private nodelist last;
	public Circularlinkedlist() {
		this.first=null;
		this.last=null;
	}
	public void insert_first(int value)
	{
		nodelist newnode=new nodelist(value);
		if(this.first==null)
		{
			this.first=newnode;
			this.last=newnode;
		}
		else {
			newnode.next=this.first;
			this.first=newnode;	
		}
	}
	public void insert_last(int value) {
		nodelist newnode=new nodelist(value);
		if(this.first==null)
		{
			this.first=newnode;
			this.last=newnode;
		}
		else {
			this.last.next=newnode;
			this.last=newnode;
		}
	}
	public boolean is_empty() {
		return this.first==null;
	}
	public int delete_first() {
		int temp=Integer.MIN_VALUE;
		if(!this.is_empty()){
			temp=this.first.value;
			this.first=this.first.next;
			
		}
		return temp;
	}
	public void display_list() {
		nodelist curr=this.first;
		System.out.println();
		while(curr!=null)
		{
			System.out.print(curr.value+"\t");
			curr=curr.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circularlinkedlist list=new Circularlinkedlist();
		list.insert_first(11);
		list.insert_last(33);
		list.insert_last(22);
		list.insert_first(26);
		list.display_list();
		list.insert_first(90);
		list.insert_first(2);
		list.display_list();
	}

}
