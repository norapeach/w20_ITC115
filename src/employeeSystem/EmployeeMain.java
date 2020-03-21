/** EmployeeMain.java
 * 
 * @author Nora P.
 * ITC 115 3/20/2020
 * Building Java Programs e5; Ch9 ex 2, 3
 * Description: client code tests the employeeSystem utilizing an abstract class Employee
 * and inheritance. The following tests demonstrate encapsulation & polymorphism by 
 * initializing an array of Employee instances, filling it with a unique object from each 
 * subclass. For loop outputs the overridden toString() method for each Employee subclass.
 * 
 * To do: refactor classes to include validation conditions for setter methods e.g.
 * exceptions and minimum values. 
 */


package employeeSystem;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {new Janitor(), new Secretary(), new Lawyer(), 
        						new HarvardLawyer()};
        String janitorTalk = "What the janitor thinks while cleaning: ";
        String lawyerTalk = "What the lawyer thinks while driving: ";
        
        
        // print toString() information about each employee
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            System.out.println();
            System.out.println(employees[i].showAll());
            System.out.println();
        }
        // each one should talk, build a string
        System.out.println(janitorTalk + ((Janitor) employees[0]).clean());
        System.out.println(lawyerTalk + (((Lawyer) employees[2]).sue()));
        System.out.println("Harvard Lawyers: " + employees[3].applyForVacation());
    }
    	
    	
    }
