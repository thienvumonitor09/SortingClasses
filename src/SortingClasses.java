import java.util.*;

public class SortingClasses {

	public static void main(String[] args) 
	{
		//List<Employee> employeeList = null;
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee("Nguyen","Vu","op"));
		employeeList.add(new Employee("A","Vu","op"));
		employeeList.add(new Employee("A","Bu","op"));
		employeeList.add(new Employee("A","Bu","kp"));
		employeeList.add(new Employee("A","Bu"));
		employeeList.add(new Employee("A","Vu"));
		employeeList.add(new Employee("D","Vu","op"));
		
		System.out.println("List is sorted in ascending order:");
		Collections.sort(employeeList);
		System.out.println(employeeList);
		
		System.out.println("List is sorted in descending order:");
		Collections.reverse(employeeList);
		System.out.print(employeeList);
		

	}

}
