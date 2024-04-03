package assignment13;

//2. Create a custom Exception by yourself and try throwing and catching the same.
class MyException extends Exception {
	public MyException() {
		System.out.println("My Exception");
	}
}

public class Qn2 {
	public static void m1() throws Exception {
		throw new MyException();
	}

	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			e.getMessage();
		}
	}

}