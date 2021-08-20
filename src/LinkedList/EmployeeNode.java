package LinkedList;

public class EmployeeNode {
	private Employee emp;
	private EmployeeNode next;
	
	public EmployeeNode(Employee node)
	{
		this.emp=node;
		this.next=null;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}
	

}
