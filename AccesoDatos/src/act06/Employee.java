package act06;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

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
	private static int maxSize = 20;

	public Employee(int id, String lastName, String name, String job,
			Date regis_date, int salary, int commission, int depNumber) {
		
		df = new SimpleDateFormat("dd/MM/yyyy");
		this.id = id;
		this.lastName = lastName;
		this.name = name;
		this.job = job;
		this.regis_date = regis_date;
		this.salary = salary;
		this.commission = commission;
		this.depNumber = depNumber;
	}

	public Employee() {
		df = new SimpleDateFormat("dd/MM/yyyy");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		} else {
			System.err.println("Id erroneo");
			// this.id = 0;
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName.length() < maxSize) {
			this.lastName = lastName;
		} else {
			this.lastName = lastName.substring(0, maxSize);
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < maxSize) {
			this.name = name;
		} else {
			this.name = name.substring(0, maxSize);
		}
		// if (name.length() == 0){
		// this.name = " ";
		// }
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		if (name.length() < maxSize) {
			this.job = job;
		} else {
			this.job = job.substring(0, maxSize);
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

	public void setSalary(int salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.err.println("Salario negativo");
		}
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {

		if (commission > 0) {
			this.commission = commission;
		} else {
			System.err.println("Comisi—n negativo");
		}
	}

	public int getDepNumber() {
		return depNumber;
	}

	public void setDepNumber(int depNumber) {

		if (depNumber > 0) {
			this.depNumber = depNumber;
		} else {
			System.err.println("Nœmero de departamento negativo");
			// this.depNumber = 0;
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
		return "Employee:" + "ID =" + id + ", Last name =" + lastName
				+ ", Name =" + name + ", Job =" + job + ", Regist date ="
				+ this.getRegis_date() + ", Salary=" + salary + ", Commission ="
				+ commission + ", Departament number=" + depNumber + '}';
	}

}
