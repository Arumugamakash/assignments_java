package assignment11.qn3;

public class SalariedEmployee extends Employee {
	String empType;

	public SalariedEmployee(String name, int id, String address, long contact, String empType) {
		super(name, id, address, contact);
		this.empType = empType;
	}

	public void getDetails() {
		System.out.println("\nEmployeeName =" + name + "\nEmployeeId =" + id + "\nEmployeeAddress =" + address
				+ "\nEmployeeContact =" + contact + "\nEmployeeType =" + empType + "\nECompany =" + company);
	}
}
