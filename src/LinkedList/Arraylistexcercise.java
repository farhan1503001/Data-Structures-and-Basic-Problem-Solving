package LinkedList;

import java.util.ArrayList;

public class Arraylistexcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee>employelist=new ArrayList<Employee>();
		employelist.add(new Employee("Jane","Davidson",11));
		employelist.add(new Employee("Robert","Bruce",12));
		employelist.add(new Employee("Hervy","Winstein",13));
		employelist.add(new Employee("Jackob","Adams",14));
		//printing employee list
		employelist.forEach(employe->System.out.println(employe.getFirstname()+" "+employe.getLastname()));
		employelist.add(1,new Employee("Steve","Bannon",17));
		System.out.println(employelist.get(3));
		employelist.forEach(employe->System.out.println(employe.getFirstname()+" "+employe.getLastname()));
		
		Employee[] employeearray=employelist.toArray(new Employee[employelist.size()]);
		System.out.println();
		for(Employee employee:employeearray)
		{
			System.out.println(employee.getFirstname());
		}
		System.out.println(employelist.contains(new Employee("Horasio", "Mendez", 3)));
	}

}
