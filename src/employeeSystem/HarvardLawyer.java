/**
 * HarvardLawyer.java subclass
 */
package employeeSystem;

/**
 * @author Nora P.
 * Description: a HarvardLawyer object represents an instance of a Lawyer, but also an instance
 * 				of Employee --> an example of multi-tiered inheritance hierarchy
 * 				uses & overrides instance methods to modify the subclass state and behavior
 */
public class HarvardLawyer extends Lawyer {

	/**
	 * Constructs a new HarvardLawyer object
	 */
	public HarvardLawyer() {
		super(); // constructor for Lawyer --> Employee default values
	}
	
	// override: H.Lawyers earn 20% more than standard lawyers
	public double getSalary() {
		return super.getSalary() + (super.getSalary() * .2); 
	}
	
	// override: H.Lawyers have 3 more days than standard lawyers
	public double getVacationDays() {
		return super.getVacationDays() + 3;
	}
	
	// override: H.Lawyers need 4x the lawyer vacation form
	public String getVacForm() {
		String count = "";
		for (int i = 0; i < 4; i++) {
			count += super.getVacForm();
		}
		return count;
	}

}
