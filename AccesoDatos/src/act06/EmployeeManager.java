package act06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeManager {

	public static final String path = "./resources/employee.bin";
	private static final ArrayList<Employee> employeeList = new ArrayList();

	/**
	 * Crear un fichero con al menos 10 empleados de prueba de tres
	 * departamentos diferentes
	 * 
	 * @author VLad
	 */
	public void dummy() {
		for (int i = 1; i < 10; i++) {
			employeeList.add(new Employee(i, "lastName" + i, "name" + i, "job"
					+ i, "regis_date" + i, 1000 + i, 5 + i, 10 + i));
		}
		RandomAccessFile streamOut = null;
		try {
			streamOut = new RandomAccessFile(path, "rw");
			for (Employee Employ : employeeList) {
				streamOut.writeInt(Employ.getId());
				streamOut.writeChars(Employ.getLastName());
				streamOut.writeChars(Employ.getName());
				streamOut.writeChars(Employ.getJob());
				streamOut.writeChars(Employ.getRegis_date());
				streamOut.writeFloat(Employ.getSalary());
				streamOut.writeInt(Employ.getCommission());
				streamOut.writeInt(Employ.getDepNumber());
			}
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Error E/S " + e.getMessage());
		} finally {
			if (streamOut != null)
				try {
					streamOut.close();
				} catch (IOException e) {
					System.err.println("Error E/S " + e.getMessage());
				}
		}
	}

	// Load binary file in memory
	public void LoadFile() {
	}

	/**
	 * crea un método que liste un empleado por su id.
	 * 
	 * @author VLad
	 * @param idEmp
	 * @return empleado
	 */

	public Employee getEmployee(int idEmp) {
		Employee empleado = null;
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getId() == idEmp) {
				empleado = employeeList.get(i);
				System.out.println("buscado empleado por id " + idEmp
						+ empleado);
			}
		}
		return empleado;
	}

	// Crear un método que modifique el salario de un empleado con el id que
	// recibe y el nuevo salario por parámetro

	public boolean getEmployee(int idEmp, float newSalary) {
		boolean hecho = false;

		for (int i = 0; i < employeeList.size(); i++) {

			if (employeeList.get(i).getId() == idEmp) {

				employeeList.get(i).setSalary(newSalary);

				if (employeeList.get(i).getSalary() == newSalary) {
					hecho = true;
				}
			}

		} // end for

		listEmployee(); // volver a listar opcion quitar

		return hecho;
	}

	/**
	 * Crear un método que elimine un empleado con el id que recibe por
	 * 
	 * @author VLad
	 * @param id
	 * @return deleted
	 */
	public boolean deleteEmployee(int id) {
		boolean deleted = false;
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getId() == id) {
				employeeList.remove(i);
				deleted = true;
			}
		}
		return deleted;
	}

	// Crear un método que añada un nuevo empleado recibiendo los datos por
	// parámetro
	public boolean addEmployee(Employee e) {
		employeeList.add(e);
		return false;
	}

	/**
	 * @author Alejandro Acebedo Devuelve una lista con todos los empleados
	 *         ordenados
	 * @param e
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

	// Crear un método que devuelva el número de empleados de un departamento
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
		int mediaSalario = 0;
		int sumadesalarios = 0;
		int contador = 0;
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getDepNumber() == idDep) {
				sumadesalarios += employeeList.get(i).getSalary();
				contador++;
			}
		}
		mediaSalario = sumadesalarios / contador;
		System.out
				.println("Sumasalarios= " + sumadesalarios
						+ " numero de gente " + contador + " su media ="
						+ mediaSalario);
		return mediaSalario;
	}

}