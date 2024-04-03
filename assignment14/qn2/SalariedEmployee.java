package assignment14.qn2;

public class SalariedEmployee extends Employee{
	String empType;
	double salary;
	
	
	public SalariedEmployee(String name, int id, String address, long contact, String empType) {
		super(name, id, address, contact);
		this.empType = empType;
	}


	@Override
	public void calculatePay(double sal) {
		double amount=sal*12;
		System.out.println("Annual Salary of the Employee = "+amount);
	}

	
}
