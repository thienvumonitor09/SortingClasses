import java.util.*;
/**
 * The program creates instances of Employee Class 
 * and sorts List<Employee> by last name, then first name and then deparment.
 * It can print list by ascending and descending.
 * 
 * @author Vu Nguyen
 *
 */
public class SortingClasses {

	public static void main(String[] args) 
	{
		//Create employeeList and add instances
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("Smith","A","Finance"));
		employeeList.add(new Employee("Johnson","B","Operation"));
		employeeList.add(new Employee("Williams","C","R&D"));
		employeeList.add(new Employee("Jones","D","HR"));
		employeeList.add(new Employee("Brown","E"));
		employeeList.add(new Employee("Davis","F","HR"));
		employeeList.add(new Employee("Davis","F"));
		employeeList.add(new Employee("Wilson","G","Marketing"));
		
		//Print employee list in ascending order.
		System.out.println("List is sorted in ascending order:");
		Collections.sort(employeeList);
		printEmployeeList(employeeList);
		
		//Print employee list in descending order.
		System.out.println("List is sorted in descending order:");
		Collections.reverse(employeeList);
		printEmployeeList(employeeList);
	}
	
	private static void printEmployeeList(List<Employee> employeeList)
	{
		System.out.printf("%-20s %-20s %10s %n", "Last Name", "First Name", "Deparment");	
		for(Employee e : employeeList) 
		{
			System.out.println(e.toString());
		}
		System.out.println();
	}
}
