package assignment13;

import java.util.Scanner;

/*
 4. Create multiple classes to imitate a bank structure with proper Exception Handling. For eg., 
 if the user tries to withdraw more than the balance, throw "InsufficientBalanceException" (created customly)
 */
class InsufficientException extends Exception {
	public InsufficientException(String msg) {
		super(msg);
	}
}

public class Qn4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InsufficientException {
		Bank b = new SavingAccount("IOb", "Ayikudy", "1378", "Akash", 123456789l);
		System.out.println("Cuurent Balance=" + b.balance);
		System.out.println("Enter the deposite Ammount");
		double deposite = sc.nextDouble();
		b.deposite(deposite);
		System.out.println("Cuurent Balance=" + b.balance);
		System.out.println("Enter the Withdraw Amount");
		double withdraw = sc.nextDouble();
		b.withdraw(withdraw);
		System.out.println("Cuurent Balance=" + b.balance);

	}
}

class Bank {
	String bankName;
	String branch;
	String ifsc;
	double balance = 1000;

	public Bank(String bankName, String branch, String ifsc) {
		super();
		this.bankName = bankName;
		this.branch = branch;
		this.ifsc = ifsc;
	}

	public void deposite(double d) {
		balance = balance + d;
		System.out.println("Deposite done successful");
	}

	public void withdraw(double w) throws InsufficientException {
		if (balance > w) {
			balance = balance - w;
			System.out.println("Withdrawable successful");
		} else {
			try {
				throw new InsufficientException("Insufficint_balance");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

}

class SavingAccount extends Bank {
	String accountHolderName;
	long contact;

	public SavingAccount(String bankName, String branch, String ifsc, String accountHolderName, long contact) {
		super(bankName, branch, ifsc);
		this.accountHolderName = accountHolderName;
		this.contact = contact;
	}

	public void getDetails() {
		System.out.println("\nBankName:" + bankName + "\nBranch:" + branch + "\nIFSC:" + ifsc + "\nAccountHolderName:"
				+ accountHolderName + "\ncontact:" + contact);
	}

}
