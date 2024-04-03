package assignment14.qn2;

public class HourlyEmployee extends Employee{

	String empType;

	public HourlyEmployee(String name, int id, String address, long contact, String empType) {
		super(name, id, address, contact);
		this.empType = empType;
	}

	public void getDetails() {
		System.out.println("\nEmployeeName =" + name + "\nEmployeeId =" + id + "\nEmployeeAddress =" + address
				+ "\nEmployeeContact =" + contact + "\nEmployeeType =" + empType+"\nECompany ="+company);
	}
	@Override
	public void calculatePay(double sal) {
		double amount=sal*12;
		System.out.println("Annual Salary of the Employee = "+amount);
	}

}
