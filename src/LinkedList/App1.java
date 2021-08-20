package LinkedList;

import java.util.ArrayList;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee>employelist=new ArrayList<Employee>();
		employelist.add(new Employee("Jane","Davidson",11));
		employelist.add(new Employee("Robert","Bruce",12));
		employelist.add(new Employee("Hervy","Winstein",13));
		employelist.add(new Employee("Jackob","Adams",14));
		EmployeeLinkedList linklist=new EmployeeLinkedList();
		employelist.forEach(employee->linklist.addToFront(employee));
		linklist.print_list();
	}

}
