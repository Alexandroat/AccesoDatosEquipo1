package act06;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee(01, "Perez", "Rodrigo", "Trabajo",
				"12/12/2012", 3000, 29, 9);
		Employee e2 = new Employee(02, "Esteban", "Benito", "NTrabajo",
				"11/12/2010", 200, 12, 5);
		Employee e3 = new Employee(04, "Aster", "Ast", "Strabajo",
				"01/01/1900", 3400, 34, 52);
		
	
		
		EmployeeManager em = new EmployeeManager();
		
		em.addEmployee(e);
		em.addEmployee(e2);
		em.addEmployee(e3);
		em.listEmployee();
	
		

	}

}
