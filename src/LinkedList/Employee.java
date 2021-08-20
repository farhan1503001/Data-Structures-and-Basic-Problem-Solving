package LinkedList;

public class Employee {
	private String firstname;
	private String lastname;
	private int id;
	public Employee(String name1,String name2,int id)
	{
		this.firstname=name1;
		this.lastname=name2;
		this.id=id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
