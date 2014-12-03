package act06;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Employee e = new Employee(01, "Perez", "Rodrigo", "Trabajo",
				"12/12/2012", 3000, 29, 1);

		Employee e2 = new Employee(02, "Esteban", "Benito", "NTrabajo",
				"11/12/2010", 200, 12, 2);

		Employee e3 = new Employee(03, "Aster", "Ast", "Strabajo",
				"01/01/1900", 1000, 34, 1);

		Employee e4 = new Employee(04, "Paco", "xD", "Ntrabajo", "01/01/1400",
				1000, 22, 1);

		Employee e5 = new Employee(05, "Pablo", "perez", "Ttrabajo",
				"01/01/1100", 600, 11, 2);

		EmployeeManager em = new EmployeeManager();

		em.addEmployee(e);
		em.addEmployee(e2);
		em.addEmployee(e3);
		em.addEmployee(e4);
		em.addEmployee(e5);
		em.listEmployee();

		// id del empleado y el nuevo salario que se quiere modificar
		System.out.println(em.getEmployee(2, 2432));
		// media de departamentos, pon el numero de departamento en parametro
		em.averagePaymentDepartment(2);



	}

}