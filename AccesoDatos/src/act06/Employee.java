package act06;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * 
 * @author Alejandro Acebedo
 * 
 */
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String lastName;
	private String name;
	private String job;
	private Date regis_date;
	private float salary;
	private int commission;
	private int depNumber;
	private SimpleDateFormat df;
	private static final int maxSize = 20;

	// ///////////////Constructor con parametros////////
	public Employee(int id, String lastName, String name, String job,
			String regis_date, int salary, int commission, int depNumber) {

		df = new SimpleDateFormat("dd/MM/yyyy");
		this.setId(id);
		this.setLastName(lastName);
		this.setName(name);
		this.setJob(job);
		this.setRegis_date(regis_date);
		this.setSalary(salary);
		this.setCommission(commission);
		this.setDepNumber(depNumber);
	}

	// //////////////Constructor sin parametros////////
	public Employee() {
		df = new SimpleDateFormat("dd/MM/yyyy");
	}

	// /////////Getters y setters////////////////////
	public int getId() {
		return id;
	}

	// La comision ha de ser mayor que 0
	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		} else {
			System.err.println("Id erroneo");
			this.id = 0;
		}
	}

	public String getLastName() {
		return lastName;
	}

	/*
	 * Si el apellido supera los 20 caracteres se quedara con los 20 primeros.
	 */
	public void setLastName(String lastName) {
		if (lastName.length() < maxSize) {
			this.lastName = lastName;
		} else {
			this.lastName = lastName.substring(0, maxSize);
		}
		if (lastName.length() == 0) {
			this.lastName = " ";
		}

	}

	public String getName() {
		return name;
	}

	/*
	 * Si el nombre supera los 20 caracteres se quedara con los 20 primeros.
	 */
	public void setName(String name) {
		if (name.length() < maxSize) {
			this.name = name;
		} else {
			this.name = name.substring(0, maxSize);
		}
		if (name.length() == 0) {
			this.name = " ";
		}
	}

	public String getJob() {
		return job;
	}

	/*
	 * Si el trabajo supera los 20 caracteres se quedara con los 20 primeros.
	 */
	public void setJob(String job) {
		if (job.length() < maxSize) {
			this.job = job;
		} else {
			this.job = job.substring(0, maxSize);
		}
		if (job.length() == 0) {
			this.job = " ";
		}
	}

	public String getRegis_date() {

		return df.format(regis_date).toString();
	}

	public void setRegis_date(String regis_date) {

		try {
			this.regis_date = df.parse(regis_date);
		} catch (ParseException e) {

			this.regis_date = new Date();
		}

	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		if (salary >= 0) {
			this.salary = salary;
		} else {
			System.err.println("Salario negativo");
			this.salary = 0;
		}
	}

	public int getCommission() {
		return commission;
	}

	// La comision ha de ser mayor o igual que 0
	public void setCommission(int commission) {

		if (commission >= 0) {
			this.commission = commission;
		} else {
			System.err.println("Comisi—n negativo");
			this.commission = 0;
		}
	}

	public int getDepNumber() {
		return depNumber;
	}

	// El numero de departamento ha de ser mayor o igual que 0
	public void setDepNumber(int depNumber) {

		if (depNumber >= 0) {
			this.depNumber = depNumber;
		} else {
			System.err.println("Nœmero de departamento negativo");
			this.depNumber = 0;
		}
	}

	@Override
	public boolean equals(Object obj) {

		Employee emp = (Employee) obj;

		if (this.id == emp.id && this.lastName.equals(emp.lastName)
				&& this.name.equals(emp.name) && this.job.equals(emp.job)
				&& this.regis_date.equals(emp.regis_date)
				&& this.salary == emp.salary
				&& this.commission == emp.commission
				&& this.depNumber == emp.depNumber) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return "Employee:" + "ID = " + id + ", Last name = " + lastName
				+ ", Name = " + name + ", Job = " + job + ", Regist date = "
				+ this.getRegis_date() + ", Salary = " + salary
				+ ", Commission = " + commission + ", Departament number = "
				+ depNumber + '\n';
	}

}
