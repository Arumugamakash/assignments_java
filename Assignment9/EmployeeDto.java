package Assignment9;

class EmployeeDto{
	private String EmployeeName;
	private int id;
	private double salary;
	private String role;
	private long contact;
	private static String company = "IndianCements";

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getCompany() {
		return company;
	}

	public void getDetails() {
		System.out.println("\n\tEmployee Details :\n" + "\nEmployee Name:-" + getEmployeeName() + "\nEmployee Id:-"
				+ getId() + "\nEmployee Salary:-" + getSalary() + "\nEmployee Role:-" + getRole()
				+ "\nEmployee Contact:-" + getContact() + "\nEmployee CompanyName:-" + getCompany());
	}
}
