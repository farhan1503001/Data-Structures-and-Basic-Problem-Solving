package LinkedList;

public class EmployeeLinkedList {
	
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	public EmployeeLinkedList() {
		this.head=null;
	}
	public void addToFront(Employee emp)
	{
		EmployeeNode newnode=new EmployeeNode(emp);
		newnode.setNext(head);
		head=newnode;
		size++;
	}
	
	public void addToLast(Employee emp) {
		EmployeeNode newnode=new EmployeeNode(emp);
		EmployeeNode curr=newnode;
		while(curr.getNext()==null)
		{
			curr=curr.getNext();
		}
		curr.setNext(newnode);
		curr=curr.getNext();
		tail=curr;
		size++;
	}
	public int getSize() {
		return this.size;
	}
	public boolean is_empty()
	{
		return this.head==null;
	}
	public void print_list() {
		EmployeeNode curr=this.head;
		System.out.println();
		while(curr!=null)
		{
			System.out.print(1+curr.getEmp().getFirstname()+" "+curr.getEmp().getLastname());
			curr=curr.getNext();
		}
	}

}
