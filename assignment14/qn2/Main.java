package assignment14.qn2;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = new SalariedEmployee("Arumugam", 1, "Tenkasi", 1234543210l, "SalriedEmployee");
		emp1.getDetails();
		emp1.calculatePay(10000);
		System.out.println("--------------------");
		Employee emp2 = new HourlyEmployee("Akash", 2, "Tvl", 1234567890l, "HorlyEmployee");
		emp2.getDetails();
		emp2.calculatePay(5000);
	}

}
