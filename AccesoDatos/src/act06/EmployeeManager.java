package act06;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeManager {

	public static final String path = "./resources/employee.bin";
	private static final ArrayList<Employee> employeeList = new ArrayList();

	static final String FILE = "./resources/emplyee.dat";

	// Crear un fichero con al menos 10 empleados de prueba de tres
	// departamentos diferentes

	public void dummy(int num) {
		ArrayList<Employee> lista = new ArrayList<Employee>();

		for (int i = 1; i <= num; i++) {
			lista.add(new Employee(i, "Goldfinger" + i, "Jhon" + i,
					"Director Adjunto" + i, "11/11/2011", 30000 + i, 5 + i,
					9 + i));
		}

		ObjectOutputStream streamOut = null;

		try {
			streamOut = new ObjectOutputStream(new FileOutputStream(FILE));
			for (Employee emp : lista) {
				streamOut.writeObject(emp);
			}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (streamOut != null) {
				try {
					streamOut.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

	}

	public void imprimirFicheroEmployee(String path) {
		ObjectInputStream streamIn = null;
		Employee emp;

		try {
			streamIn = new ObjectInputStream(new FileInputStream(path));

			try {
				while (true) {
					emp = (Employee) streamIn.readObject();
					System.out.println(emp);
				}
			} catch (EOFException e) {

			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e.getMessage());

		} catch (IOException e) {
			System.err.println("Error IO" + e.getMessage());

		} catch (ClassNotFoundException e) {
			System.err.println("Class not found: " + e.getMessage());

		} finally {
			if (streamIn != null) {
				try {
					streamIn.close();
				} catch (IOException e) {
					System.err.println("Error IO" + e.getMessage());

				}
			}
		}

	}

	// Load binary file in memory
	public void LoadFile() {
	}

	//
	/**
	 * @author Vladimir Bocancea
	 * 
	 *         crea un método que liste un empleado por su id
	 * 
	 * @return empleado por su id
	 */
	public Employee getEmployee(int idEmp) {
		ObjectInputStream streamIn = null;
		Employee emp = null;
		boolean noEncontrado = true;
		try {
			streamIn = new ObjectInputStream(new FileInputStream(FILE));

			try {
				while (noEncontrado) {
					emp = (Employee) streamIn.readObject();
					if (emp.getId() == idEmp)
						noEncontrado = false;
				}
			} catch (EOFException e) {

			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e.getMessage());

		} catch (IOException e) {
			System.err.println("Error IO" + e.getMessage());

		} catch (ClassNotFoundException e) {
			System.err.println("Class not found: " + e.getMessage());

		} finally {
			if (streamIn != null) {
				try {
					streamIn.close();
				} catch (IOException e) {
					System.err.println("Error IO" + e.getMessage());

				}
			}
		}
		if (!noEncontrado)
			return emp;
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
	 * @author Alejandro Acebedo Devuelve una lista con todos los empleados
	 *         ordenados
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
