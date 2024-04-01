package assignment12.Qn3.transactions;

import java.time.LocalDate;

import assignment12.Qn3.members.Members;

public class Transactions {
	private int id;
	private Members member;
	private LocalDate issuedDate;

	public LocalDate getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Members getMember() {
		return member;
	}

	public void setMember(Members member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "Transactions [id = " + id + ", member = " + member + "\n issuedDate = " + issuedDate + "]";
	}

}
