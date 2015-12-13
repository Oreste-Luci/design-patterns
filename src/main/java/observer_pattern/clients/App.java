package observer_pattern.clients;

import observer_pattern.observers.HRDepartment;
import observer_pattern.observers.IObserver;
import observer_pattern.observers.PayrollDepartment;
import observer_pattern.subjects.EmployeeManagementSystem;

public class App {

	public static void main(String [] args){
		
		IObserver payroll = new PayrollDepartment();
		IObserver hrSystem = new HRDepartment();
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		
		ems.registerObserver(payroll);
		ems.registerObserver(hrSystem);
		
//		 Employee bob = new Employee("Bob", new Date(), 35000, true);
//		 ems.hireNewEmployee(bob);
		 
		 
		ems.modifyEmployeeName(5, "Imtiaz");
	 // ems.modifyEmployeeName(2, "Imtiaz");
	}
}
