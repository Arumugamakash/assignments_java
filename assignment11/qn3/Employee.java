package assignment11.qn3;

public class Employee {
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
	public void getDetails() {
		System.out.println("\nEmployeeName ="+name+"\nEmployeeId ="+id+"\nEmployeeAddress ="+address+"\nEmployeeContact ="+contact+"\nCompanyName ="+company);
	}

}
