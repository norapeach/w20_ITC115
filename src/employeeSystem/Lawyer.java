package employeeSystem;

// represents a Lawyer object of type Employee
public class Lawyer extends Employee {	
	
	/**
	 * constructs a Lawyer object, which is a representation of Employee
	 */
	public Lawyer() {
		super(); // constructs Employee instance with zero'd out fields
	}
	//override: lawyer form is pink
	public String getVacForm() {
		return "pink";
	}
	//override: set vacation days to 5 + Employee amount
	public double getVacationDays() {
		return super.getVacationDays() + 5;
	}
	//override: lawyer ears 10000 more than Employee
	public double getSalary() {
		return super.getSalary() + 10000;
	}

    public String sue() {
        return "I'll see you in court!";
    }
}
