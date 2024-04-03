package assignment14.qn2;

public abstract class Employee {

	String name;
	int id;
	String address;
	long contact;
	static String company = "Zoho";

	public Employee(String name, int id, String address, long contact) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.contact = contact;
	}

	public abstract void calculatePay(double sal);

	public void getDetails() {
		System.out.println("\nEmployeeName =" + name + "\nEmployeeId =" + id + "\nEmployeeAddress =" + address
				+ "\nEmployeeContact =" + contact + "\nCompanyName =" + company);
	}

}
