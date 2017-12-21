public class Employee implements Comparable<Employee>
{
	private String lastName; 
	private String firstName; 
	private String department;
	
	public Employee(String lastName, String firstName, String department) 
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.department = department;
	}

	public Employee(String lastName, String firstName) 
	{
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getDepartment() 
	{
		return department;
	}

	public void setDepartment(String department) 
	{
		this.department = department;
	}
	
	/*
	 * It will sort employee by last name, the first name and then deparment. 
	 * department can be null. 
	 */
	@Override
	public int compareTo(Employee anotherEmployee) 
	{
		if(anotherEmployee == null)
			throw new NullPointerException("Employee passed  is null");
		if(this.lastName.equals(anotherEmployee.getLastName()))	
		{
			if(this.firstName.equals(anotherEmployee.getFirstName()))
			{
				if(this.department != null && anotherEmployee.getDepartment() != null)
					return this.department.compareTo(anotherEmployee.getDepartment());
				else if(this.department != null && anotherEmployee.getDepartment() == null)
					return 1;
				else 
					return -1;
			}
			else
				return this.firstName.compareTo(anotherEmployee.getFirstName());
		}
		else
			return this.lastName.compareTo(anotherEmployee.getLastName());
	} 
	
	/*
	 * The method is used to print Employee in format
	 */
	@Override
	public String toString()
	{
		return String.format("%-20s %-20s %10s", this.lastName, this.firstName, this.department).toString();
	}
	
	

}
