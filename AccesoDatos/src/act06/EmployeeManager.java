package act06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeManager {

	public static final String path = "./resources/employee.bin";
	private static final ArrayList<Employee> employeeList = new ArrayList();

	// Crear un fichero con al menos 10 empleados de prueba de tres
	// departamentos diferentes
	private void dummy() {

	}

	// Load binary file in memory
	public void LoadFile() {
	}

	// crea un método que liste un empleado por su id.

	public Employee getEmployee(int idEmp) {
		return null;
	}

	// Crear un método que modifique el salario de un empleado con el id que
	// recibe y el nuevo salario por parámetro

	public boolean getEmployee(int idEmp, double newSalary) {
		return false;
	}

	// Crear un método que elimine un empleado con el id que recibe por
	// parámetro
	public boolean deleteEmployee(int id) {
		return false;
	}

	// Crear un método que añada un nuevo empleado recibiendo los datos por
	// parámetro
	public boolean addEmployee(Employee e) {
		employeeList.add(e);
		return true;
	}

	/**
	 * @author Alejandro Acebedo
	 * Devuelve una lista con todos los empleados ordenados
	 * @return ArrayList employeeList
	 */
	
	public ArrayList<Employee> listEmployee() {
		
		Collections.sort(employeeList, new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				
				return emp1.getLastName().compareTo(emp2.getLastName());
			}
		});
		System.out.println(employeeList.toString());

		return employeeList;
	}

	// Crear un metodo que devuelva el numero de empleados de un departamento
	public int numEmployeeDepartment(int idDep) {
		return 0;
	}

	// Crear un método que devuelva la lista de departamentos sin repetir en un
	// ArrayList
	public ArrayList<Deparment> getDepartment() {
		return null;
	}

	// Crear un método que devuelva el sueldo medio de los empleados de un
	// departamento recibido por parámetro
	public int averagePaymentDepartment(int idDep) {
		return 0;
	}

}
