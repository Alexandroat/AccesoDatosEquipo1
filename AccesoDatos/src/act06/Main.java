package act06;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		EmployeeManager em = new EmployeeManager();

		em.dummy(10);
		// em.imprimirFicheroEmployee(EmployeeManager.FILE);
		 System.out.println(em.getEmployee(8));
	}

}
