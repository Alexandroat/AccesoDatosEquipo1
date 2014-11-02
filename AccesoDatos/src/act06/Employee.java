package act06;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String lastName;
	private String name;
	private String job;
	private Date regis_date;
	private int salary;
	private int commission;
	private int depNumber;

	public Employee(int id, String lastName, String name, String job,
			Date regis_date, int salary, int commission, int depNumber) {
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

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName.length() < 20){
		this.lastName = lastName;
		} 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getRegis_date() {
		return regis_date;
	}

	public void setRegis_date(Date regis_date) {
		this.regis_date = regis_date;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public int getDepNumber() {
		return depNumber;
	}

	public void setDepNumber(int depNumber) {
		this.depNumber = depNumber;
	}

	

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
