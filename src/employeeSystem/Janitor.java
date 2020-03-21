/**
 * Janitor.java 
 */
package employeeSystem;

/**
 * @author Nora P.
 * Description: a Janitor object "is-a"n Employee or represents an instance of Employee
 * 				uses & overrides instance methods to modify the subclass state
 */

public class Janitor extends Employee {

	/**
	 * basic constructor: instantiates Janitor with default employee state
	 */
	public Janitor() {
		super();
	}

	/**
	 * 2nd constructor: instantiates Janitor with given values
	 * Could maybe pass overridden methods as parameters to instantiate with janitor state
	 * @param hours
	 * @param salary
	 * @param vacationDays
	 */
	public Janitor(double hours, double salary, int vacationDays) {
		super(hours, salary, vacationDays);
		
	}
	
	// override: Janitors work twice as much as general Emp.
	public double getHours() {
		return super.getHours() * 2;
	}
	// override: Janitors work twice as much as general Emp.
	public double getSalary() {
		return super.getSalary() - 10000;
	}
	// override: Janitors get half the days vacation
	public double getVacationDays() {
		return (super.getVacationDays() / 5);
		
	}
	
	// new method: clean
	public String clean() {
		return "Workin' for the man.";
	}
	
	

}
