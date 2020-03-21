package employeeSystem;

// A class to represent a generic Employee
public abstract class Employee {
	private double hours;
	private double salary;
	private int vacationDays;
	private String vacForm;
	
    /**
	 * Constructor: to be used by subclasses to instantiate generic Employee
	 * Sets "zero'd" field values for all employees
	 */
	public Employee() {
		this.hours = 0;
		this.salary = 0.00;
		this.vacationDays = 0;
		this.vacForm = "";
	}

	/**
     * 2nd constructor: be used by subclasses to create a generic Employee instance 
     * 	to be modified as necessary with the given:
	 * @param hours
	 * @param salary
	 * @param vacationDays
	 */
	public Employee(double hours, double salary, int vacationDays) {
		this.hours = hours;
		this.salary = salary;
		this.vacationDays = vacationDays;
		this.vacForm = "";
		
	}

	/** Getter & Setter Methods
	 * @return the hours
	 */
	public double getHours() {
		return 40.0;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(double hours) {
		this.hours = hours;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return 40000.00;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the vacationDays
	 */
	public double getVacationDays() {
		return 10.0;
	}

	/**
	 * @param vacationDays the vacationDays to set
	 */
	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	/**
	 * @return the vacForm
	 */
	public String getVacForm() {
		return vacForm = "yellow";
	}

	/**
	 * @param vacForm the vacForm to set
	 */
	public void setVacForm(String vacForm) {
		this.vacForm = vacForm;
	}

	public String applyForVacation() {
       	return "Use the " + getVacForm() + " vacation form.";
    }

    public String showHours() {
        return "I work " + getHours() + " hours per week.";
    }

    public String showSalary() {
        return "My salary is " + getSalary();
    }

    public String showVacation() {
        return "I receive "+ ( getVacationDays() / 5 ) + " weeks vacation.";
    }
    // subclasses to adjust as necessary, adding additional "I statements"
    public String showAll() {
    	String talk = showHours() + "\n" + showSalary() + "\n" + showVacation();
    	return talk;
    };
    
    public String toString() {
    	return "System object: " + this.getClass() + "\nHours: " + this.getHours() +
    			"\tSalary: " + this.getSalary() + "\t\tVacation Days: " + this.getVacationDays()
    			+ "\tForm: "+ this.getVacForm();
    }
}
