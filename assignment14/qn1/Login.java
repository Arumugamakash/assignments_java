package assignment14.qn1;

public abstract class Login {
	public abstract boolean checkUser(String name, String password);
}

class CheckValidate extends Login {
	private AuthorizedUser user = new AuthorizedUser();

	public boolean checkUser(String name, String password) {
		if (name.equals(user.getName())) {
			if (password.equals(user.getPassword())) {
				return true;
			}
		}
		return false;
	}
}
